package com.mritunjay.week1Introduction.IntroductionToSpringBoot;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

/**
 * Production database implementation.
 * This bean is only loaded when `deploy.env=production` in properties.
 */
@Component
@ConditionalOnProperty(name = "deploy.env", havingValue = "production")
public class ProdDB implements DB {

    /**
     * Returns mock data for the production environment.
     *
     * @return "Prod Data" string.
     */
    @Override
    public String getData() {
        return "Prod Data";
    }
}
