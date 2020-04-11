package com.project.vehicleid;

public class Car {

    private String vin;
    private String manufacturer;
    private String model;

    public Car(String vin, String manufacturer, String model) {
        this.vin = vin;
        this.manufacturer = manufacturer;
        this.model = model;
    }

    public String getVin() {
        return vin;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public String getModel() {
        return model;
    }

}
