package com.company;

public class Main {

    public static void main(String[] args) {
        Car mazda3 = new Car();
        mazda3.setManufacturer("MazdaManufacturer");
        mazda3.setMaxSpeed(210);
        System.out.println(mazda3.getManufacturer());

        Car hondaAccord = new Car();
        hondaAccord.setManufacturer("HondaManufacturer");
        hondaAccord.setMaxSpeed(260);
        System.out.println(hondaAccord.getManufacturer());
        System.out.println(mazda3.getManufacturer());

        Car[] cars = new Car[2];
        cars[0] = mazda3;
        cars[1] = hondaAccord;

        carSet(cars);


    }

    public static void carSet (Car[] cars){
        for(int i=0; i<=cars.length-1; i++){
           int maxSpeed = cars[0].getMaxSpeed();
           if (cars[i].getMaxSpeed() < cars[i+1].getMaxSpeed())
               maxSpeed = cars[i+1].getMaxSpeed();
           else maxSpeed = cars[i].getMaxSpeed();
           System.out.println(maxSpeed);
           }
        }
}
