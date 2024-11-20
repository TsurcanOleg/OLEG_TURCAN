package homework_nr_7.inheritans;

public class Motorcycle extends Vehicle{

    int engineCapacity;
    boolean hasABS;

    public Motorcycle(String brand, String model, int year, int engineCapacity, boolean hasABS) {
        super(brand, model, year);
        this.engineCapacity = engineCapacity;
        this.hasABS = hasABS;
    }
    public void displayInfo(){
        System.out.println("Brand " + getBrand());
        System.out.println("Model " + getModel());
        System.out.println("Year " + getYear());
        System.out.println("Engine capacity " + engineCapacity);
        System.out.println("Has ABS " + hasABS);
    }
}
