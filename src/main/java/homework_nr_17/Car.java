package homework_nr_17;

import java.util.List;

public class Car extends Vehicle {

    String fuelType;

    public Car(String model, int year, String fuelType) {
        super(model, year);
        this.fuelType = fuelType;
    }

    public void copyVehicle(List<? extends Vehicle> source, List<? super Vehicle> destination){
        for (Vehicle vehicle : source){
            destination.add(vehicle);
        }
    }

    @Override
    public String toString() {
        return "Car{" +
                "fuelType='" + fuelType + '\'' +
                '}';
    }
}
