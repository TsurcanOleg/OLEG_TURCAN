package homework_nr_7;

public class Invoice {

    String model;
    String description;
    int quantity;
    double price;

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Invoice(String model, String description, int quantity, double price) {
        this.model = model;
        this.description = description;
        this.quantity = quantity;
        this.price = price;
   }
    public double calcuteSum(){
        if (quantity == 0){
            return 0;
       }
       else if (price == 0){
           return 0.0;
       }
        double result = quantity * price;
       return result;
    }
}
