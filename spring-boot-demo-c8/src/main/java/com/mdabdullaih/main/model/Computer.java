package com.mdabdullaih.main.model;

public class Computer {

//    @Getter
//    @Setter
    private String brand;
    private String model;
    private Integer ramCapacity;
    private Integer storageCapacity;
    private Float cpuClockSpeed;

    public Computer() {
        System.out.println("No Usages:Computer Constructor");
    }

    public Computer(String brand, String model, Integer ramCapacity, Integer storageCapacity, Float cpuClockSpeed) {
        this.brand = brand;
        this.model = model;
        this.ramCapacity = ramCapacity;
        this.storageCapacity = storageCapacity;
        this.cpuClockSpeed = cpuClockSpeed;
        System.out.println("All Usages:Computer Constructor");
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public Integer getRamCapacity() {
        return ramCapacity;
    }

    public void setRamCapacity(Integer ramCapacity) {
        this.ramCapacity = ramCapacity;
    }

    public Integer getStorageCapacity() {
        return storageCapacity;
    }

    public void setStorageCapacity(Integer storageCapacity) {
        this.storageCapacity = storageCapacity;
    }

    public Float getCpuClockSpeed() {
        return cpuClockSpeed;
    }

    public void setCpuClockSpeed(Float cpuClockSpeed) {
        this.cpuClockSpeed = cpuClockSpeed;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", ramCapacity=" + ramCapacity +
                ", storageCapacity=" + storageCapacity +
                ", cpuClockSpeed=" + cpuClockSpeed +
                '}';
    }
}
