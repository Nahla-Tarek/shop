import java.io.PrintStream;

public class Trans_System {

    public static String payMethod;
    public static PrintStream out;
    Cashier r=new Cashier();
    item i1=new item();
    public Trans_System() {
        int w = 0;


        int[][] array1 = r.addItem();
        for (int o = 0; o < 1; o++) {
            i1.edit(array1[w][o], array1[w + 1][o]);
        }

    }

    public static void main (String[] args)
    {

        Cashier r1=new Cashier();
        cash e=new cash();
        Credit l=new Credit();
        Cheque k=new Cheque();

        payMethod = r1.getPaymentMethod();
        if (payMethod.equals("cash")) {
            e.pay();
        } else if (payMethod.equals("cheque")) {
            k.pay();
        } else {
            l.pay();
        }

    }

    public int calculateTotalPrice()
    {
        int totalPrice = 0;
       int [][] array=r.addItem();
       for(int t = 0; t< 1; t++)
       {
          totalPrice = totalPrice +array[1][t];
       }
       return totalPrice;
    }
}
