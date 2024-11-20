package homework_nr_6;

public class NumberUtils {

    public static void main(String[] args) {
    }

    public static boolean isPrime(int number) {
        if (number < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }


    public static int[] findPrimesInArray(int... numbers) {
        for (int i = 0; i < numbers.length; i++) {
            if (isPrime(numbers[i])) {
                System.out.println(numbers[i]);
            }
        }
        return numbers;
    }
}