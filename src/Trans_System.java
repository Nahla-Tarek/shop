

public class Trans_System {



    Cashier r=new Cashier();
    item i1=new item();
    public Trans_System() {


        }

    public void forEditing() {
        int w = 0;
        int[][] array1 = r.addItem();
        for (int o = 0; o < 1; o++) {
            i1.edit(array1[w][o], array1[w + 1][o]);
        }
    }


        public int calculateTotalPrice ()
        {
            int totalPrice = 0;
            int[][] array = r.addItem();
            for (int t = 0; t < 1; t++) {
                totalPrice = totalPrice + array[1][t];

            }

            return totalPrice;

        }
    }
