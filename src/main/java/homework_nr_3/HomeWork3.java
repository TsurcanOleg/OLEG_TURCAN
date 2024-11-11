package homework_nr_3;



public class HomeWork3 {

    public static void main(String[] args) {

        int month = 8;
        switch (month) {
            case 1:
                System.out.println("January");
                break;
            case 2:
                System.out.println("February");
                break;
            case 3:
                System.out.println("March");
                break;
            case 4:
                System.out.println("April");
                break;
            case 5:
                System.out.println("May");
                break;
            case 6:
                System.out.println("June");
                break;
            case 7:
                System.out.println("July");
                break;
            case 8:
                System.out.println("August");
                break;
            case 9:
                System.out.println("September");
                break;
            case 10:
                System.out.println("October");
                break;
            case 11:
                System.out.println("November");
                break;
            case 12:
                System.out.println("December");
                break;
            default:
                System.out.println("Not a valid number");

        }
        int b = 100;
        while (b <= 1000) {
            b++;
            if (b % 5 == 0) {
                System.out.println(b);
            }
        }
// number 6  sum = (2n-1)/(2n+1), n=1,2,3,4..49
        double Summ = 0.0;
        for (int n = 1; n <= 49; n++){
            double x = (2.0 * n -1)/(2.0 * n + 1);
            Summ += x;
        }
        System.out.println(Summ);
    }

}
