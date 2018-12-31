package concept;

public class Employee {

    String fullName;
    int salary;
    char sex;
    boolean usCitizen;
    int evaluation;
    String origin;

    public void employeeInfo(){
        System.out.println("Employee Info: "+fullName+" "+salary+" "+sex+" "+usCitizen);
    }

    public int employeeEvaluation() {
     return evaluation;
    }

    public String employeeOrigin(){
        return origin;
    }


}
