package ru.showroom;

public class ElectricCar extends Usedcar {
    private int batteryCapasity; // обьем в куб см
    private int range; // расход
    public ElectricCar(String model, String year, String mileage, String state, String price, String numberofowners, int batteryCapasity, int range){
        super(model, year, mileage, state, price, numberofowners);
        this.batteryCapasity = batteryCapasity;
        this.range = range;
    }
    public int getBatteryCapasity(){
        return batteryCapasity;
    }

    public void setBatteryCapasity(int batteryCapasity) {
        this.batteryCapasity = batteryCapasity;
    }

    public int getRange() {
        return range;
    }

    public void setRange(int range) {
        this.range = range;
    }
    public String getDetails(){
        return super.getDetails()  + "Batterycapacity: " + batteryCapasity +" kwh\n " + "Range: " + range + "km";
    }
}
