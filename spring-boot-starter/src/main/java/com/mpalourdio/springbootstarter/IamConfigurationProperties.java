package com.mpalourdio.springbootstarter;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;

@Getter
@Setter
@ConfigurationProperties("iam")
public class IamConfigurationProperties {


    @Getter
    @Setter
    public static class Security {

        private boolean autoconfigure = true;
        private boolean disableCsrf = false;
    }
}
