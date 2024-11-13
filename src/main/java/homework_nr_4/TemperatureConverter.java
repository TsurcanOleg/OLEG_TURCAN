package homework_nr_4;

import org.w3c.dom.ls.LSOutput;

public class TemperatureConverter {

    // (C*9/5)+32 = F   ///   (F-32)*5/9=C
    public static void main(String[] args) {

        float farenheit = 50F;
        float toCelsius = calculateCelsius(farenheit);
        float celsius = 35F;
        float toFarenheit = calculateFarenheit(celsius);

        System.out.println(toCelsius);
        System.out.println(toFarenheit);

    }
public static float calculateCelsius(float farenheit){
        float Celsius = (farenheit - 32) * (5F / 9F);
        return Celsius;
}

public static float calculateFarenheit(float celsius){
        float Farenheit = (celsius * (9f / 5F) + 32);
        return Farenheit;
}

float farenheit;

    public TemperatureConverter(float farenheit){
        this.farenheit = farenheit;

    }
    public float toCelsius(){
    float toCelsius = (farenheit - 32) * (5F / 9F);
    return toCelsius;
    }

}
