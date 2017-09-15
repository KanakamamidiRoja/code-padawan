import java.util.Date;

/**
 * An interface that provide a number of operations for any array of students
 *
 */
public interface StudentArrayOperation {

	/**
	 * Returns the array of students
	 * 
	 * @return the array of students
	 * 
	 */
	Student[] getStudents();
	



public class Person {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {



        Scanner kbd = new Scanner(System.in);
        Student newStudent = new Student();
        int size;

        System.out.println("Enter the amount of students:");
        size = kbd.nextInt();
        Student[] myStudent = new Student[size];
        String firstName;
        String lastName;
        int test1, test2, test3;
        Student s;

        for (int i=0; i < size; i++)
        {

        System.out.println("Enter first name of student: " + i);
        firstName = kbd.next();

        System.out.println("Enter last name if student: " +i);
        lastName = kbd.next();

        System.out.println("Please Enter first test score: ");
//        JOptionPane.showInputDialog("Please enter first test score:");
        test1= kbd.nextInt();

        System.out.println("Please enter second test score");
//        JOptionPane.showInputDialog("Please enter second test score:");
        test2= kbd.nextInt();

        System.out.println("Please enter third test score");
//        JOptionPane.showInputDialog("Please enter third test score:");
        test3=kbd.nextInt();

//        s = new Student (test1, test2, test3, firstName, lastName);
        myStudent[i].setTest1(test1);
        myStudent[i].setTest2(test2);
        myStudent[i].setTest3(test3);
        myStudent[i].setfName(fName);
        myStudent[i].setlName(lname);


        }
        for (int i = 0; i < size; i++)
        {
            System.out.println(myStudent[i].getGrade());
        }



    }
}


public class Student extends Person{

    int test1, test2, test3;
    double average;
    String grade, firstName, lastName;


    public Student() 
    {
        test1 = 0;
        test2 = 0;
        test3 = 0;
        average = 0;


    }




    public Student(int test1, int test2, int test3, String firstName, String lastName) 
    {
        this.test1 = test1;
        this.test2 = test2;
        this.test3 = test3;

        this.setfirstName = firstName;
    }


    public double computeAverage()
    {
        average = (test1 + test2 + test3)/3;
        return average;

    }

    public String calculateGrade()
    {
        average = computeAverage();

        if (average < 60){
            grade = "F";}
        else if (average < 70){
            grade = "D";}
        else if (average < 80){
            grade = "C";}
        else if (average < 90){
            grade = "B";}
        else {
            grade = "A";
        }
        return grade;
    }

    public int getTest1() {
        return test1;
    }

    public void setTest1(int test1) {
        this.test1 = test1;
    }

    public int getTest2() {
        return test2;
    }

    public void setTest2(int test2) {
        this.test2 = test2;
    }

    public int getTest3() {
        return test3;
    }

    public void setTest3(int test3) {
        this.test3 = test3;
    }

    public double getAverage() {
        return average;
    }



	/**
	 * Sets the array of students
	 * if students == null method should throw IllegalArgumentException
	 *
	 * @param students
	 * 
	 * @throws IllegalArgumentException
	 */
	void setStudents(Student[] students);
	

  public void setAverage(double average) {
        this.average = average;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }




	/**
	 * if index lower than 0 or index higher/equal students.length method should
	 * throw IllegalArgumentException
	 *
	 * @param index
	 */
	Student getStudent(int index);

	
	/**
	 * Replaces the element at the specified position in this array with the
	 * specified element. if student == null method should throw
	 * IllegalArgumentException if index lower than 0 or index higher/equal
	 * students.length method should throw IllegalArgumentException
	 *
	 * @param student
	 *            the student to be stored at the specified position
	 * @param index
	 *            the index of the element to replace
	 * 
	 * 
	 * @throws IllegalArgumentException
	 */
	void setStudent(Student student, int index);

	
	/**
	 * Appends the specified element to the specified position of this array if
	 * student == null method should throw IllegalArgumentException if index
	 * lower than 0 or index higher/equal students.length method should throw
	 * IllegalArgumentException
	 *
	 * @param student
	 *            the element to be appended to this array at the specified
	 *            position
	 * @param index
	 *            the specified position
	 * 
	 * @throws IllegalArgumentException
	 */
	void add(Student student, int index);

	
	/**
	 * Inserts the specified element at the beginning of this array if student
	 * == null method should throw IllegalArgumentException
	 *
	 * @param student
	 *            the element to add
	 * 
	 * @throws IllegalArgumentException
	 */
	void addFirst(Student student);
	

	/**
	 * Appends the specified element to the end of this array. if student ==
	 * null method should throw IllegalArgumentException
	 *
	 * @param student
	 *            the element to add
	 * 
	 * @throws IllegalArgumentException
	 */
	void addLast(Student student);
	

	/**
	 * Removes the element at the specified position in this array if index
	 * lower than 0 or index higher/equal students.length method should throw
	 * IllegalArgumentException
	 *
	 * @param index
	 *            the index of the element to be removed
	 * 
	 * @throws IllegalArgumentException
	 */
	void remove(int index);
	

	/**
	 * Removes the first occurrence of the specified element from this array, if
	 * it is present. If this array does not contain the element, it is
	 * unchanged and should throw IllegalArgumentException with "Student not
	 * exist" message if student == null method should throw
	 * IllegalArgumentException
	 *
	 * @param student
	 *            the element to remove
	 * 
	 * @throws IllegalArgumentException
	 */
	void remove(Student student);

	
	/**
	 * Removes all elements from the specified index (except the element with
	 * specified index) from this array if index lower than 0 or index
	 * higher/equal students.length method should throw IllegalArgumentException
	 *
	 * @param index
	 *            the index elements from should be removed
	 * 
	 * @throws IllegalArgumentException
	 */
	void removeFromIndex(int index);

	
	/**
	 * Removes all elements from the specified element (except the specified
	 * element) from this array if student == null method should throw
	 * IllegalArgumentException
	 *
	 * @param student
	 *            the element from elements should be removed
	 * 
	 * @throws IllegalArgumentException
	 */
	void removeFromElement(Student student);

	
	/**
	 * Removes all elements to the specified index (except the element with the
	 * specified index) from this array if index lower than 0 or index
	 * higher/equal students.length method should throw IllegalArgumentException
	 *
	 * @param index
	 *            the index elements to should be removed
	 * 
	 * @throws IllegalArgumentException
	 */
	void removeToIndex(int index);

	
	/**
	 * Removes all elements to the specified element (except the specified
	 * element) from this array if student == null method should throw
	 * IllegalArgumentException
	 *
	 * @param student
	 *            the element to elements should be removed
	 * 
	 * @throws IllegalArgumentException
	 */
	void removeToElement(Student student);
	

	/**
	 * Performs Bubble Sort to this array
	 *
	 */
	void bubbleSort();

	
	/**
	 * Returns all students with birthday to the specified date if date == null,
	 * method should throw IllegalArgumentException
	 * 
	 * @param date
	 *            the date that specify birthday to find students who was born
	 *            before that date and in that date
	 * 
	 * @return the array of students who was born before/in specified date
	 * 
	 * @throws IllegalArgumentException
	 */
	Student[] getByBirthDate(Date date);

	
	/**
	 * Returns all students with birthday to the specified range of dates
	 * including specified dates if firstDate == null or lastDate == null,
	 * method should throw IllegalArgumentException
	 * 
	 * @param firstDate
	 *            the date that specify birthday to find students from
	 * @param lastDate
	 *            the date that specify birthday to find students to
	 * 
	 * @return the array of students who was born in specified range of dates
	 * 
	 * @throws IllegalArgumentException
	 */
	Student[] getBetweenBirthDates(Date firstDate, Date lastDate);

	
	/**
	 * Returns all students with birthday to the specified date and in several
	 * days after the specified date if date == null, method should throw
	 * IllegalArgumentException
	 * 
	 * @param date
	 *            the date that specify birthday to find students from
	 * @param days
	 *            the number of days that specify the end date
	 * 
	 * @return the array of students who has birthday in specified date and
	 *         several days after
	 * 
	 * @throws IllegalArgumentException
	 */
	Student[] getNearBirthDate(Date date, int days);
	

	/**
	 * Find student at the specified position and calculate his age (total
	 * years) if indexOfStudent == 0, method should throw
	 * IllegalArgumentException
	 * 
	 * @param indexOfStudent
	 *            the index to find student and calculate age
	 * 
	 * @return student full years
	 * 
	 * @throws IllegalArgumentException
	 */
	int getCurrentAgeByDate(int indexOfStudent);

	
	/**
	 * Returns all students with age equal the specified age
	 * 
	 * @param age the age to find students
	 * 
	 * @return the array of students of the specified age
	 */
	Student[] getStudentsByAge(int age);
	

	/**
	 * Finds the maximum average mark for all students in this array
	 * and returns all students who has the maximum average mark
	 * 
	 * @return the array of students who has maximum average mark
	 * 
	 */
	Student[] getStudentsWithMaxAvgMark();

	
	/**
	 * Finds element which is the next to the specified element
	 * if student == null, method should throw IllegalArgumentException
	 * 
	 * @param student the element to which take the next element
	 * 
	 * @throws IllegalArgumentException
	 */
	Student getNextStudent(Student student);

}
