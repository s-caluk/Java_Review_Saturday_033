package week06_review;

public class Employee {
    public String name;
    public int age;
    public char gender;
    public String jobTitle;
    public double salary;
    public boolean isFullTime;
    public boolean isMarried;

    //sagklik > generate > construktor > tüm attributleri sec > otomatik olusturuyor
    public void setInfo(String name, int age, char gender, String jobTitle, double salary, boolean isFullTime, boolean isMarried) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.jobTitle = jobTitle;
        this.salary = salary;
        this.isFullTime = isFullTime;
        this.isMarried = isMarried;
    }

    public void work(){
        System.out.println(name + " is working hard");
    }


    // sag klik > generate > toString...
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary=" + salary +
                ", isFullTime=" + isFullTime +
                ", isMarried=" + isMarried +
                '}';
    }
}

/*
1. Create a class named Employee with the following attributes and actions:

      Attributes:
            name (String): used for storing the name of the employee
            age (int): used for storing the age of the employee
            gender (char): used for storing the gender of the employee
            jobTitle (String): used for storing the job title of the employee
            salary (double): used for storing the job title

      Actions:
            work(): prints the job title and name of the employee concatenated with " is working."

            toString(): returns a string representation of the employee object.

      Create another class named EmployeeClients, create multiple employee objects, and test each function of the employee object.
 */
