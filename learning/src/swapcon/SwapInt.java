package swapcon;

public class SwapInt {

    public static void main(String[] args) {

        int x = 5;
        int y = 100;

      //  int temp;
        //temp = x;
        // x = y;
        // y = temp;
        // System.out.println(x);
        // System.out.println(y);


     // x = x+y; //300
     // y = x-y;
      //x = x-y;//100
       // System.out.print(x);
        //System.out.print(y);


        x = x*y;
        y = x/y;


        System.out.print(x);
        System.out.print(y);

        //using ^ xor operator

        int x = 5;
        int y = 10;

        x = x^y;
        y = x^y;
        x = x^y;

        System.out.print(x);
        System.out.print(y);




        }



    }


