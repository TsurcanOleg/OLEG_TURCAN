package homework_nr_12;

public enum FuelTypes {
    PETROL_EFIX_95(true),
    PETROL_PREMIUM_95(true),
    DIESEL_EFIX_51(true),
    DIESEL_SUPER_EURO_5(true),
    GASOLINE(true),
    LPG(false);

    boolean isLiquidFuel;

    FuelTypes(boolean isLiquidFuel) {
        this.isLiquidFuel = isLiquidFuel;
    }

    public boolean isLiquidFuel(){
        return this.isLiquidFuel == true;
    }
}