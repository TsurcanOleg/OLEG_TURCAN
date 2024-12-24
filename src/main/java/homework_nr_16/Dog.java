package homework_nr_16;

public class Dog extends Animal{

    private String Dog;

    public String getDog() {
        return Dog;
    }

    public Dog(String animal, String dog) {
        super(animal);
        this.Dog = dog;


    }

    public void makeSound(){
        System.out.println("Woof Woof");

    }
}
