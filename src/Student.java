
/**
 * Class: Student
 * @author Sidibaba Simpara
 * @version 1.0
 * Written: November 10, 2023
 * Course: ITEC 2140 Section 9, Fall 2023
 * Description: This class/program will get the student
 * id, age, gpa and credit hours. It'll also make sure
 * if the student id equal to another student's id
 */

import java.util.Objects;

public class Student {

    private String name;
    private int id;
    private int age;
    private double gpa;
    private int creditHours;


    public Student(String name, int id, int age, double gpa, int creditHours) {
        this.name = name;
        this.id = id;
        this.age = age;
        this.gpa = gpa;
        this.creditHours = creditHours;
    }
    public String getName(){
        return name;
    }
    public void setName(String n){
        this.name = n;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public int getCreditHours() {
        return creditHours;
    }

    public void setCreditHours(int ch) {
        this.creditHours = ch;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return id == student.id;
    }

    @Override
    public String toString(){
        return name + "'s id is " + id ;
    }
}
