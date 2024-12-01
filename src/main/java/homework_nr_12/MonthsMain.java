package homework_nr_12;

public class MonthsMain {
    public static void main(String[] args) {

        Months m1 = Months.DECEMBER;
        System.out.println(m1);

        System.out.println("--------------");
       for (Months months : Months.values()){
           System.out.println(months);
       }
    }
}
