package nestedclass;

public class OuterClass {
    public String name;
    InnerClassA innerClassA = new InnerClassA();

    public void outerClassMethodA(){
        System.out.println("This is outer class method A ");
        innerClassA.innerAClassMethodA();
        innerClassB.InnerBClassMethodA();




    }
}
