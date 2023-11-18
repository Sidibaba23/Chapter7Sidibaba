/**
 * Class: School
 * @author Sidibaba Simpara
 * @version 1.0
 * Written: November 14, 2023
 * Course: ITEC 2140 Section 9, Fall 2023
 * Description: This class/program will find the youngest
 * and oldest students in the arraylist
 */

import java.util.ArrayList;
public class School {
    ArrayList<Student> list ;

    public School(){
        list = new ArrayList<>();
    }

    public void addStudent(Student student){
        list.add(student);
    }

   public void removeStudent(Student stud){
        list.remove(stud);
   }

    public Student findYoungestStudent(){
        int minAge = Integer.MAX_VALUE;
        Student youngest = null;
        for (Student find:list) {
            if(find.getAge() < minAge){
                minAge = find.getAge();
                youngest = find;
            }
        }
        return youngest;
    }
    public Student findOldestStudent(){
        int maxAge = Integer.MIN_VALUE;
        Student oldest = null;
        for (Student find:list) {
            if(find.getAge() > maxAge){
                maxAge = find.getAge();
                oldest = find;
            }
        }
        return oldest;
    }

}

