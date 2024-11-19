package homework_nr_7;

public class EncapsulationDateMain {
    public static void main(String[] args) {

        Date d1 = new Date(12, 8,2023);
        Date d2 = new Date(21, 12,2025);
        Date d3 = new Date(31, 8,2033);
        Date d4 = new Date(12, 13,2015);



        System.out.println(d1.displayDate());
        System.out.println(d2.displayDate());
        System.out.println(d3.displayDate());
        System.out.println(d4.displayDate());
    }

}
