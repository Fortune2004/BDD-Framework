package logicalorconditionalclass5;

public class Compare {

    public static void main(String[] args) {
        int value1 = 201;
        int value2 = 20;


        if (value1 > value2 && value1%2==0) {
            System.out.println(value1 + " is bigger than " + value2+ " it is even number");

        } else if ((value1 > value2) || (value1%2 !=0)) {

            System.out.println(value2 + " is bigger than " + value1 + " it is odd number");

        } else if (value1 == value2) {

            System.out.println(value1 + " is equal to " + value2);

        }else{

            System.out.println("There is no valid case");


        }
    }
}
