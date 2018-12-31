package practiceClassNObject;

public class Cow {

    int legs = 4;
    String name = "Lali";


    public String getName() {
        return name;
    }

    public void description(){
    System.out.println("My cow is red");
    }

    public void age(){
        System.out.println("My cow is 2 years old");
    }

    public void numberOflegs(){
        System.out.println(legs);
    }

    public void reasonForBuy(){
        System.out.println("I bought her to sell and want to make profit");
    }
}
