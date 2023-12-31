/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StudentOrganizer;

import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

/**
 *
 * @author ryan
 */
public class ClassEditor extends javax.swing.JFrame {

    /**
     * Creates new form ClassEditor
     */
    ArrayList<Student> studentData;
    ArrayList<ClassGroup> classData;
    ArrayList<StudentGrade> gradeData;

    SearchHelper searcher = new SearchHelper();
    WriterClass writer = new WriterClass();
    ReaderHelper reader = new ReaderHelper();

    File classFile = new File("classFile.txt");
    File gradeFile = new File("gradeFile.txt");
    File studentFile = new File("studentFile.txt");

    DefaultListModel<String> activitiesModel = new DefaultListModel<>();

    public ClassEditor() {
        studentData = reader.readStudentInformation();
        classData = reader.readClassActivities();
        gradeData = reader.readStudentGrades();

        initComponents();

        addClassesToYearCBox();

        currentClassData();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        activitiesLabel = new javax.swing.JLabel();
        activitiesTextField = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        activitiesList = new javax.swing.JList<>();
        addActivityButton = new javax.swing.JButton();
        removeActivityButton = new javax.swing.JButton();
        yearCBox = new javax.swing.JComboBox<>();
        returnButton = new javax.swing.JButton();
        classLabel = new javax.swing.JLabel();
        confirmChangesButton = new javax.swing.JButton();
        titleLabel = new javax.swing.JLabel();
        newClassNameTextField = new javax.swing.JTextField();
        newClassLabel = new javax.swing.JLabel();
        deleteClassButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Class Editor");

        activitiesLabel.setText("Activities:");

        activitiesTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                activitiesTextFieldActionPerformed(evt);
            }
        });

        activitiesList.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                activitiesListMousePressed(evt);
            }
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                activitiesListMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(activitiesList);

        addActivityButton.setText("Add");
        addActivityButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addActivityButtonActionPerformed(evt);
            }
        });

        removeActivityButton.setText("Remove");
        removeActivityButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeActivityButtonActionPerformed(evt);
            }
        });

        yearCBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yearCBoxActionPerformed(evt);
            }
        });

        returnButton.setForeground(new java.awt.Color(244, 94, 89));
        returnButton.setText("Return");
        returnButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                returnButtonActionPerformed(evt);
            }
        });

        classLabel.setText("Class:");

        confirmChangesButton.setForeground(new java.awt.Color(94, 244, 9));
        confirmChangesButton.setText("Confirm");
        confirmChangesButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmChangesButtonActionPerformed(evt);
            }
        });

        titleLabel.setFont(new java.awt.Font("Lucida Grande", 0, 15)); // NOI18N
        titleLabel.setText("Class Editor");

        newClassNameTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newClassNameTextFieldActionPerformed(evt);
            }
        });

        newClassLabel.setText("New Class Name:");

        deleteClassButton.setText("Delete");
        deleteClassButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteClassButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(activitiesLabel)
                            .addComponent(classLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(addActivityButton, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(removeActivityButton))
                            .addComponent(activitiesTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(confirmChangesButton)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(yearCBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(newClassLabel)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 223, Short.MAX_VALUE)
                            .addComponent(newClassNameTextField)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(returnButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 143, Short.MAX_VALUE)
                        .addComponent(titleLabel)
                        .addGap(98, 98, 98)
                        .addComponent(deleteClassButton, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(11, Short.MAX_VALUE)
                        .addComponent(returnButton)
                        .addGap(0, 5, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(deleteClassButton)
                        .addComponent(titleLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(yearCBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(classLabel)
                    .addComponent(newClassNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(newClassLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(activitiesTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(activitiesLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(addActivityButton)
                            .addComponent(removeActivityButton))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(confirmChangesButton, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap(11, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(530, 220));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void activitiesTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_activitiesTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_activitiesTextFieldActionPerformed

    private void activitiesListMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_activitiesListMousePressed
        // TODO add your handling code here:
        String selected = activitiesList.getSelectedValue();

        activitiesTextField.setText(selected);
    }//GEN-LAST:event_activitiesListMousePressed

    private void activitiesListMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_activitiesListMouseClicked
        // TODO add your handling code here:
        ;
    }//GEN-LAST:event_activitiesListMouseClicked

    private void addActivityButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addActivityButtonActionPerformed
        // get user inputted text from extracurricular TextField
        String activity = activitiesTextField.getText();

        // check if extracurricular is blank 
        if (!activity.isEmpty()) {
            // if not, add extracurricular to JList model (extracurricularsModel)
            activitiesModel.addElement(activity);
            // update model
            activitiesList.setModel(activitiesModel);
        } else {
            // if blank, output appropriate error message
            JOptionPane.showMessageDialog(null, "Error: Class activity cannot be blank.", "Error", JOptionPane.ERROR_MESSAGE);
        }
        // reset TextField to blank 
        activitiesTextField.setText("");
    }//GEN-LAST:event_addActivityButtonActionPerformed

    private void removeActivityButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeActivityButtonActionPerformed
        // get user inputted text from activity TextField
        String selectedActivity = activitiesTextField.getText().toLowerCase();

        // loop through each item currently in activities JList model
        for (int i = 0; i < activitiesModel.getSize(); i++) {
            // get current item 
            String currentActivity = activitiesModel.getElementAt(i).toLowerCase();
   
            // check if user inputted activities matches current item
            if (currentActivity.equals(selectedActivity)) {
                // if yes, remove element from activities JList model
                activitiesModel.removeElementAt(i);

                // update model
                activitiesList.setModel(activitiesModel);
            } 
        }
        // reset TextField to blank
        activitiesTextField.setText("");
    }//GEN-LAST:event_removeActivityButtonActionPerformed

    // method to handle return button pressed 
    private void returnButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_returnButtonActionPerformed
        // create and show GradeTable
        GradeTable gradeTable = new GradeTable();
        gradeTable.show();
        // close current frame 
        dispose();
    }//GEN-LAST:event_returnButtonActionPerformed

    // method to handle confirm button pressed 
    private void confirmChangesButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmChangesButtonActionPerformed
        // find selected class to be edited
        ClassGroup selectedClass = searcher.findClass(classData, yearCBox.getSelectedItem().toString());
        
        // get activities from JList
        ArrayList<String> activities = returnActivities();
        
        // used to check whether or not inputted data is valid
        boolean flag = true;

        // check if there is at least one activity
        if (activities.isEmpty()) {
            // if not, flag is triggered
            flag = false;
            
            // appropriate error message displayed to user 
            // details obscured due to size restriction
            JOptionPane.showMessageDialog(null, "Error: Please ensure that there is at least one activity.", "Error", JOptionPane.ERROR_MESSAGE);

        }
        // create String to store class name
        String className = "";
        
        // check if class name textfield has been used
        if (!newClassNameTextField.getText().equals("")) {
            // if yes, get data from textfield and set to className (changed)
            className = newClassNameTextField.getText();

        } else {
            // if not, set className to old className (unchanged)
            className = selectedClass.getClassName();
        }

        // only if flag is true (all data is valid) will a new class be created
        if (flag) { 
            
            // create editted ClassGroup with inputted data
            ClassGroup edittedClass = new ClassGroup(className, activities);
            
            // add editted ClassGroup to classData ArrayList
            classData.add(edittedClass);
            
            // remove old selected class from classData
            classData.remove(selectedClass);

            // save classData information by using the appropriate writer method 
            try {
                writer.saveClassInformation(classData);
            } catch (Exception e) {
                System.out.println("error");
            }
            
            // update necessary components of student information
            updateStudentInformation(selectedClass);
            
            // create and show GradeTable
            GradeTable gradeTable = new GradeTable();
            gradeTable.show();
            // close current frame 
            dispose();
        }


    }//GEN-LAST:event_confirmChangesButtonActionPerformed

    // method to handle change in year ComboBox selection
    private void yearCBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yearCBoxActionPerformed
        // refresh table with selected year 
        currentClassData();
    }//GEN-LAST:event_yearCBoxActionPerformed

    private void newClassNameTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newClassNameTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_newClassNameTextFieldActionPerformed

    // method to handle delete class button pressed 
    private void deleteClassButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteClassButtonActionPerformed
        // find selected class
        ClassGroup selectedClass = searcher.findClass(classData, yearCBox.getSelectedItem().toString());
        
        // find any students in the selected class
        ArrayList<Student> results = searcher.searchStudentYearLevel(studentData, selectedClass.getClassName());

        // if there are no students in selected class
        // ie. results is empty
        if (results.isEmpty()) {
            // remove selected class from classData ArrayList
            classData.remove(selectedClass);
            
            // save classData using appropriate writer method
            try {
                writer.saveClassInformation(classData);
            } catch (Exception e) {
                System.out.println("error");
            }
            // create and show GradeTable
            GradeTable gradeTable = new GradeTable();
            gradeTable.show();
            // close current frame 
            dispose();
        } else {
            // display the appropriate error message for deleting a class with students 
            // partially obscured due to size constraints 
            JOptionPane.showMessageDialog(null, "Error: Please ensure that there are no more students in a class before removing it.", "Error", JOptionPane.ERROR_MESSAGE);

        }

    }//GEN-LAST:event_deleteClassButtonActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ClassEditor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ClassEditor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ClassEditor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ClassEditor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ClassEditor().setVisible(true);
            }
        });
    }

    public void currentClassData() {

        String currentClassName = yearCBox.getSelectedItem().toString();

        ClassGroup selectedClass = searcher.findClass(classData, currentClassName);

        ArrayList<String> activities = selectedClass.getActivities();

        activitiesModel.removeAllElements();

        for (int i = 0; i < selectedClass.getActivitiesNumber(); i++) {

            // _ used to seperate words is replaced with a space
            String activity = activities.get(i).replaceAll("_", " ");

            activitiesModel.addElement(activity);
        }

        activitiesList.setModel(activitiesModel);

    }

    public void addClassesToYearCBox() {
        for (int i = 0; i < classData.size(); i++) {
            yearCBox.addItem(classData.get(i).getClassName());
        }

    }

    // method to update necessary student information
    public void updateStudentInformation(ClassGroup selectedClass) {
        // get old activities from selected class 
        ArrayList<String> oldActivities = selectedClass.getActivities();
        
        // replace _ with space in activites to match format of new activites
        for (int i = 0; i < oldActivities.size(); i++) {
            String modified = oldActivities.get(i);
            oldActivities.set(i, modified.replace("_", " "));
        }
        
        // create ArrayList to store new activities
        ArrayList<String> newActivities = new ArrayList<String>();

        // for each element in activites JList model, add it to new activities ArrayList 
        for (int i = 0; i < activitiesModel.getSize(); i++) {
            newActivities.add(activitiesModel.getElementAt(i));
        }

        // find all students in the classgroup being editted 
        ArrayList<Student> students = searcher.searchStudentYearLevel(studentData, selectedClass.getClassName());

        // check if new class name has been inputted
        if (!newClassNameTextField.getText().equals("")) {
            
            // if yes, loop thorough each student
            for (Student student : students) {
                
                // remove them from studentData ArrayList
                studentData.remove(student);
                
                // change their class name
                student.setYearLevel(newClassNameTextField.getText());
                
                // re-add them to ArrayList
                studentData.add(student);
            }
            
            // save studentData with appropriate writer method
            try {
                writer.saveStudentInformation(studentData);
            } catch (Exception e) {
                System.out.println("error");
            }
        }
        
        // check if class activites have been changed 
        if (!oldActivities.equals(newActivities)) {
            // if yes, find all student grades in this classgroup
            ArrayList<StudentGrade> studentGrades = new ArrayList<>();

            for (int i = 0; i < students.size(); i++) {
                studentGrades.add(searcher.findGrade(gradeData, students.get(i).getFirstName(), students.get(i).getLastName()));
            }
            
            // create new index of activities to be removed 
            ArrayList<Integer> indexes = new ArrayList<>();
            
            // for each old activity of the ClassGroup, check if it is in new activities ArrayList
            for (int i = 0; i < oldActivities.size(); i++) {
                
                if (!newActivities.contains(oldActivities.get(i))) {
                    // if not, add it to ArrayList of indexes to remove from student grades 
                    indexes.add(i);
                }

            }
            
            // sort indexes to be removed
            Collections.sort(indexes); 
            
            // reverse indexes, so largest is removed first without impacting other indexes
            Collections.reverse(indexes); 

            // iterate through each StudentGrade associated with editted classgroup 
            for (int i = 0; i < studentGrades.size(); i++) {
                // create an ArrayList copy of the student's grades attribute from current StudentGrade  
                ArrayList<String> currentGrade = new ArrayList<>(studentGrades.get(i).getGrades());
                
                // for each index stored in indexes ArrayList (containing old activities that were removed) 
                // remove the corresponding index of gradeData from the ArrayList copy
                for (int index : indexes) {
                    currentGrade.remove(index);
                }
                
                // remove the current StudentGrade object
                gradeData.remove(studentGrades.get(i)); 
                
                // create a new (updated) object using the ArrayList copy
                StudentGrade updatedGrade = new StudentGrade(students.get(i).getFirstName(), students.get(i).getLastName(), currentGrade);
                
                // add updated to gradeData 
                gradeData.add(updatedGrade);
            }
            
            // refresh studentGrades ArrayList with updated StudentGrades
            studentGrades.removeAll(studentGrades);
            for (int i = 0; i < students.size(); i++) {
                studentGrades.add(searcher.findGrade(gradeData, students.get(i).getFirstName(), students.get(i).getLastName()));
            }
                    
            int count = 0;
            
            // for each new activity not in the old activities ArrayList 
            for (int i = 0; i < newActivities.size(); i++) {
                if (!oldActivities.contains(newActivities.get(i))) {
                    // increase count by 1
                    count += 1;
                }
            }
            
            // for each studentGrade associated with ClassGroup
            for (int i = 0; i < studentGrades.size(); i++) {
                // create ArrayList copy of current grades 
                ArrayList<String> currentGrade = new ArrayList<>(studentGrades.get(i).getGrades());

                for (int j = 0; j < count; j++) {
                    // add one N/A (blank) grade for each count (new activity added) to the copied ArrayList
                    currentGrade.add("N/A");
                }
                
                // remove old StudentGrade object
                gradeData.remove(studentGrades.get(i));
                
                // create updated StudentGrade object with ArrayList copy 
                StudentGrade updatedGrade = new StudentGrade(students.get(i).getFirstName(), students.get(i).getLastName(), currentGrade);
                
                // add updated StudentGrade to gradeData
                gradeData.add(updatedGrade);
            }
            
            // save gradeData with appropriate writer method 
            try {
                writer.saveGradeInformation(gradeData);
            } catch (Exception e) {
                System.out.println("error");
            }

        }

    }

    public ArrayList<String> returnActivities() {
        ArrayList<String> activities = new ArrayList<>();

        for (int i = 0; i < activitiesModel.getSize(); i++) {
            // remove all trailing/leading spaces
            String activity = activitiesModel.getElementAt(i).trim();

            // remaining spaces between words are replaced with _
            activity = activity.replaceAll("\\s", "_");

            activities.add(activity);
        }

        return activities;
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel activitiesLabel;
    private javax.swing.JList<String> activitiesList;
    private javax.swing.JTextField activitiesTextField;
    private javax.swing.JButton addActivityButton;
    private javax.swing.JLabel classLabel;
    private javax.swing.JButton confirmChangesButton;
    private javax.swing.JButton deleteClassButton;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel newClassLabel;
    private javax.swing.JTextField newClassNameTextField;
    private javax.swing.JButton removeActivityButton;
    private javax.swing.JButton returnButton;
    private javax.swing.JLabel titleLabel;
    private javax.swing.JComboBox<String> yearCBox;
    // End of variables declaration//GEN-END:variables
}
