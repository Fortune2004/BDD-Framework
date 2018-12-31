package polymorphismclass5;

public class TestLand {

    public static void main(String[] args) {
        LandCalculator cal = new LandCalculator();
        int lineResult = cal.areaOfLand(10,20);
        System.out.println(lineResult);

        ModernCalculator mc = new ModernCalculator();
        System.out.println("Modern cal: "+mc.areaOfLand(10,30,20));






    }

}
