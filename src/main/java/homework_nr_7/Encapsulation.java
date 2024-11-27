package homework_nr_7;

import org.w3c.dom.ls.LSOutput;

public class Encapsulation {

    public static void main(String[] args) {


        Employee person1 = new Employee("Victoria", 18, "Human resources");
        Employee person2 = new Employee("Andrei", 34, "Tehnical department");
        Employee person3 = new Employee("stefan", 45, "Electrick");

        System.out.println(person1.department);
        System.out.println(person2.getAge());
        System.out.println(person3.getName() + person3.getAge() + person3.department);
    }
}
