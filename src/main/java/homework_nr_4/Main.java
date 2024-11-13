package homework_nr_4;

import java.security.cert.CertPathValidatorException;

public class Main {


    public static void main(String[] args) {

        Circle circle = new Circle(6F);

        float area = circle.calculateArea();
        System.out.println("Area = " + area);


        TemperatureConverter toCelsius = new TemperatureConverter (90);
        float Celsius = toCelsius.toCelsius();
        System.out.println("To Celsius " + Celsius);

    }

}
