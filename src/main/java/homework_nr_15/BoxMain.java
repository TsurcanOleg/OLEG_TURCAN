package homework_nr_15;

public class BoxMain {
    public static void main(String[] args) {

        Box<Integer> b1 = new Box<>(100);

        System.out.println(b1.getContent());

        b1.setContent(200);

        System.out.println(b1.getContent());

        Box<String> b2 = new Box<>("Generics are useful!");

        System.out.println(b2.getContent());

    }
}
