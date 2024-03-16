package org.example.creational.prototype;

/**
 * @author ANUPAM DAS
 * Date : 3/11/2024
 * Time : 12:44 PM
 */

public class Main {
    public static void main(String[] args) {
        Student student = new Student();
        Student newCloneObj = (Student) student.clone();
        System.out.println(newCloneObj.toString());
    }
}
