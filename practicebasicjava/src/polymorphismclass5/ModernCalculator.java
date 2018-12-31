package polymorphismclass5;

public class ModernCalculator extends LandCalculator{


    @Override
    public int areaOfLand(int a, int b, int c) {
        int total = a + b + c-1;
        return total;
    }
}
