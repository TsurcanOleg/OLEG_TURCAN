package homewrok_nr_14;

public class DivisibleBy7 {
    public static void main(String[] args) {

        countDivisibleBy7Numbers(1, 22334);


    }

    public static void countDivisibleBy7Numbers(int inferiorLimit, int superiorLimit) {
        int countDivisors = 0;
        for (int i = inferiorLimit; i <= superiorLimit; i++) {
            if (i % 7 == 0) {
                countDivisors++;
            }
        }
                System.out.println("the number of divisible by 7 : " + countDivisors);

        if (inferiorLimit > superiorLimit) {
            try {
                throw new InvalidRangeException("The inferior limit is bigger superior limit");
            } catch (InvalidRangeException e) {
                e.printStackTrace();
            }
        }
    }
}