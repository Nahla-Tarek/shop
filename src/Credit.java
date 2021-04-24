public class Credit extends PaymentMethods  {


    public void pay()
    {

        Trans_System.out.println("paying " + getMoney() + "euros by visa");
    }
}
