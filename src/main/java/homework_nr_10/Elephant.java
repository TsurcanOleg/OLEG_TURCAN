package homework_nr_10;

public class Elephant extends Erbivor implements AnimalInterface {

    String typesOfElefant;
    Integer weight;
    Integer lifeExpectancy;

    public Elephant(String nameAnimal, String typesOfElefant, Integer weight, Integer lifeExpectancy) {
        super(nameAnimal);
        this.typesOfElefant = typesOfElefant;
        this.weight = weight;
        this.lifeExpectancy = lifeExpectancy;
    }

    @Override
    public void run() {
        System.out.println("The elephant can runing...");
    }

    @Override
    public void walks() {
        System.out.println("The elephant can walk....");
    }

    @Override
    public void tactileContact() {
        System.out.println("The elephant great each other ....");
    }

    @Override
    public void diet() {
        System.out.println("Diet depends on the region of their habitat ...");
    }

    @Override
    public void trumpeting() {
        AnimalInterface.super.trumpeting();

    }

    @Override
    public void erbivorAnimal() {
        System.out.println("The elephant is erbivor..");
    }
}
