package homewrok_nr_14;

public class AirPlane {


    public static void main(String[] args) {

        airPlane("Airbus", "A380", 6);


    }

    public static void airPlane (String manufacturer, String model, int nrOfEngine) {
        if (nrOfEngine == 0 || nrOfEngine % 2 != 0) {
            System.out.println("Number of engines is zero or odd!!!");
            try {
                throw new InvalidNrOfEnginesException();
            }catch (InvalidNrOfEnginesException e){
                throw new RuntimeException(e);
            }
        }
        if (manufacturer.isEmpty()){
            try {
                throw new InvalidManufacturerException("Invalid or not found manufacturer");
            }catch (InvalidManufacturerException e) {
                throw new RuntimeException(e);
            }
        }
        if (model.isEmpty()){
            try{
                throw new InvalidModelException("Invalid or not found model");
            }catch (InvalidModelException e){
                throw new RuntimeException(e);
            }
        }
    }
}