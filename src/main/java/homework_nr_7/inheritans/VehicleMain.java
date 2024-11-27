package homework_nr_7.inheritans;

public class VehicleMain {
    public static void main(String[] args) {
        Car c1 = new Car("Tesla", "Model S", 2023, 4, true);
        Motorcycle m1 = new Motorcycle("Yamaha", "YZF-R3", 2021, 321, true);


c1.displayInfo();
        System.out.println("_____________");
m1.displayInfo();

    }
}
