package homework_nr_10;

public class Main {
    public static void main(String[] args) {

        Elephant e1 = new Elephant("Elephant", "Asian", 4, 48);
        Elephant e2 = new Elephant("Elephant", "Forest", 3, 60);
        Elephant e3 = new Elephant("Savannah", "Elephant", 6, 70);


Elephant[] elephants = new Elephant[]{
        e1, e2, e3
};
AnimalInterface[] animalInterfaces = new AnimalInterface[]{
         e1, e2, e3
 };
for (int i = 1; i != animalInterfaces.length; i++){
    animalInterfaces[i].diet();
    if (animalInterfaces[i] instanceof Elephant){
        System.out.println("true");
    }
}
        e1.diet();
        e1.run();
        e1.walks();
        e1.tactileContact();
        e1.trumpeting();

        System.out.println("--------Extends Ebivor class-------");
        Erbivor er1 = new Elephant("Elephant", "Indian", 4, 48);

        er1.animalSound();
        e1.erbivorAnimal();
    }
}
