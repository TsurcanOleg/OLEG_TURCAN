package homework_nr_8;

public class ApplianceMain {

    public static void main(String[] args) {

        WashingMachine wm1 = new WashingMachine("LG",2000, 7.5);
        Microwave mw1 = new Microwave("Samsung", 1200, true);
        AirConditioner ac1 = new AirConditioner("Daikin", 1500, 12000, true);

        wm1.displayInfo();
        mw1.displayInfo();
        ac1.displayInfo();

Appliance a1 = new WashingMachine("Samsung", 2500, 9.0);
Appliance a2 = new Microwave("Gorenje", 1800, false);
Appliance a3 = new AirConditioner("Daikin", 2000, 18000, true);

if (a1 instanceof WashingMachine){
    System.out.println("This is a washing machines a load capacity of " + ((WashingMachine) a1).loadCapacity + " KG");
}
if (a2 instanceof Microwave){
    System.out.println("This is a microwave whit a grill: " + ((Microwave) a2).hasGrill);
}
if (a3 instanceof AirConditioner){
    System.out.println("This is an air conditioner with cooling power of " + ((AirConditioner) a3).coolingPower + " BTU and inverter: " + ((AirConditioner) a3).hasInverter);
}
    }
}
