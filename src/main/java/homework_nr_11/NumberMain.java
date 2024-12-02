package homework_nr_11;

import java.io.PrintStream;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class NumberMain {
    public static void main(String[] args) {

        Number n1 = new Number(17);

        Predicate<Number> theNumberIsOdd = (Number e) -> {
            if (n1.number % 2 != 0) {
                return true;
            }
            return false;
        };
        System.out.println(theNumberIsOdd.test(n1));

        Consumer<String> printNumber = number -> System.out.println(number);


        Function<Integer, Integer> multiplyByToo = number -> number * 2;
        System.out.println(multiplyByToo.apply(n1.number));


        Supplier<List<Integer>> randomNumber = () -> new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 12, 7, 6, 35, 16));
        List<Integer> numbers = randomNumber.get();
        Random random = new Random();
        int randomIndex = random.nextInt(numbers.size());
        System.out.println(numbers.get(randomIndex));

    }
}