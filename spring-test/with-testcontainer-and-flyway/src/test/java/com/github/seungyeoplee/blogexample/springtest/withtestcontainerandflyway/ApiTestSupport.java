package com.github.seungyeoplee.blogexample.springtest.withtestcontainerandflyway;

import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.testcontainers.service.connection.ServiceConnection;
import org.testcontainers.containers.MariaDBContainer;

import java.util.Map;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public abstract class ApiTestSupport {

    @ServiceConnection
    protected static final MariaDBContainer mariaDBContainer = new MariaDBContainer<>("mariadb:10.10")
            .withDatabaseName("example")
            .withUsername("user")
            .withPassword("userPw")
            .withConfigurationOverride("db/conf")
            .withTmpFs(Map.of("/var/lib/mysql", "rw"));

    static {
        mariaDBContainer.start();
    }
}
