package ru.netology.demo;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.resttestclient.autoconfigure.AutoConfigureTestRestTemplate;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.resttestclient.TestRestTemplate;
import org.springframework.http.ResponseEntity;

import org.testcontainers.containers.GenericContainer;
import org.testcontainers.utility.DockerImageName;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest(
        webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT
)
@AutoConfigureTestRestTemplate
class DemoApplicationTests {
/*
    @Autowired
    private TestRestTemplate restTemplate;

    private static final GenericContainer<?> devApp =
            new GenericContainer<>(DockerImageName.parse("devapp"))
                    .withExposedPorts(8080);

    private static final GenericContainer<?> prodApp =
            new GenericContainer<>(DockerImageName.parse("prodapp"))
                    .withExposedPorts(8081);

    @BeforeAll
    static void setUp() {
        devApp.start();
        prodApp.start();
    }

    @Test
    void devProfileTest() {

        ResponseEntity<String> response =
                restTemplate.getForEntity(
                        "http://" + devApp.getHost() + ":"
                                + devApp.getMappedPort(8080)
                                + "/profile",
                        String.class
                );

        assertEquals(
                "Current profile is dev",
                response.getBody()
        );
    }

    @Test
    void productionProfileTest() {

        ResponseEntity<String> response =
                restTemplate.getForEntity(
                        "http://" + prodApp.getHost() + ":"
                                + prodApp.getMappedPort(8081)
                                + "/profile",
                        String.class
                );

        assertEquals(
                "Current profile is production",
                response.getBody()
        );
    }

    @AfterAll
    static void tearDown() {
        devApp.stop();
        prodApp.stop();
    }
 */
}