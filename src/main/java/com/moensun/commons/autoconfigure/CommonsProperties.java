package com.moensun.commons.autoconfigure;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * Created by Bane.Shi.
 * Copyright MoenSun
 * User: Bane.Shi
 * Date: 2017/7/30
 * Time: 13:18
 */
@ConfigurationProperties(
        prefix = "moensun.commons"
)
public class CommonsProperties {
    private String resourcePath;

    private String[] resourcePaths;

    public String getResourcePath() {
        return resourcePath;
    }

    public void setResourcePath(String resourcePath) {
        this.resourcePath = resourcePath;
    }

    public String[] getResourcePaths() {
        return resourcePaths;
    }

    public void setResourcePaths(String[] resourcePaths) {
        this.resourcePaths = resourcePaths;
    }
}
