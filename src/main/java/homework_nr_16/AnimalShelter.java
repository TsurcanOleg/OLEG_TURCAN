package homework_nr_16;

import java.util.List;

public class AnimalShelter {

public static void addDog (List<? super Dog> inputDog, Dog Dog){
    inputDog.add(Dog);
    }

    public static void makeSoundAll (List<? extends Animal> AnimalMakeSound){
    for (Animal animal : AnimalMakeSound){
        animal.makeSound();
    }
    }
}
