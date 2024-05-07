.PHONY:init
init:
	mkdir my-module
	(cd my-module && dagger init --sdk go --source . --name my-module)

.PHONY:functions
functions:
	(cd my-module && dagger functions)

.PHONY:hello
hello:
	(cd my-module && dagger call hello --name "World")

.PHONY:git-clone
git-clone:
	(cd my-module && dagger call git-clone --url=https://github.com/seungyeop-lee/daggerverse.git -o daggerverse)

.PHONY:ssh-install
ssh-install:
	(cd my-module && dagger install github.com/seungyeop-lee/daggerverse/ssh)

.PHONY:up-sshd
up-sshd:
	(cd sshd && docker compose up -d)

.PHONY:down-sshd
down-sshd:
	(cd sshd && docker compose down)

.PHONY:local-ssh-command
local-ssh-command:
	(cd my-module && dagger call -v local-ssh-command --sshd=tcp://localhost:22 --command="ls -al")

.PHONY:ssh-command
ssh-command:
	(cd my-module && dagger call -v ssh-command --address="user@your_server_address" --password="user_password" --command="ls -al")
