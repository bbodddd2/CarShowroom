package ru.showroom;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        Usedcar usedcar = new Usedcar("BMW X5", "2019", "25000", "Stage2", "5750000", "3");
        System.out.println("\n========= Used Car Details =========");
        System.out.println(usedcar.getDetails());

        ElectricCar electricCar = new ElectricCar("Tesla Cybertruck", "2022", "1000", "Good", "22000000", "1", 78, 700);
        System.out.println("\n========= Electric Car Details =========");
        System.out.println(electricCar.getDetails());

        DieselCar dieselCar = new DieselCar("Range Rover", "2021", "10000", "scuffs on the body", "22000000", "1", 6000, 10.1);
        System.out.println("\n========= Diesel Car Details =========");
        System.out.println(dieselCar.getDetails());


        Commisioncars commisioncars = new Commisioncars("Toyota Rav4", "1", "15000", "2700000");
        System.out.println("\n========= Commision Car Details =========");
        System.out.println(commisioncars.getDetails());

        Newcar newcar = new Newcar("Lotus Eletre", "2024", "0", "New", "12500000");
        System.out.println("\n========= New Car Details =========");
        System.out.println(newcar.getDetails());
    }

}
