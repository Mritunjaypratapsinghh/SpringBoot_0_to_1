package com.mritunjay.week1Introduction.IntroductionToSpringBoot;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

/**
 * Development database implementation.
 * This bean is only loaded when `deploy.env=development` in properties.
 */
@Component
@ConditionalOnProperty(name = "deploy.env", havingValue = "development")
public class DevDB implements DB {

    /**
     * Returns mock data for the development environment.
     *
     * @return "Dev Data" string.
     */
    @Override
    public String getData() {
        return "Dev Data";
    }
}
