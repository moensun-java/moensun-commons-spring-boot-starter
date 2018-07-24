package com.moensun.commons.autoconfigure;

import com.moensun.commons.spring.resource.MSResourceBundle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Created by Bane.Shi.
 * Copyright MoenSun
 * User: Bane.Shi
 * Date: 2017/7/30
 * Time: 13:10
 */
@Configuration
@EnableConfigurationProperties(
        value = {
                CommonsProperties.class
        }
)
public class AutoConfiguration {
    @Autowired
    private CommonsProperties commonsProperties;

    @Bean
    @ConditionalOnMissingBean
    public MSResourceBundle msResourceBundle(){
        MSResourceBundle  msResourceBundle = new MSResourceBundle();
        msResourceBundle.setResourceBundle(commonsProperties.getResourcePath());
        msResourceBundle.setResourceBundles(commonsProperties.getResourcePaths());
        return msResourceBundle;
    }

}
