package rrrrr;
import java.util.Arrays;

public class Fibonacci {
    public static void main(String[] args) {
        //Find out 50 Fibonacci number using java

        int fibo[] = new int[50];
        for (int i = 0; i<50; i++){
            if (i < 2) {
                fibo[i] = i;
            }else{
                fibo[i]=fibo[1-2] + fibo [i-1] ;
            }
        }
        System.out.println(Arrays.toString(fibo));
    }

}
