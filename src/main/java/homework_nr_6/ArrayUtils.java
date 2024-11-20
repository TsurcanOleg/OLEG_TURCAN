package homework_nr_6;

public class ArrayUtils {


    public static int findMax(int... numbers) {
        int greatest = numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            if (greatest <= numbers[i]) {
                greatest = numbers[i];
            }
        }
            return greatest;
        }

    public static int findMin(int... numbers) {
            int least = numbers[0];
            for (int i = 0; i < numbers.length; i++) {
                if (least >= numbers[i]) {
                    least = numbers[i];
                }
            }
            return least;
        }
    }