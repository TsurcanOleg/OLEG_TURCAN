package homework_nr_8;

import java.sql.SQLOutput;

public abstract class Appliance {


    String brand;
    int power;

    public void turnOn(){

    }

    public Appliance(String brand, int power) {
        this.brand = brand;
        this.power = power;
    }

    public void displayInfo(){
        System.out.println("Brand - " + brand);
        System.out.println("Power - " + power);
        turnOn();
    }
}
