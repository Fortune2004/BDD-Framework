package were;

import java.util.Arrays;

public class Practice {


    public static void main(String[] args) {

        int fibo[] = new int[20];
        for (int i = 0; i < 20; i++) {
            if (i < 2) {
                fibo[i] = 1;
            } else {
                fibo[i] = fibo[i - 2] + fibo[i - 1];
                System.out.println(Arrays.toString(fibo));

            }

        }
        System.out.println(Arrays.toString(fibo));
    }

}





