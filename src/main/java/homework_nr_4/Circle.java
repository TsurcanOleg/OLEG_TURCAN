package homework_nr_4;

public class Circle {

    public static void main(String[] args) {

        float radius = 6F;
        float area = calculateArea(radius);

        System.out.println(area);

    }

    public static float calculateArea(float radius) {
        float area = 3.14F * radius * radius;
        return area;
    }
float radius;

    public Circle(float radius){
        this.radius = radius;

    }
}
