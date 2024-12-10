package ru.showroom;

public class Commisioncars {
    private String model;
    private String owner;
    private String commissionFee;
    private String price;

    public Commisioncars(String model, String owner, String commissionFee, String price) {
        this.model = model;
        this.owner = owner;
        this.commissionFee = commissionFee;
        this.price = price;
    }


    public String getModel() {
        return model;
    }

    public String getOwner() {
        return owner;
    }

    public String getCommissionFee() {
        return commissionFee;
    }

    public String getPrice() {
        return price;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public void setCommissionFee(String commissionFee) {
        this.commissionFee = commissionFee;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getDetails() {
    return "\n Commission Car - Model: " + model + "\n"+" Owner: " + owner + "\n" + " Commission Fee: $" + commissionFee + "\n" +" Price: " + price;
}
}