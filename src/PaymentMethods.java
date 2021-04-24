public abstract class PaymentMethods
{
    Trans_System p=new Trans_System();
    public int getMoney()
    {
      return p.calculateTotalPrice() ;
    }
     public abstract void pay();


}
