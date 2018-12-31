package constructortwo;

public class Employee {
    String fullName;
    int salary;
    char sex;
    boolean usCitizen;
    int evaluation;
    String origin;


    public Employee() {//default constructor,no argument constructor
        System.out.println("This is from default constructor");
    }

    public Employee(String fullName) {//parameterized constructor
        this.fullName = fullName;
        System.out.println(fullName);
    }

    public Employee(String fullName, int salary,char sex,boolean usCitizen,int evaluation,String origin){
        this.fullName = fullName;
        this.sex = sex;
        this.usCitizen = usCitizen;
        this.evaluation = evaluation;
        this.origin = origin;
        System.out.println(fullName+" "+salary+" "+sex+" "+usCitizen+" "+evaluation+" "+origin);
    }

}