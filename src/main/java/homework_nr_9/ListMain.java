package homework_nr_9;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ListMain {
    public static void main(String[] args) {

        List<String> toDoList = new ArrayList<>();
        toDoList.add("Drink coffee!");
        toDoList.add("Make pull request homework 7");
        toDoList.add("Make pull request homework 8");
        toDoList.add("Drink coffee!");
        toDoList.add("Resolve conflict homework 5");
        toDoList.add("Drink coffee!");
        toDoList.add("Go sleep!");

        for(int i = 0; i != toDoList.size(); i++) {
            System.out.println(toDoList.get(i));
        }

        System.out.println("----Set of unique values----");
            Set<String> toDoList2 = new HashSet<>(toDoList);
            System.out.println(toDoList2);

    }
}
