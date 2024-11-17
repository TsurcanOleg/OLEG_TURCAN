package homework_nr_6;

public class NumberUtils {

    public static void main(String[] args) {
    }

    public static boolean isPrime(int number) {
        if (number < 1) {
            return false;
        }
        for (int i = 1; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static int findPrimesInArray(int... numbers) {
        for (int i = 1; i < numbers.length; i++) {
            if (isPrime(numbers[i])) {
            }
            return numbers[i];
        }
        return 0;
    }
}
