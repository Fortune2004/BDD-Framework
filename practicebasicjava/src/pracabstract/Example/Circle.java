package pracabstract.Example;

public class Circle extends Shape{

    Circle (double r){
        super (r,r);
    }

    @Override
    void area() {
        double result = Math.PI * dm1 * dm2;
        System.out.println("Circle area: "+result);
    }


}
