package superexampleclass6;

public class Children extends Parents {

    public Children(){
        super();
    }

    public void shapeNHeight(){
        System.out.println(super.familyName);
        super.heights();
        System.out.println("Average Shape");

    }
}
