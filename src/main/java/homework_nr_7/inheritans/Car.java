package homework_nr_7.inheritans;

public class Car extends Vehicle{

    int numberOfDoors;
    boolean isElectric;

    public Car(String brand, String model, int year, int numberOfDoors, boolean isElectric) {
        super(brand, model, year);
        this.numberOfDoors = numberOfDoors;
        this.isElectric = isElectric;
    }

    public void displayInfo(){
        System.out.println("Brand " + getBrand());
        System.out.println("Model " + getModel());
        System.out.println("Year " + getYear());
        System.out.println("Number of doors " + numberOfDoors);
        System.out.println("Is electric " + isElectric);
    }

}
