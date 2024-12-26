package homework_nr_17;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {


        Vehicle v1 = new Vehicle("Tesla", 2018);
        Vehicle v2 = new Vehicle("Ford", 2021);
        Vehicle v3 = new Vehicle("Toyota", 2007);
        Vehicle v4 = new Vehicle("BMW", 2022);
        Vehicle v5 = new Vehicle("Mercedes", 2017);
        Vehicle v6 = new Vehicle("Lexus", 2024);
        Vehicle v7 = new Vehicle("Ford", 1998);


Storage<Vehicle> s1 = new Storage<>("Garage");
Storage<Vehicle> s2 = new Storage<>("Parking");
Storage<Vehicle> s3 = new Storage<>("Garage2");

s1.addItem(v1);
s1.addItem(v2);
s1.addItem(v3);
s2.addItem(v5);
s2.addItem(v6);
s3.addItem(v4);
s3.addItem(v7);

        System.out.println(s1.getItems());
        System.out.println(s2.getItems());
        System.out.println(s3.getItems());



    }
}
