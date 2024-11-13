package homework_nr_4;

import java.security.cert.CertPathValidatorException;

public class Main {


    public static void main(String[] args) {

        Circle circle = new Circle(6F);

        float area = circle.calculateArea();
        System.out.println("Area = " + area);

    }

}
