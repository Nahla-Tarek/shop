public class Credit extends PaymentMethods{

    private final String receipt="paying"+" "+q.calculateTotalPrice()+" "+ "euros by credit";

    public String pay()
    {
        return receipt;
    }
}
