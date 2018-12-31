package concept;

public class TestEmployee {

    public static void main(String[] args) {
        Employee emp1 = new Employee();
        emp1.fullName = "Salma Alam";
        emp1.salary = 68000;
        emp1.sex = 'F';
        emp1.usCitizen = false;
        emp1.employeeInfo();
        emp1.employeeEvaluation();
        System.out.println("Emp evaluation: "+8);
        emp1.employeeOrigin();
        System.out.println("Bangladesh");


        Employee emp2 = new Employee();
        emp2.fullName = "Soheli Azad";
        emp2.salary = 80000;
        emp2.sex = 'M';
        emp2.usCitizen = true;
        emp2.employeeInfo();
        emp2.employeeEvaluation();
        System.out.println(10);
        emp2.employeeOrigin();
        System.out.println("Canada");

    }
}
