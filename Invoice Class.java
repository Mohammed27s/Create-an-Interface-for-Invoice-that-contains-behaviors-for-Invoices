package InvoiceInterface;

public class CustomerInformation implements Invoice{


    Invoice customer = new CustomerInformation();

    @Override
    public void invoiceNumber() {
        System.out.println("77666355");
    }

    @Override
    public void customerName() {
    System.out.println("Mohammed");
    }

    @Override
    public void date() {
    System.out.println("11/08/2020");
    }

    @Override
    public void customerPhone() {
    System.out.println("+444 766663787");
    }

    @Override
    public void productName() {
    System.out.println("Chips Oman");
    }

    @Override
    public void totalAmount() {
    System.out.println("$5.0");
    }

    @Override
    public void paidAmount() {
    System.out.println("$10.0");
    }

    @Override
    public void balance() {
    System.out.println("$5.0");
    }

}
