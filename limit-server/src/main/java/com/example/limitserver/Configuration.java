package com.example.limitserver;
import org.springframework.stereotype.Component;
import org.springframework.boot.context.properties.ConfigurationProperties;

@Component
@ConfigurationProperties("limit")
public class Configuration {
    private Long maximum;
    private Long minimum;

    public Long getMaximum() {
        return maximum;
    }
     
    // setter của thuộc tính x
    public void setMaximum(Long maximum) {
        this.maximum = maximum;
    }
     
     
    // getter của thuộc tính y
    public Long getMinimum() {
        return minimum;
    }
     
    // setter của thuộc tính y
    public void setMinimum(Long minimum) {
        this.minimum = minimum;
    }
}
