package com.example.limitserver.models;

public class Limit {
    private Long maximum;
    private Long minimum;

    public Limit(Long maximum, Long minimum) {
        super();
        this.maximum = maximum;
        this.minimum = minimum;
    }

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
