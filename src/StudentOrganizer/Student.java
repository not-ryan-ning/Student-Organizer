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
public class Student {
    private String firstName;
    private String lastName;
    private String yearLevel;
    private String dateOfBirth; 
    private String parentalContact; 
    private String leavingMethod; 
    private String notes;
    private ArrayList<String> extracurriculars;
    private ArrayList<String> allergies; 
       
    // Constructors 
    public Student(String firstName, String lastName, String yearLevel, String dateOfBirth, String parentalContact, String leavingMethod, String notes, ArrayList<String> extracurriculars, ArrayList<String> allergies) {
        this.firstName = firstName;  
        this.lastName = lastName;
        this.yearLevel = yearLevel;
        this.dateOfBirth = dateOfBirth;
        this.parentalContact = parentalContact;
        this.leavingMethod = leavingMethod;
        this.notes = notes;
        this.extracurriculars = extracurriculars;
        this.allergies = allergies;
                
    }
    
    public Student(String firstName, String lastName, String yearLevel, String dateOfBirth, String parentalContact, String leavingMethod) {
        
        this(firstName, lastName, yearLevel, dateOfBirth, parentalContact, leavingMethod, "", new ArrayList<String>(), new ArrayList<String>()); 

    }
    
    // Getter methods 
    public String getFirstName() {
        return firstName;
    }
    
    public String getLastName() { 
        return lastName;
    }

    public String getYearLevel() {
        return yearLevel;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }
    
    public String getParentalContact() {
        return parentalContact;
    }

    public String getLeavingMethod() {
        return leavingMethod;
    }
        
    public String getNotes() {
        return notes; 
    }

    public ArrayList<String> getExtracurriculars() {
        return extracurriculars;
    }

    public ArrayList<String> getAllergies() {
        return allergies;
    }
        
    public String getDateOfBirthMonth() {
        String month = dateOfBirth.substring(3,5);
        
        return month;
    }
    
    public String getDateOfBirthDay() {
        String day = dateOfBirth.substring(0,2);
        
        if (day.substring(0,1).equals("0")) {
            return day.substring(1,2);
        } else {
            return day; 
        }     
    }

    // Setter methods
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    
    public void setLastName(String lastName) {
        this.lastName = lastName; 
    }

    public void setYearLevel(String yearLevel) {
        this.yearLevel = yearLevel;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public void setParentalContact(String parentalContact) {
        this.parentalContact = parentalContact;
    }

    public void setLeavingMethod(String leavingMethod) {
        this.leavingMethod = leavingMethod;
    }  
    
    public void setNotes(String notes) {
        this.notes = notes; 
    }

    public void setExtracurriculars(ArrayList extracurriculars) {
        this.extracurriculars = extracurriculars;
    }

    public void setAllergies(ArrayList allergies) {
        this.allergies = allergies;
    }
    
    @Override
    
    public String toString(){
        return firstName + " " + lastName + " " + yearLevel + " " + dateOfBirth + " " + parentalContact + " " + leavingMethod + " " + notes + " " + extracurriculars + " " + allergies;
    } 

}
