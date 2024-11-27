package homework_nr_7;

import java.sql.SQLOutput;

public class InvoiceMain {

    public static void main(String[] args) {

        Invoice in1 = new Invoice("Samsung", "Phone", 1, 12300D);
        Invoice in2 = new Invoice("Toshiba", "Laptop", 6, 12499D);
        Invoice in3 = new Invoice("LG", "TV", 7, 55040D);
        Invoice in4 = new Invoice("JBL", "Box", 5, 3690D);

        InvoiceOrder io1 = new InvoiceOrder(in1, in2, in3, in4);
        InvoiceOrder io2 = new InvoiceOrder(in1, in3, in4);


        double sumInvoice = 0;
        for (int i = 0; i != io1.invoices.length; i++) {
            sumInvoice += io1.invoices[i].price * io1.invoices[i].quantity;
        }
        System.out.println(sumInvoice);
        System.out.println(io2.getInvoiceTotal());
    }
}
