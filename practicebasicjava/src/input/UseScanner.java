package input;

import java.util.Scanner;

public class UseScanner {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter some integer value: ");
        int value = 2;
        int input1 = 0;
        while(value>0) {
            input1 = sc.nextInt();
            value--;
        }
        int total = input1+input1;
        System.out.println(total);
    }
}
