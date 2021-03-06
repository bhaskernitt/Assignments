package com.bhaskerstreet.microservice_1.test;

import com.bhaskerstreet.microservice_1.MicroService1Application;
import com.bhaskerstreet.microservice_1.configuration.AppConfig;
import com.bhaskerstreet.microservice_1.global.TestGlobalConstants;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

@ActiveProfiles(TestGlobalConstants.TEST_PROFILE)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.DEFINED_PORT, classes = MicroService1Application.class, properties = TestGlobalConstants.PORT_PROPERTY)
public class TestConfigs {


    @Test
    public void testAppConfig() {
        Assertions.assertEquals(AppConfig.getProperty("local.server.port"), "9091");
    }
}
