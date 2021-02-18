package data;

public class Telephone {
    private String brand;
    private String model;
    private int batteryCapacity;
    private int chargeLevel;

    public Telephone(String brand, String model, int batteryCapacity, int chargeLevel) {
        this.brand = brand;
        this.model = model;
        this.batteryCapacity = batteryCapacity;
        this.chargeLevel = chargeLevel;
    }
    public void getInfo() {
        System.out.println(getBrand()
                + " " + getModel()
                + ", bateria: " + getBatteryCapacity() +"mAh"
                + ", poziom naładowania: " + getChargeLevel() + "%");
    }
    public void getChargeInfo() {
        System.out.println("Poziom naladowania baterii: " + getChargeLevel() + "%");
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
    public int getBatteryCapacity() {
        return batteryCapacity;
    }
    public void setBatteryCapacity(int batteryCapacity) {
        this.batteryCapacity = batteryCapacity;
    }
    public int getChargeLevel() {
        return chargeLevel;
    }
    public void setChargeLevel(int chargeLevel) {
        this.chargeLevel = chargeLevel;
    }
}