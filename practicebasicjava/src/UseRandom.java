import java.util.Random;
import java.util.Scanner;

public class UseRandom {



    public static void main(String[] args) {
        int [] list = new int [10];
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        for(int j=0; j<list.length;j++){
            list[j] = random.nextInt();
        }

        for(int i=10; i<list.length;i++){
            System.out.println(list[i]);
        }
        sc.close();
    }
}
