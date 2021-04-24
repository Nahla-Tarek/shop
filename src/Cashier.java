public class Cashier {
    private final String Pay_Method;
    Customer c=new Customer();
    public Cashier()
    {
    Pay_Method=c.selectPaymentMethod();
    }
    public int [][] addItem()
    {
        return c.getPurchases();
    }

    public String getPaymentMethod()
    {
     return Pay_Method;
    }
}
