package week11_review.constructor_static;

/**
 * This class represents a Cydeo student.
 *
 * @author <NAME>
 * @version 1.0
 */
public class CydeoStudent {
    /**
     * The name of the student.
     */
    public String name;
    /**
     * The age of the student.
     */
    public int age;
    /**
     * The ID of the student.
     */
    public String id;
    /**
     * The grade of the student.
     */
    public char grade;
    /**
     * The batch number of the student.
     */
    public int batchNumber;
    /**
     * The group number of the student.
     */
    public int groupNumber;
    /**
     * The name of the school.
     */
    public static String schoolName = "Cydeo";
    /**
     * The programming language used.
     */
    public static String programmingLanguage = "Java";

    /**
     * Creates a new Cydeo student with the specified details.
     *
     * @param name The name of the student.
     * @param age The age of the student.
     * @param id The ID of the student.
     * @param grade The grade of the student.
     * @param batchNumber The batch number of the student.
     * @param groupNumber The group number of the student.
     */
    public CydeoStudent(String name, int age, String id, char grade, int batchNumber, int groupNumber) {
        this.name = name;
        this.age = age;
        this.id = id;
        this.grade = grade;
        this.batchNumber = batchNumber;
        this.groupNumber = groupNumber;
    }

    /**
     * Studies for an exam.
     */
    public void study() {
        System.out.println(name + " is studying.");
    }

    /**
     * Attends a live class.
     */
    public void attendClass() {
        System.out.println(name + " is attending the live class.");
    }

    /**
     * Prints the school name.
     */
    public static void printSchoolName() {
        System.out.println(schoolName);
    }

    /**
     * Prints the programming language.
     */
    public static void printProgLanguage() {
        System.out.println(programmingLanguage);
    }

    @Override
    public String toString() {
        return "CydeoStudent{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", id='" + id + '\'' +
                ", grade=" + grade +
                ", batchNumber=" + batchNumber +
                ", groupNumber=" + groupNumber +
                '}';
    }
}

/*
4. Create a custom class named CydeoStudent with the following specifications:

	Attributes:
			name
			age
			id
			grade
			batchNumber
			groupNumber
			schoolName (static)
			programmingLanguage (static)

	Constructors:
			Add a constructor that can set all the fields

	Actions:
		study(): displays the name of the Cydeo student on the console with the concatenated message "is studying."
		attendClass(): displays the name of the Cydeo student on the console with the concatenated message "is attending the live class."
		printSchoolName(): displays the school name
		printProgLanguage(): displays the name of the programming language
		toString(): returns a string representation of the CydeoStudent object.

	Create another class named CydeoStudentClients, create multiple CydeoStudent objects, and test each function of the CydeoStudent object.
 */

