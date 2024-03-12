package week11_review.encapsulation;


import lombok.Data;
import lombok.ToString;


@Data      //getters and setters
@ToString  //toString() method

public class Employee {
    private String name;
    private int age;
    private char gender;
    private String jobTitle;
    private double salary;
    private boolean isFullTime;
    private String company;

    public Employee(String name, int age, char gender, String jobTitle, double salary, boolean isFullTime, String company) {
         setName(name);
        setAge(age);
        setGender(gender);
        setJobTitle(jobTitle);
        setSalary(salary);
        setFullTime(isFullTime);
        setCompany(company);
    }

    public void setSalary(double salary) {
        if(salary < 0){
            throw new IllegalArgumentException("Salary can not be negative");
        }
        this.salary = salary;
    }

    public void work(){
        System.out.println(name + " is working hard");
    }


}
