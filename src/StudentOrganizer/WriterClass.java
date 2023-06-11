/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StudentOrganizer;

import java.io.File;
import java.io.PrintWriter;
import java.util.ArrayList;

/**
 *
 * @author ryan
 */
public class WriterClass {

    File classFile = new File("classFile.txt");
    File gradeFile = new File("gradeFile.txt");

    // method to save student information from student ArrayList
    public void saveStudentInformation(ArrayList<Student> studentData) throws Exception {
        // destination file of printing is found
        File studentFile = new File("studentFile.txt");

        try (PrintWriter filePrinter = new PrintWriter(studentFile);) {

            // iterates through the entire student arraylist
            for (Student student : studentData) {

                // for each student, prints information and space
                // space allows reader to differentiate strings
                filePrinter.print(student.getFirstName() + " ");
                filePrinter.print(student.getLastName() + " ");
                filePrinter.print(student.getYearLevel() + " ");
                filePrinter.print(student.getDateOfBirth() + " ");
                filePrinter.print(student.getParentalContact() + " ");
                filePrinter.print(student.getLeavingMethod() + " ");
                filePrinter.print(student.getNotes() + " ");

                ArrayList<String> extracurriculars = student.getExtracurriculars();

                // iterates through all the extracurriculars
                for (String activity : extracurriculars) {
                    filePrinter.print(activity + " ");
                }

                // prints * to mark end of extracurriculars
                filePrinter.print("* ");

                ArrayList<String> allergies = student.getAllergies();

                // iterates through all the allergies
                for (String allergy : allergies) {
                    filePrinter.print(allergy + " ");
                }

                // prints * to mark end of allergies
                filePrinter.print("* ");

                // moves to the next line for next student's information
                filePrinter.println();

            }
        }

    }

    public void saveClassInformation(ArrayList<ClassGroup> classData) throws Exception {

        try (PrintWriter filePrinter = new PrintWriter(classFile);) {

            for (ClassGroup currentClass : classData) {

                filePrinter.println(currentClass.getClassName());

                ArrayList<String> activities = currentClass.getActivities();

                for (String activity : activities) {
                    filePrinter.print(activity + " ");
                }

                filePrinter.println("*");

            }
        }

    }

    public void saveGradeInformation(ArrayList<StudentGrade> gradeData) throws Exception {

        try (PrintWriter filePrinter = new PrintWriter(gradeFile);) {

            for (StudentGrade currentGrade : gradeData) {

                filePrinter.print(currentGrade.getFirstName() + " " + currentGrade.getLastName() + " ");

                ArrayList<String> grades = currentGrade.getGrades();

                for (String grade : grades) {
                    filePrinter.print(grade + " ");
                }

                filePrinter.println("*");

            }
        }
    }

}
