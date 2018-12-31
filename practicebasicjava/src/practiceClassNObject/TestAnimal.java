package practiceClassNObject;

public class TestAnimal {
    public static void main(String[] args) {

        Cow myCow = new Cow();
        myCow.age();
        myCow.description();
        myCow.reasonForBuy();
        myCow.numberOflegs();
        myCow.getName();
        String Name = myCow.getName();
        System.out.println(Name);


        Goat myGoat = new Goat();
        myGoat.age();
        myGoat.description();
        myGoat.numberOflegs();
        myGoat.reasonForBuy();
        myGoat.getName();
        String name = myGoat.getName();
        System.out.println(name);

    }




    }


