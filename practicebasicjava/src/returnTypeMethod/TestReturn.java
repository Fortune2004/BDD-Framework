package returnTypeMethod;

public class TestReturn {

    public static void main(String[] args) {
        ReturnType rt = new ReturnType();
        rt.addition(10,50);
        int total = rt.addition(10,50);
        System.out.println(total);

    }
}
