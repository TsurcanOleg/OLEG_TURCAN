package homework_nr_10;

public interface AnimalInterface {

    String POWER_SUPPLY_TYPE = "Grass";
    String ABILITY_TO_MOVE_ACTIVELY = "YES";

    void run();
    void walks();
    void tactileContact();
    void diet();
    default void trumpeting() {
        System.out.println("The elephant is trumping...");
    }
    static void needForOxygen() {
        System.out.println("Need the oxygen ....");
    }
}
