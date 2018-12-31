package pracabstract.Example;

public class Triangle extends Shape {

    Triangle(double dm1, double dm2) {
        super(dm1, dm2);
    }

    @Override
    void area() {
        double result = 0.5 * dm1 * dm2;
        System.out.println("Triangle area: " + result);
    }
}