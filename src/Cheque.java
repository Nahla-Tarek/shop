public class Cheque extends PaymentMethods{

     private final String receipt="paying"+" "+q.calculateTotalPrice()+" "+ "euros by cheque";

   public String pay()
    {
      return receipt;
    }
}
