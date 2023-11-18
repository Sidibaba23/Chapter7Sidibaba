/**
 * Class: SchoolTester
 * @author Sidibaba Simpara
 * @version 1.0
 * Written: November 14, 2023
 * Course: ITEC 2140 Section 9, Fall 2023
 * Description: This class/program will print out which student is the oldest and
 * which is the youngest
 */
public class SchoolTester {

    public static void main(String[] args) {
        School school = new School();
        Student stud1 = new Student("Han",1,34,3.2,33);
        Student stud2 = new Student("Ben",2,23,4,2);
        Student stud3 = new Student("Frank",3, 42,2.4,66);
        school.addStudent(stud1);
        school.addStudent(stud2);
        school.addStudent(stud3);

        System.out.println(school.findOldestStudent());
    }
}
