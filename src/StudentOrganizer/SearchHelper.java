/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StudentOrganizer;

import java.util.ArrayList;

/**
 *
 * @author ryan
 */
public class SearchHelper {
    
    // method to search students by first name return all matching students
    public ArrayList<Student> searchStudentFirstName(ArrayList<Student> studentData, String userSearch) {
        // ArrayList of results created
        ArrayList<Student> results = new ArrayList<>();
        
        // iterates through ArrayList containing all Student objects
        for (int i = 0; i < studentData.size(); i++) {
            
            // user search and student name is converted to lowercase to avoid capitalization mismatch errors
            userSearch = userSearch.toLowerCase();
            
            // for each student in ArrayList, get their first name attribute
            String currentStudent = studentData.get(i).getFirstName().toLowerCase();
           
            // check if currentStudent first name contains elements of search
            if (currentStudent.contains(userSearch)) {
                
                // if yes, they are added to results array
                results.add(studentData.get(i)); 
            }
            
        }
        // ArrayList all matching students (results) is returned 
        return results;
    }
    
    public ArrayList<Student> searchStudentLastName(ArrayList<Student> studentData, String userSearch) {
        
        ArrayList<Student> results = new ArrayList<>();
        
        for (int i = 0; i < studentData.size(); i++) {
            userSearch = userSearch.toLowerCase();
            String currentStudent = studentData.get(i).getLastName().toLowerCase();
           
            if (currentStudent.contains(userSearch)) {
                results.add(studentData.get(i)); 
            }
            
        }
        return results;
    }
    
    public ArrayList<Student> searchStudentDateOfBirth(ArrayList<Student> studentData, String userSearch) {
        
        ArrayList<Student> results = new ArrayList<>();
        
        for (int i = 0; i < studentData.size(); i++) {
            String currentStudent = studentData.get(i).getDateOfBirth();
           
            if (currentStudent.contains(userSearch)) {
                results.add(studentData.get(i)); 
            }
            
        }
        return results;
    }
    
    public ArrayList<Student> searchStudentYearLevel(ArrayList<Student> studentData, String userSearch) {
        
        ArrayList<Student> results = new ArrayList<>();
        
        for (int i = 0; i < studentData.size(); i++) {
            userSearch = userSearch.toLowerCase();
            String currentStudent = studentData.get(i).getYearLevel().toLowerCase();
            
            if (currentStudent.contains(userSearch)) {
                results.add(studentData.get(i)); 
            }
            
        }
        return results;
    }
    
    public ArrayList<Student> searchStudentParentalContact(ArrayList<Student> studentData, String userSearch) {
        
        ArrayList<Student> results = new ArrayList<>();
        
        for (int i = 0; i < studentData.size(); i++) {
            userSearch = userSearch.toLowerCase();
            String currentStudent = studentData.get(i).getParentalContact().toLowerCase();
           
            if (currentStudent.contains(userSearch)) {
                results.add(studentData.get(i)); 
            }
            
        }
        return results;
    }
    
    public ArrayList<Student> searchStudentLeavingMethod(ArrayList<Student> studentData, String userSearch) {
        
        ArrayList<Student> results = new ArrayList<>();
        
        for (int i = 0; i < studentData.size(); i++) {
            userSearch = userSearch.toLowerCase();
                String currentStudent = studentData.get(i).getLeavingMethod().toLowerCase();
           
            if (currentStudent.contains(userSearch)) {
                results.add(studentData.get(i)); 
            }
            
        }
        return results;
    }
    
    public ArrayList<Student> searchStudentExtracurriculars(ArrayList<Student> studentData, String userSearch) {
        
        ArrayList<Student> results = new ArrayList<>();
        
        for (int i = 0; i < studentData.size(); i++) {
            userSearch = userSearch.toLowerCase();
            ArrayList<String> currentStudent = studentData.get(i).getExtracurriculars();
            
            // for the amount of extracurriculars that the current student has, if one contains matching to the user input, the student is added to the results. 
            for (String extracurriculars : currentStudent) {   
                if (extracurriculars.toLowerCase().contains(userSearch)) {
                    results.add(studentData.get(i)); 
                }
            }
            
        }
        return results;

    }
    
    public ArrayList<Student> searchStudentAllergies(ArrayList<Student> studentData, String userSearch) {
        
        ArrayList<Student> results = new ArrayList<>();
        
        for (int i = 0; i < studentData.size(); i++) {
            userSearch = userSearch.toLowerCase();
            ArrayList<String> currentStudent = studentData.get(i).getAllergies();
            
            for (String allergies : currentStudent) {
            
                if (allergies.toLowerCase().contains(userSearch)) {
                    results.add(studentData.get(i)); 
                }
            }
            
        }
        return results;
    }
    
    public ArrayList<Student> searchBirthdayMonth (ArrayList<Student> studentData, String month) {
        
        ArrayList<Student> results = new ArrayList<>();
        
        for (int i = 0; i < studentData.size(); i++){
            String currentStudentBirthdayMonth = studentData.get(i).getDateOfBirthMonth();
            
            if (currentStudentBirthdayMonth.equals(month)) {
                results.add(studentData.get(i));
            }
            
        }

        return results;
        
    }

    public Student findStudent(ArrayList<Student> studentData, String firstName, String lastName) {
        
        Student foundStudent = null;
        
        for (Student student : studentData) {
            
            String currentFirstName = student.getFirstName().toLowerCase();
            String currentLastName = student.getLastName().toLowerCase();
            
            if (currentFirstName.equals(firstName.toLowerCase()) && currentLastName.equals(lastName.toLowerCase())) {
                foundStudent = student;  
            }
  
        }
        
        return foundStudent;
        
    }
    
    // method to find a particular ClassGroup 
    public ClassGroup findClass(ArrayList<ClassGroup> classData, String yearLevel) {
        // blank 'found' ClassGroup created 
        ClassGroup foundClass = null;
        
        String searchYearLevel = yearLevel.toLowerCase();
        
        // iterate through all ClassGroups
        for (int i = 0; i < classData.size(); i++) {
            // get class name attribute of current class
            String currentClassYear = classData.get(i).getClassName().toLowerCase();
            
            // check if year of current ClassGroup matches search
            if (searchYearLevel.equals(currentClassYear)){
                
                // if yes, ClassGroup is retrieved from classData and stored in foundClass variable
                foundClass = classData.get(i); 
            }
        }
        // foundClass is returned
        return foundClass;

    }
    
    // method to find a particular StudentGrade
    public StudentGrade findGrade(ArrayList<StudentGrade> gradeData, String firstName, String lastName) {
        // blank 'found' StudentGrade created 
        StudentGrade foundGrade = null;
        
        String searchFirst = firstName.toLowerCase();
        String searchLast = lastName.toLowerCase(); 
        
        // iterate through all StudentGrades
        for (int i = 0; i < gradeData.size(); i++) {
            // get first and last name attributes of current StudentGrade
            String currentFirst = gradeData.get(i).getFirstName().toLowerCase();
            String currentLast = gradeData.get(i).getLastName().toLowerCase();
            
            // check if current StudentGrade's first and last name attribute matches search
            if (searchFirst.equals(currentFirst) && searchLast.equals(currentLast)) {
                
                // if yes, StudentGrade is retrieved from gradeData and stored in foundGrade variable
                foundGrade = gradeData.get(i);
            }
            
        }
        // foundGrade is returned
        return foundGrade;
    }
        
}
