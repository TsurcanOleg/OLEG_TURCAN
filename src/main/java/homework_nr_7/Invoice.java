package homework_nr_7;

public class Invoice {

    Invoice[] amount;

String model;
String productDescription;
int quantity;
double price;

    public Invoice(String model, String productDescription, int quantity, double price) {
        this.model = model;
        this.productDescription = productDescription;
        this.quantity = quantity;
        this.price = price;
    }

    public String getModel() {
        return model;
    }

    public String getProductDescription() {
        return productDescription;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double calculatesum(){
        double sum = price * quantity;
        return sum;
    }
    public double getAmount(){
        double total = 0;
        for (int j = 0; j < amount.length; j++){
             total += amount[j].calculatesum();

        }
return total;

    }
}
