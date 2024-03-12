package week11_review.encapsulation;

public class EmployeeClients {
    public static void main(String[] args) {

        Employee employee1 = new Employee("John", 30, 'M', "Software Engineer",100000, true, "Google");

        System.out.println(employee1);

        employee1.setSalary(1000);

        System.out.println(employee1);
    }


}
