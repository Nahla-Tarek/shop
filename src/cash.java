public class cash extends PaymentMethods{

    private final String receipt="paying"+" "+q.calculateTotalPrice()+" "+ "euros by cash";

    public String pay()
    {
        return receipt;
    }
}

