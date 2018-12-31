package oppabstraction;

public class Toyota extends HybridCar implements Car {

    //car
    public void start() {
        System.out.println("Start the car to drive");

    }

    public void stop() {
        System.out.println("Put on break to sto the car");
    }
    //Toyota
    public void motorCar(){
        System.out.println("Implement motor engine");
    }
    //HybridCar
    public void electricBattery(){
        System.out.println("implement electric battery engine");
    }

    //MotorCar
    public void fourWheelCar() {
        System.out.println("Implement for wheel drive");

    }
}
