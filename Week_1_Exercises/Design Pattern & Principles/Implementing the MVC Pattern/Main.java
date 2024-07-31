package com.example;

import com.example.model.Student;
import com.example.view.StudentView;
import com.example.controller.StudentController;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter student ID: ");
        String id = scanner.nextLine();

        System.out.print("Enter student name: ");
        String name = scanner.nextLine();

        System.out.print("Enter student grade: ");
        String grade = scanner.nextLine();

        Student student = new Student(name, id, grade);

        StudentView view = new StudentView();

        StudentController controller = new StudentController(student, view);

        controller.updateView();

        System.out.print("Enter new student name: ");
        String newName = scanner.nextLine();

        System.out.print("Enter new student grade: ");
        String newGrade = scanner.nextLine();

        controller.setStudentName(newName);
        controller.setStudentGrade(newGrade);

        controller.updateView();

        scanner.close();
    }
}
