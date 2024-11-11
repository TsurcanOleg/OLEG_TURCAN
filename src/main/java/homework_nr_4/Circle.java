package homework_nr_4;

public class Circle {

    public static void main(String[] args) {

        float radius = 6F;
        float Area = calculateArea(radius);

        System.out.println(Area);

    }

    public static float calculateArea (float radius ){
        float areaCircle = 3.14F * radius * radius ;
        return areaCircle;
    }

}
