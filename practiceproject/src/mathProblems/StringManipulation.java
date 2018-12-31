package mathProblems;

public class StringManipulation {


    public static void main(String[] args) {
        String str = "We are in Java Selenium Class";
        String str1 = "We are in Java Selenium Class";


        System.out.println(str.length());

            System.out.println(7);
            System.out.println(str.indexOf('i'));
        System.out.println(str.indexOf('i',str.indexOf('i')+1)+" & "+(str.indexOf('i')));
        System.out.println(str.indexOf("Robin"));
        System.out.println(str.equals(str1));
        System.out.println( str.equalsIgnoreCase(str1));
        System.out.println(str.substring(0,3));
        String date = "01-01-2019";
        System.out.println(date.replace("-", " "));
        String x = "Hello";
        String y = "World";
        int a = 100;
        int b = 200;
        System.out.println(x + y);
        System.out.println(a + b);
        System.out.println(x+y+a+b);
        System.out.println(a+b+x+y);


        }

    }
