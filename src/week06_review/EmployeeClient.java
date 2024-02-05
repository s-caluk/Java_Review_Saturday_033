package week06_review;

public class EmployeeClient {
    public static void main(String[] args) {
        Employee employee1 = new Employee();
        Employee employee2 = new Employee();
        Employee employee3 = new Employee();

        employee1.setInfo("James",38, 'M', "QA", 100.000, true, false);
        employee2.setInfo("Shay", 40, 'F', "BA", 110.000, true , true);
        employee3.setInfo("Yulia", 30, 'F', "Developer", 180.000,false, true);

        System.out.println(employee1);
        System.out.println(employee2);
        System.out.println(employee3);

    }
}
