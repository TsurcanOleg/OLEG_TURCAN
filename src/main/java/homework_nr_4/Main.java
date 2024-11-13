package homework_nr_4;

import java.security.cert.CertPathValidatorException;

public class Main {


    public static void main(String[] args) {

        Circle circle = new Circle(6);

        float area = circle.calculateArea();
        System.out.println("Area = " + area);


        TemperatureConverter toCelsius = new TemperatureConverter (50,0);
        float Celsius = toCelsius.toCelsius();
        System.out.println(Celsius);

        TemperatureConverter toFarenheit = new TemperatureConverter(0, 12);
        float Farenheit = toFarenheit.toFarenheit();
        System.out.println(Farenheit);
    }

}
