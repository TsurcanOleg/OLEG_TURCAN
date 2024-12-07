package homework_nr_12;

public class IntegerNumber {
    Integer number;

    public IntegerNumber(Integer number) {
        this.number = number;
    }
public boolean isOdd() {
    return number % 2 != 0;
}
public boolean isEven(){
    return number % 2 == 0;
}
public boolean isNegative() {
    return number < 0;
}
public boolean isPositive(){
        return number >0;
    }
}
