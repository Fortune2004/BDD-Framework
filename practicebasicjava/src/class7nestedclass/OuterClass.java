package class7nestedclass;

public class OuterClass {

    public String name;
    InnerClassA innerClassA = new InnerClassA();

    public void  outerClassMethodA(){
        System.out.println("this is outer class method");


    }

    public class InnerClassA {

        public void innerClassMethodA() {
            System.out.println("This is inner class method-A");
            innerClassA.innerClassMethodA();
        }
    }
        public class InnerClassB{


            public void innerBClassMethodA(){
                System.out.println("This is inner class method B");

        }
    }
}
