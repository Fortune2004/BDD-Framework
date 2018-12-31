package constructortwo;

public class TestEmployee {

    public static void main(String[] args) {
        Employee emp1 = new Employee();
        Employee emp2 = new Employee("Salma Alam");
        Employee emp3 = new Employee("Mohammaed Sharif",90000,'M',true,9,"Bangladesh");
        Employee emp4 = new Employee("Farida Alam",100000,'F',false,7,"Mali");
        Employee emp5 = new Employee("Saud Alam", 900000,'M',true,10,"Mali");



    }
}
