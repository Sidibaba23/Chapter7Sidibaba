/**
 * Class: StudentTester
 * @author Sidibaba Simpara
 * @version 1.0
 * Written: November 10, 2023
 * Course: ITEC 2140 Section 9, Fall 2023
 * Description: This class/program will print out the values
 * from Student class and if the students' id is equal to
 * one another
 */
public class StudentTester {

    public static void main(String[] args) {
        Student stud1 = new Student("Joe",900243122,34,3.2,33);
        Student stud2 = new Student("Luke",90046272,23,4,2);
        Student stud3 = new Student("Han",900243122, 42,2.4,66);

        boolean comp1 = stud1.equals(stud2);
        boolean comp2 = stud1.equals(stud3);
        System.out.println(comp1);
        System.out.println(comp2);
        System.out.println(stud1);
        System.out.println(stud2);


    }
}
