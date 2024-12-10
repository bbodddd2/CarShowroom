package ru.showroom;

public class Usedcar {
    private String model;
    private String year;
    private String mileage;
    private String state;
    private String price;
    private String numberofowners;

    public Usedcar(String model, String year, String mileage, String state, String price, String numberofowners) {
        this.model = model;
        this.year = year;
        this.mileage = mileage;
        this.state = state;
        this.price = price;
        this.numberofowners = numberofowners;

    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getMileage() {
        return mileage;
    }

    public void setMileage(String mileage) {
        this.mileage = mileage;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getNumberofowners() {
        return numberofowners;
    }

    public void setNumberofowners(String numberofowners) {
        this.numberofowners = numberofowners;
    }
    public String getDetails(){
        return "\n Model : " + model+   "\n" + " Year: " + year + "\n" +" Mileage: " + mileage + "\n" + " State: " + state + "\n" + " Price RUB: " + price + "\n" + " Number of owner: " + numberofowners + "\n";
    }
}

