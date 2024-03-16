package org.example.prototype;

/**
 * @author ANUPAM DAS
 * Date : 3/11/2024
 * Time : 12:42 PM
 */

public class Student implements Prototype{

    int age;
    private int rollNumber;
    String name;

    Student(){

    }

    Student(int age, int rollNumber, String name) {
        this.age = age;
        this.rollNumber = rollNumber;
        this.name = name;
    }

    @Override
    public Prototype clone() {
        return new Student(age, rollNumber, name);
    }

    @Override
    public String toString() {
        return "Student{" +
                "age=" + age +
                ", rollNumber=" + rollNumber +
                ", name='" + name + '\'' +
                '}';
    }
}
