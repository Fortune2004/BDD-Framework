package pracabstract;

public class Test {

    public static void main(String[] args) {

        MobileUser mu;
        mu = new Rahim();
        mu.call();
        mu.sendmessage();


        mu = new Karim();
        mu.call();
        mu.sendmessage();

    }
}
