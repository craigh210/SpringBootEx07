package com.cwhcode.springbootex07;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class Car {

    @NotNull
    @Min(1)
    private long id;

    @NotNull
    @Size(min=3, max=20)
    private String brand;

    @NotNull
    @Size(min=1, max=20)
    private String model;

    @NotNull
    @Size(min=3, max=20)
    private String style;

    @NotNull
    @Size(min=3, max=50)
    private String description;

    public Car() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getStyle() {
        return style;
    }

    public void setStyle(String style) {
        this.style = style;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
