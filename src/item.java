

public class item {


    public static int item1_id = 1;
    public static int item2_id = 2;
    public static int item3_id = 3;
    public static int item4_id = 4;
    public static int item5_id = 5;
    public static int item6_id = 6;
    public static int item7_id = 7;
    public static int item8_id = 8;
    public static int item9_id = 9;
    public static int item10_id = 10;
    public static int item1_price = 10;
    public static int item2_price = 20;
    public static int item3_price = 30;
    public static int item4_price = 40;
    public static int item5_price = 50;
    public static int item6_price = 60;
    public static int item7_price = 70;
    public static int item8_price = 80;
    public static int item9_price = 90;
    public static int item10_price = 100;
    public static int[] items = {item1_id, item2_id, item3_id, item4_id, item5_id, item6_id, item7_id, item8_id, item9_id, item10_id};
    public static int[] price = {item1_price, item2_price, item3_price, item4_price, item5_price, item6_price, item7_price, item8_price,
            item9_price, item10_price};

    public static int[][] items1 = new int[2][price.length];

    public item() {
        for (int i = 0; i < items.length; i++) {
            items1[0][i] = items[i];

            items1[1][i] = price[i];
        }
    }

    public int[][] getItem() {
        return items1;
    }
        //  public void  setItem(int item_id,int price1)
        // {
        // items[items.length]=item_id;
        // price[price.length]=price1;
        //  }
        public void edit ( int item_id, int price1)
        {
            for (int j = 0; j < items.length; j++) {
                if (items[j] == item_id & price[j] == price1) {
                    for (int h = j; h < (items.length - 1); h++) {
                        items[h] = items[h + 1];
                        price[h] = price[h + 1];
                    }
                    items[items.length-1]=0;
                    price[price.length-1]=0;

                }

            }
            for (int i = 0; i < items.length; i++) {
                items1[0][i] = items[i];

                items1[1][i] = price[i];}

        }
    }

