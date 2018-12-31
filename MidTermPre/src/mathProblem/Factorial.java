package mathProblem;

public class Factorial {
    public static void main(String[] args) {

        int n = 10;
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result = result * i;
            System.out.println(" The Factorial of 10 is : " + result);


        }
        System.out.println(" The Factorial of 10 is : " + factorial( n: 10));
        System.out.println(" The Factorial of 10 is : " + factorial( n: 10));


    }

        //Factorial of 5
        //using Recursion


        public static int factorial(int n){
            if (n==0) {
                return 1;
            }else{
                return n * factorial( n: n-1);
            }


        }




    }

