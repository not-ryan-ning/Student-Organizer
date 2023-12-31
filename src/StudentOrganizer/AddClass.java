/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StudentOrganizer;

import java.io.File;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

/**
 *
 * @author ryan
 */
public class AddClass extends javax.swing.JFrame {

    /**
     * Creates new form ClassEditor
     */
    ArrayList<ClassGroup> classData;

    File classFile = new File("classFile.txt");

    ReaderHelper reader = new ReaderHelper();
    SearchHelper searcher = new SearchHelper();
    WriterClass writer = new WriterClass();

    DefaultListModel<String> activitiesModel = new DefaultListModel<>();

    public AddClass() {
        initComponents();

        classData = reader.readClassActivities();
    }

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
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
        returnButton = new javax.swing.JButton();
        confirmChangesButton = new javax.swing.JButton();
        titleLabel = new javax.swing.JLabel();
        newClassNameTextField = new javax.swing.JTextField();
        nameLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Add Class");

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

        returnButton.setForeground(new java.awt.Color(244, 94, 89));
        returnButton.setText("Return");
        returnButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                returnButtonActionPerformed(evt);
            }
        });

        confirmChangesButton.setForeground(new java.awt.Color(94, 244, 9));
        confirmChangesButton.setText("Confirm");
        confirmChangesButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmChangesButtonActionPerformed(evt);
            }
        });

        titleLabel.setFont(new java.awt.Font("Lucida Grande", 0, 15)); // NOI18N
        titleLabel.setText("Add New Class");

        newClassNameTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newClassNameTextFieldActionPerformed(evt);
            }
        });

        nameLabel.setText("Name:");

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
                            .addComponent(nameLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(addActivityButton, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(removeActivityButton))
                            .addComponent(activitiesTextField)
                            .addComponent(confirmChangesButton)
                            .addComponent(newClassNameTextField))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(returnButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(titleLabel)
                        .addGap(191, 191, 191)))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(10, Short.MAX_VALUE)
                        .addComponent(returnButton)
                        .addGap(0, 3, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 13, Short.MAX_VALUE)
                        .addComponent(titleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(newClassNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                .addContainerGap(10, Short.MAX_VALUE))
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
        // TODO add your handling code here:
        String selectedActivity = activitiesTextField.getText().toLowerCase();
        activitiesTextField.setText("");

        for (int i = 0; i < activitiesModel.getSize(); i++) {
            String currentExtracurricular = activitiesModel.getElementAt(i).toLowerCase();

            if (currentExtracurricular.equals(selectedActivity)) {
                activitiesModel.removeElementAt(i);
            }
        }

        activitiesList.setModel(activitiesModel);
    }//GEN-LAST:event_removeActivityButtonActionPerformed
    
    // method to handle return button pressed 
    private void returnButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_returnButtonActionPerformed
        // create and show GradeTable
        GradeTable gradeTable = new GradeTable();
        gradeTable.show();
        // close current frame 
        dispose();
    }//GEN-LAST:event_returnButtonActionPerformed

    // method to handle confirm changes button pressed 
    private void confirmChangesButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmChangesButtonActionPerformed
         // check if there is at least one activity, and that there is a class name
        if (activitiesModel.getSize() != 0 && !newClassNameTextField.getText().equals("")) {
            
            // if true, get activities from JList 
            ArrayList<String> activities = returnActivities(); 
            
            String className = newClassNameTextField.getText();
            
            // flag to check whether or not classname is unique
            Boolean flag = true;
            
            // for loop, iterating through all existing classes
            for (ClassGroup classes : classData) {
                
                // checking if current class name equals new class name
                if (className.toLowerCase().equals(classes.getClassName().toLowerCase())) {
                    // if yes, flag is triggered 
                    flag = false;
                }
            }
            
            // new class only created if flag is NOT triggered
            if (flag) { 
                // if true, new ClassGroup is created and added to classData ArrayList
                ClassGroup newClass = new ClassGroup(className, activities);
                classData.add(newClass);
                
                // classData saved using appropriate writer method
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
            
            // else, appropriate error message for triggering flag is displayed
            } else {
                JOptionPane.showMessageDialog(null, "Error: Please ensure that the class name is unique.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        // else, appropriate error message for not having activity or class name is displayed 
        // partially obscured due to size constraints 
        } else {
            JOptionPane.showMessageDialog(null, "Error: Please ensure that the name of the class is inputted, and there is at least one activity.", "Error", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_confirmChangesButtonActionPerformed

    private void newClassNameTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newClassNameTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_newClassNameTextFieldActionPerformed

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
            java.util.logging.Logger.getLogger(AddClass.class
.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        

} catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddClass.class
.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        

} catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddClass.class
.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        

} catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddClass.class
.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddClass().setVisible(true);
            }
        });
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
    private javax.swing.JButton confirmChangesButton;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JTextField newClassNameTextField;
    private javax.swing.JButton removeActivityButton;
    private javax.swing.JButton returnButton;
    private javax.swing.JLabel titleLabel;
    // End of variables declaration//GEN-END:variables
}
