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
public class StudentGrade {
    private String firstName;
    private String lastName;
    private ArrayList<String> grades; 
    
    public StudentGrade(String firstName, String lastName, ArrayList<String> grades) {
        this.firstName = firstName;
        this.lastName = lastName; 
        this.grades = grades;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public ArrayList<String> getGrades() {
        return grades;
    }
    
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setGrades(ArrayList<String> grades) {
        this.grades = grades;
    }

    @Override
    public String toString() {
        return "StudentGrade{" + "firstName=" + firstName + " lastName=" + lastName + " grades=" + grades + '}';
    }
    
}
