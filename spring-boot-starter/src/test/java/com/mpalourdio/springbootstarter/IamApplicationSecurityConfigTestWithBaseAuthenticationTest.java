package com.mpalourdio.springbootstarter;

import org.junit.jupiter.api.Test;
import org.springframework.boot.autoconfigure.AutoConfigurations;
import org.springframework.boot.test.context.runner.ApplicationContextRunner;

import static org.assertj.core.api.Assertions.assertThat;

class IamApplicationSecurityConfigTestWithBaseAuthenticationTest {

    private static final String IAM_SECURITY_AUTOCONFIGURE_PROPERTY = "iam.security.autoconfigure";
    private final ApplicationContextRunner contextRunner = new ApplicationContextRunner()
            .withConfiguration(AutoConfigurations.of(
                    IamApplicationSecurityConfig.class,
                    IamConfigurationProperties.class
            ));

    @Test
    void testCreatesIamApplicationSecurityConfigBeanOnPropertyDetection() {
        contextRunner
                .withPropertyValues(IAM_SECURITY_AUTOCONFIGURE_PROPERTY + ":true")
                .run(context -> assertThat(context).hasSingleBean(IamApplicationSecurityConfig.class));
    }
}
