package com.suryarkrishna;

import java.util.List;

public class App {

    public static void main(String[] args) {

        IStudentDao studentDao = new StudentDao();

        // test saveStudent
        Student student = new Student("Surya", "Koda", "surya123@gmail.com");
        studentDao.saveStudent(student);

        // test updateStudent
        student.setFirstName("Ram");
        studentDao.updateStudent(student);

        // test getStudentById
        Student student2 = studentDao.getStudentById(student.getId());
        System.out.println(student2);

        // test getAllStudents
        List < Student > students = studentDao.getAllStudents();
        for(Student student1 : students) {
        	System.out.println(student1);        	
        }


        // test deleteStudent
       // studentDao.deleteStudent(student.getId());

    }
}