package com.ducafecat.config.comm;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix="other")
@PropertySource(factory = YamlPropertySourceFactory.class, value = "classpath:other.yaml")
public class OtherProperties {
    private String title;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
