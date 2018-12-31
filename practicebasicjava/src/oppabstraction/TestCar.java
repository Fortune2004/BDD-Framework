package oppabstraction;

public class TestCar {

    public static void main(String[] args) {
        Car car = new Toyota();
        car.start();
        car.stop();


        Toyota camry = new Toyota();
        camry.motorCar();
        camry.start();
        camry.stop();


        Toyota hybridCar = new Toyota();
            hybridCar.fourWheelCar();



    }
}

