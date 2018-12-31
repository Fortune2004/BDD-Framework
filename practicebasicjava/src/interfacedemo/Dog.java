package interfacedemo;

public class Dog implements Animal {

    @Override
    public void eat() {
        System.out.println("Dog cant eat egg");
    }
}
