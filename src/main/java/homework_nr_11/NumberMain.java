package homework_nr_11;

import java.io.PrintStream;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class NumberMain {
    public static void main(String[] args) {

        Number n1 = new Number(9);

        Predicate<Number> theNumberIsOdd = (Number e) -> {
            if(n1.number % 2 != 0) {
                return true;
            }
            return false;
        };
        System.out.println(theNumberIsOdd.test(n1));

    }
}
