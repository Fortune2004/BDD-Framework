package staticdemopk;

public class SeleniumNov {
     int stID;
     int stAge;
    static String instructor;

     public void show (){
         System.out.println(stID+ " : "+stAge+" : "+instructor);
     }




    public static void main(String[] args) {

        SeleniumNov salma = new SeleniumNov();
        salma.stID = 1234;
        salma.stAge = 35;
        salma.instructor = "Mafi";

        SeleniumNov farida = new SeleniumNov();
        farida.stID =3456;
        farida.stAge=52;
        farida.stID = 2352;
        farida.instructor="Mafi";
        farida.instructor = "Halima";
        salma.instructor = "Siddique";


        salma.show();
        farida.show();




    }
}
