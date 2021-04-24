public class Customer {
    item i = new item();
    public static int [][] purchases=new int [2][1];
    public Customer() {


        purchases[0][0] = i.getItem()[0][0];
        purchases[1][0] = i.getItem()[1][0];
    }
    public int [][] getPurchases()
    {
        return purchases;
    }

    public String selectPaymentMethod ()
    {
        return "cash";
    }


}
