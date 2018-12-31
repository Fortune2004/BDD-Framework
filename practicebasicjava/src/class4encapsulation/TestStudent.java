package class4encapsulation;

public class TestStudent {

    public static void main(String[] args) {
        Student st1 = new Student();
        st1.setStName("Salma");
        st1.setStID(3278);
        st1.setStDOB("07/11/1983");
        System.out.println(st1.getStName()+" "+st1.getStID()+" "+st1.getStDOB());


        Student st2 = new Student();
        st2.setStName("Osman");
        st2.setStID(3456);
        st2.setStDOB("09/09/1960");
        System.out.println(st2.getStName()+" "+st2.getStID()+" "+st2.getStDOB());








    }
}
