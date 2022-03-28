package ru.tn.courses.ofefelov.v1.task1.subtask2;

public class Computer {
    private String name;

    private String CPU;

    private String RAM;

    private String harddrive;

    private double price;

    private Type type;

    public Computer(String name, String CPU, String RAM, String harddrive, double price, Type type) {
        this.name = name;
        this.CPU = CPU;
        this.RAM = RAM;
        this.harddrive = harddrive;
        this.price = price;
        this.type = type;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCPU() {
        return CPU;
    }

    public void setCPU(String CPU) {
        this.CPU = CPU;
    }

    public String getRAM() {
        return RAM;
    }

    public void setRAM(String RAM) {
        this.RAM = RAM;
    }

    public String getHarddrive() {
        return harddrive;
    }

    public void setHarddrive(String harddrive) {
        this.harddrive = harddrive;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
