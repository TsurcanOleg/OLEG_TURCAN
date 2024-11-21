package homework_nr_8;

public class ApplianceMain {

    public static void main(String[] args) {

        WashingMachine wm1 = new WashingMachine("LG",2000, 7.5);
        Microwave mw1 = new Microwave("Samsung", 1200, true);

        wm1.displayInfo();
        mw1.displayInfo();
    }
}
