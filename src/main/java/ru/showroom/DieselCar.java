package ru.showroom;

public class DieselCar extends Usedcar {
    private int engine;
    private double consumption;
    public DieselCar(String model, String year, String mileage, String state, String price, String numberofowners, int engine, double consumption){
        super(model, year, mileage, state, price, numberofowners);
        this.consumption = consumption;
        this.engine = engine;

    }

    public int getEngine() {
        return engine;
    }

    public void setEngine(int engine) {
        this.engine = engine;
    }

    public double getConsumption() {
        return consumption;
    }

    public void setConsumption(double consumption) {
        this.consumption = consumption;
    }
    public String getDetails(){
        return super.getDetails() +   "Engine: " + engine + " liter" + "\n" + "Consumption: " + consumption + " L/100km";
    }
}
