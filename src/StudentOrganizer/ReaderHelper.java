/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StudentOrganizer;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author ryan
 */
public class ReaderHelper {
    Scanner reader = null;
    
    // method to read students from file
    public ArrayList<Student> readStudentInformation() {
        // file to be read from is found
        File studentFile = new File("studentFile.txt");
        
        // ArrayList of students created
        ArrayList<Student> studentData = new ArrayList<>();
        
        // try to read file, catch error if file could not be read
        try {
            reader = new Scanner(studentFile);
        } catch (Exception e) {
            System.out.println("File could not be read: " + e.getMessage());
            return studentData;
        }
        
        // reading the required components to make a student from file
        while (reader.hasNext()) {      
            String firstName = reader.next();
            String lastName = reader.next();
            String yearLevel = reader.next();
            String dateOfBirth = reader.next();
            String parentalContact = reader.next();
            String leavingMethod = reader.next();
            String notes = reader.next();

            ArrayList<String> extracurriculars = new ArrayList<>();
            ArrayList<String> allergies = new ArrayList<>(); 
            
            // reading extracurriculars and allergies into ArrayLists 
            // separated by the character *
            
            String next = reader.next();
            
            // * marks the end of extracurriculars 
            while (!next.equals("*")) { 
                extracurriculars.add(next);
                next = reader.next();
            }
            
            // reader must point to the next item after seperator
            next = reader.next(); 
            
            // * marks the end of allergies
            while (!next.equals("*")) {
                allergies.add(next);
                next = reader.next();
            }
            
            // new student is created
            // all details inputted, obscured due to length
            Student student = new Student(firstName, lastName, yearLevel, dateOfBirth, parentalContact, leavingMethod, notes, extracurriculars, allergies);            
            studentData.add(student);
            
            // reader pointer moved to next line if there is still data
            if (reader.hasNext()) {
                reader.nextLine();
            }
        }
        
        return studentData; 

    }
    
    // method to read class activities
    public ArrayList<ClassGroup> readClassActivities() {
        // file to be read from is found
        File classFile = new File("classFile.txt");
        
        // ArrayList of ClassGroups created
        ArrayList<ClassGroup> classData = new ArrayList<>();
        
        // try to read file, catch error if file could not be read
        try {
            reader = new Scanner(classFile);
        } catch (Exception e) {
            System.out.println("File could not be read: " + e.getMessage());
            return classData;
        }
        
        // reading the required components to make a class group from file
        while (reader.hasNext()) {
            String yearLevel = reader.next();
            
            ArrayList<String> activities = new ArrayList<>(); 
            
            String next = reader.next();
            
            // * marks the end of the current ClassGroup
            while (!next.equals("*")) {
                activities.add(next);
                next = reader.next();
            }
            
            // new ClassGroup is created
            ClassGroup classGroup = new ClassGroup(yearLevel, activities);
            classData.add(classGroup);
            
            // reader pointer moved to next line if there is still data
            if (reader.hasNext()) {
                reader.nextLine();
            }
            
        }
        
        return classData;
    }
    
    // method to read student grades
    public ArrayList<StudentGrade> readStudentGrades() {
        // file to be read from is found
        File gradeFile = new File("gradeFile.txt"); 
        
        // ArrayList of grades created
        ArrayList<StudentGrade> gradeData = new ArrayList<>();
        
        // try to read file, catch error if file could not be read
        try {
            reader = new Scanner(gradeFile);
        } catch (Exception e) {
            System.out.println("File could not be read: " + e.getMessage());
            return gradeData;
        }
        
        // reading the required components to make a student grade from file
        while (reader.hasNext()) {
            String firstName = reader.next();
            String lastName = reader.next();
            
            ArrayList<String> grades = new ArrayList<>(); 

            String next = reader.next();
            
            // * notes the end of the current StudentGrade
            while (!next.equals("*")) {
                grades.add(next);
                next = reader.next();
            }
            
            // new StudentGrade is created
            StudentGrade studentGrade = new StudentGrade(firstName, lastName, grades);
            gradeData.add(studentGrade);
            
            // reader pointer moved to next line if there is still data
            if (reader.hasNext()) {
                reader.nextLine();
            }
        }
        
        return gradeData;
   
    }

}
