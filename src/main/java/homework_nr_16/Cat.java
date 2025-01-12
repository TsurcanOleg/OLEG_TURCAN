package homework_nr_16;

public class Cat extends Animal{

    private String Cat;

    public Cat(String animal, String cat) {
        super(animal);
        Cat = cat;
    }

    public void makeSound(){
        System.out.println("Meow");
    }
}
