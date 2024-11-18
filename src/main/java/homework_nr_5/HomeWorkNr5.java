package homework_nr_5;

public class HomeWorkNr5 {

    public static void main(String[] args) {

        int[] number = new int[101];
        for (int i = 0; i < 101; i++){
            number[i] = i;
            System.out.println(number[i]);
        };

        // find summ array number

        int sumEven = 0;
        for (int j = 0; j < number.length; j++) {
            if (number[j] % 2 == 0) {
                sumEven += number[j];
            }
        }
        System.out.println("Sum Even = " + sumEven);

        long multiplyOdd = 1;
        for (int k = 0; k < number.length; k++) {
            if (number[k] % 2 != 0) {
                multiplyOdd *= number[k];
            }
        }
        System.out.println("Multiply Odd = " + multiplyOdd);

        int[] copyNumbers = new int[number.length];
        for (int i = 0; i < number.length; i++) {
            copyNumbers[i] = number[i];
            System.out.println(copyNumbers[i]);
        }
    }
}