public class Cheque extends PaymentMethods  {


    public void pay()
    {

        Trans_System.out.println("paying " + getMoney() + "euros by cheque");
    }
}
