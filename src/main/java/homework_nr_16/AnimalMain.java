package homework_nr_16;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;

public class AnimalMain {
    public static void main(String[] args) {

        List<Animal> animals = new ArrayList<>();
        animals.add(new Dog ("Dog", "Barboss"));
        animals.add(new Cat("Cat", "Barsick"));


        AnimalShelter.makeSoundAll(animals);


        List<Dog> moreDogs = new ArrayList<>();
        AnimalShelter.addDog(moreDogs, new Dog("Dog", "Boss"));
        AnimalShelter.addDog(moreDogs, new Dog("Dog", "MegaMind"));

        AnimalShelter.makeSoundAll(moreDogs);





    }
}