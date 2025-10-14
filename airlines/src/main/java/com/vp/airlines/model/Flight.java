package com.vp.airlines.model;

public class Flight {

    private static int nextId = 0; // counter for unique IDs

    private int id;
    private String name;
    private String code;
    private int fuelCapacity;

    public Flight() {
    }

    public Flight(String name, String code, int fuelCapacity) {
        this.id = nextId++;
        this.name = name;
        this.code = code;
        this.fuelCapacity = fuelCapacity;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public int getFuelCapacity() {
        return fuelCapacity;
    }

    public void setFuelCapacity(int fuelCapacity) {
        this.fuelCapacity = fuelCapacity;
    }

    @Override
    public String toString() {
        return "Flight{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", code='" + code + '\'' +
                ", fuelCapacity=" + fuelCapacity +
                '}';
    }
}
