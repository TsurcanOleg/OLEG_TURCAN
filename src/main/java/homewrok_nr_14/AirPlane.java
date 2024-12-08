package homewrok_nr_14;

public class AirPlane {


    public static void main(String[] args) {

        airPlane("Airbus", "A380", 4);


    }

    public static void airPlane (String manufacturer, String model, int nrOfEngine) {
        if (nrOfEngine == 0 || nrOfEngine % 2 != 0) {
            System.out.println("Number of engines is zero or odd!!!");
            try {
                throw new InvalidNrOfEnginesException();
            }catch (InvalidNrOfEnginesException e){
                e.printStackTrace();
            }
        }
        if (manufacturer.isEmpty()){
            try {
                throw new InvalidManufacturerException("Invalid or not found manufacturer");
            }catch (InvalidManufacturerException e) {
                e.printStackTrace();
            }
        }
        if (model.isEmpty()){
            try{
                throw new InvalidModelException("Invalid or not found model");
            }catch (InvalidModelException e){
                e.printStackTrace();
            }
        }
    }
}