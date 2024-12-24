package homework_nr_15;

public class PairMain {
    public static void main(String[] args) {

        Pair <String, Integer> p1 = new Pair<>("Hello", 42);
        Pair <String, Boolean> p2 = new Pair<>("Java", true);



        System.out.println(p1.getFirst());
        System.out.println(p1.getSecond());

        System.out.println(p2.getSecond());

    }
}
