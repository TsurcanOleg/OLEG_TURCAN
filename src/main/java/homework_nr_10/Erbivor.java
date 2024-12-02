package homework_nr_10;

public abstract class Erbivor {

    String nameAnimal;

    public Erbivor(String nameAnimal) {
        this.nameAnimal = nameAnimal;
    }

    public abstract void erbivorAnimal();

    public void animalSound(){
        System.out.println("The elephant say: thruuuuuu...");

    }
}
