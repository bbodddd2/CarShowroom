package ru.showroom;

public class Newcar {
    private String model;
    private String year;
    private String mileage;
    private String state;
    private String price;
    public Newcar(String model, String year, String mileage, String state, String price){
        this.model = model;
        this.year = year;
        this.mileage = mileage;
        this.state = state;
        this.price = price;

    }
    public String getModel(){
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
    public void setPrice(String price){
        this.price = price;
    }
    public String getDetails(){
        return "\n model: " + model +"\n" + " year: " + year +"\n" + " mileage : " + mileage +"\n" + " state : " + state + "\n" +   " price : " + price;
    }
}
