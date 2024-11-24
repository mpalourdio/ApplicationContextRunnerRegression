package com.mpalourdio.springbootstarter;

import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;

@AutoConfiguration
@EnableWebSecurity
@ConditionalOnProperty(prefix = "iam", name = "security.autoconfigure", havingValue = "true", matchIfMissing = true)
@EnableConfigurationProperties(IamConfigurationProperties.class)
public class IamApplicationSecurityConfig {

    private final IamConfigurationProperties iamConfigurationProperties;

    public IamApplicationSecurityConfig(IamConfigurationProperties iamConfigurationProperties) {
        this.iamConfigurationProperties = iamConfigurationProperties;
    }
}
