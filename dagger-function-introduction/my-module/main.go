package main

import (
	"context"
	"fmt"
)

type MyModule struct{}

func (m *MyModule) Hello(name string) string {
	return fmt.Sprintf("Hello, %s!", name)
}

func (m *MyModule) GitClone(url string) *Directory {
	return dag.Git(url).Branch("main").Tree()
}

func (m *MyModule) LocalSshCommand(
	ctx context.Context,
	sshd *Service,
	command string,
) (string, error) {
	output, err := dag.SSH().
		Config("admin@sshd", SSHConfigOpts{
			BaseCtr: dag.SSH().BaseContainer().WithServiceBinding("sshd", sshd),
		}).
		WithPassword(dag.SetSecret("password", "admin")).
		Command(command).
		Stdout(ctx)
	if err != nil {
		return "", err
	}

	return output, nil
}

func (m *MyModule) SshCommand(
	ctx context.Context,
	address string,
	password string,
	command string,
) (string, error) {
	output, err := dag.SSH().
		Config(address).
		WithPassword(dag.SetSecret("password", password)).
		Command(command).
		Stdout(ctx)
	if err != nil {
		return "", err
	}

	return output, nil
}
