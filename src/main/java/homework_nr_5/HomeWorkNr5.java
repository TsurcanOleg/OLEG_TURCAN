package homework_nr_5;

import org.w3c.dom.ls.LSOutput;

public class HomeWorkNr5 {

    public static void main(String[] args) {

        int[] number = new int[]{
                0, 1, 2, 3, 4, 5, 6, 7, 8, 9,
                10, 11, 12, 13, 14, 15, 16, 17, 18, 19,
                20, 21, 22, 23, 24, 25, 26, 27, 28, 29,
                30, 31, 32, 33, 34, 35, 36, 37, 38, 39,
                40, 41, 42, 43, 44, 45, 46, 47, 48, 49,
                50, 51, 52, 53, 54, 55, 56, 57, 58, 59,
                60, 61, 62, 63, 64, 65, 66, 67, 68, 69,
                70, 71, 72, 73, 74, 75, 76, 77, 78, 79,
                80, 81, 82, 83, 84, 85, 86, 87, 88, 89,
                90, 91, 92, 93, 94, 95, 96, 97, 98, 99, 100

        };

        for (int i = 0; i < 101; i++) {
            System.out.println(number[i]);
        }

        System.out.println("Summ array number");
        // find summ array number

        int sumEven = 0;
        for (int j = 0; j < number.length; j++) {
            if (number[j] % 2 == 0) {
                sumEven += number[j];
            }
        }
        System.out.println(sumEven);

        long multiplyOdd = 1;
        for (int k = 0; k < number.length; k++) {
            if (number[k] % 2 != 0) {
                multiplyOdd *= number[k];
            }
        }
        System.out.println(multiplyOdd);

        int[] copyNumbers = new int[number.length];
        for (int i = 0; i < number.length; i++) {
            copyNumbers[i] = number[i];
            System.out.println(copyNumbers[i]);
        }
    }
}

