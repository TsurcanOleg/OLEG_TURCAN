package homework_nr_7;

public class InvoiceOrder {

    Invoice[] invoices;

    public InvoiceOrder(Invoice... invoices) {
        this.invoices = invoices;
    }

    public double getInvoiceTotal() {
        double sumInvoice = 0;
        for (int i = 0; i != invoices.length; i++) {
            sumInvoice += invoices[i].calcuteSum();
        }
    return sumInvoice;
    }
}
