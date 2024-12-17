package homewrok_nr_14;

public class DivisibleBy7 {
    public static void main(String[] args) {

        countDivisibleBy7Numbers(131, 788);

    }
    public static void countDivisibleBy7Numbers(int inferiorLimit, int superiorLimit) {
        int countDivisors = 0;
        try {
            for (int i = inferiorLimit; i <= superiorLimit; i++) {
                if (i % 7 == 0) {
                    countDivisors++;
                }
            }
            System.out.println("The number of divisible by seven is " + countDivisors);
            if (inferiorLimit > superiorLimit) {
                throw new InvalidRangeException("The inferior limit is bigger superior limit");
            }
        } catch (InvalidRangeException e) {
            throw new RuntimeException(e);
        }
    }
}