/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StudentOrganizer;

import javax.swing.table.DefaultTableModel;
import java.io.File;
import java.util.ArrayList;

/**
 *
 * @author ryan
 */
public class MainWindow extends javax.swing.JFrame {

    /**
     * Creates new form MainWindow
     */
    /**
     * This method is called from within the constructor to initialise the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        buttonGroup4 = new javax.swing.ButtonGroup();
        jRadioButtonMenuItem1 = new javax.swing.JRadioButtonMenuItem();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTree1 = new javax.swing.JTree();
        jRadioButton1 = new javax.swing.JRadioButton();
        searchTextField = new javax.swing.JTextField();
        termLabel = new javax.swing.JLabel();
        termCBox = new javax.swing.JComboBox<>();
        exitButton = new javax.swing.JButton();
        searchButton = new javax.swing.JButton();
        addStudentButton = new javax.swing.JButton();
        viewBirthdayButton = new javax.swing.JButton();
        viewGradesButton = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        studentTable = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

        jRadioButtonMenuItem1.setSelected(true);
        jRadioButtonMenuItem1.setText("jRadioButtonMenuItem1");

        jScrollPane2.setViewportView(jTree1);

        jRadioButton1.setText("jRadioButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Student Organizer");

        searchTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchTextFieldActionPerformed(evt);
            }
        });

        termLabel.setText("Term:");
        termLabel.setVerticalTextPosition(javax.swing.SwingConstants.TOP);

        termCBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "All", "First Name", "Last Name", "Year Level", "Date of Birth", "Parental Contact", "Extracurriculars", "Allergies" }));
        termCBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                termCBoxActionPerformed(evt);
            }
        });

        exitButton.setForeground(new java.awt.Color(244, 94, 89));
        exitButton.setText("Exit");
        exitButton.setToolTipText("");
        exitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitButtonActionPerformed(evt);
            }
        });

        searchButton.setText("Search:");
        searchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchButtonActionPerformed(evt);
            }
        });

        addStudentButton.setText("ADD STUDENTS");
        addStudentButton.setToolTipText("");
        addStudentButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addStudentButtonActionPerformed(evt);
            }
        });

        viewBirthdayButton.setText("VIEW BIRTHDAYS");
        viewBirthdayButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewBirthdayButtonActionPerformed(evt);
            }
        });

        viewGradesButton.setText("VIEW GRADES");
        viewGradesButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewGradesButtonActionPerformed(evt);
            }
        });

        studentTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "First Name", "Last Name", "Year Level"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        studentTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                studentTableMousePressed(evt);
            }
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                studentTableMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(studentTable);

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 0, 15)); // NOI18N
        jLabel1.setText("Student Organizer");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(termLabel))
                            .addComponent(searchButton, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(termCBox, 0, 469, Short.MAX_VALUE)
                            .addComponent(searchTextField)))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 540, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(addStudentButton, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(viewBirthdayButton, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(viewGradesButton, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(16, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(exitButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(99, 99, 99))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(exitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(8, 8, 8))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addStudentButton, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(viewBirthdayButton, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(viewGradesButton, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(termLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(termCBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(searchButton, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(3, 3, 3))
                    .addComponent(searchTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(572, 372));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    ArrayList<Student> studentData;
    
    SearchHelper searcher = new SearchHelper();
    ReaderHelper reader = new ReaderHelper();

    File studentFile = new File("studentFile.txt");

    public MainWindow() {
        this.studentData = reader.readStudentInformation();
        
        initComponents();

        buildTable(studentData);
    }


    private void searchTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchTextFieldActionPerformed

    private void termCBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_termCBoxActionPerformed
        // TODO add your handling code here:;
    }//GEN-LAST:event_termCBoxActionPerformed


    private void exitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitButtonActionPerformed
        // when exit button pressed, closes program.
        System.exit(0);
    }//GEN-LAST:event_exitButtonActionPerformed

    private void searchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchButtonActionPerformed
        // when search button pressed
        // ArrayList of results is found
        ArrayList<Student> results = searchStudents();
        
        // used to construct results JTable
        buildTable(results);
    }//GEN-LAST:event_searchButtonActionPerformed
    
    // method to put results student into the results JTable
    private void buildTable(ArrayList<Student> results) {
        // creating a DefaultTableModel for the JTable
        DefaultTableModel tableModel = (DefaultTableModel) studentTable.getModel();
        
        // setting row count to 0 removing all existing elements (rows) in JTable
        tableModel.setRowCount(0);
        
        // iterates through ArrayList of results (storing Students) 
        for (Student student : results) {
            // for each Student, get their first and last name, and year level
            // create a string array of those attributes
            String data[] = {student.getFirstName(), student.getLastName(), student.getYearLevel()};
            
            // add the array as a row on the table model
            tableModel.addRow(data);
        }
        
        // set model for the JTable (studentTable) 
        studentTable.setModel(tableModel);
    }
    
    // method to return students fitting search criteria in an ArrayList
    private ArrayList<Student> searchStudents() {
        
        // get user search from TextField
        String userSearch = searchTextField.getText();
        
        // get search term from ComboBox
        String cBoxText = termCBox.getSelectedItem().toString();

        // generate empty ArrayList of Students called results
        ArrayList<Student> results = new ArrayList<>();
        
        // switch statement for search terms
        // runs different search methods based on the term
        switch (cBoxText) {
            // case all returns returns all students 
            case "All":
                results = studentData;
                return results;
            // case First Name sets results to its search method
            case "First Name":
                results = searcher.searchStudentFirstName(studentData, userSearch);
                return results;
            // case Last Name sets results to its search method
            case "Last Name":
                results = searcher.searchStudentLastName(studentData, userSearch);
                return results;
            // case Year Level sets results to its search method
            case "Year Level":
                results = searcher.searchStudentYearLevel(studentData, userSearch);
                return results;
            // case Date of Birth sets results to its search method    
            case "Date of Birth":
                results = searcher.searchStudentDateOfBirth(studentData, userSearch);
                return results;
            // case Parental Contact sets results to its search method
            case "Parental Contact":
                results = searcher.searchStudentParentalContact(studentData, userSearch);
                return results;
            // case Extracurriculars sets results to its search method
            case "Extracurriculars":
                results = searcher.searchStudentExtracurriculars(studentData, userSearch);
                return results;
            // case Allergies sets results to its search method
            case "Allergies":
                results = searcher.searchStudentAllergies(studentData, userSearch);
                return results;
        } 
        
        // if none of the cases match - no search term
        // empty ArrayList (no students) is returned
        return results;
    }

    // method to handle action of Add Students button pressed
    private void addStudentButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addStudentButtonActionPerformed
        // when Add Students button pressed
        // creates AddStudents frame and shows 
        AddStudents addStudents = new AddStudents();
        addStudents.show();
        // current frame closed 
        dispose();

    }//GEN-LAST:event_addStudentButtonActionPerformed

    
    // method to handle action of View Birthdays button pressed
    private void viewBirthdayButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewBirthdayButtonActionPerformed
        // when View Birthdays button pressed
        // creates BirthdayCalendar frame and shows 
        BirthdayCalendar birthdayCalendar = new BirthdayCalendar();
        birthdayCalendar.show();
        // current frame closed
        dispose();

    }//GEN-LAST:event_viewBirthdayButtonActionPerformed

    
    // method to handle action of View Grades button pressed
    private void viewGradesButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewGradesButtonActionPerformed
        // when View Grades button pressed
        // creates GradeTable frame and shows 
        GradeTable gradeTable = new GradeTable();
        gradeTable.show();
        // current frame closed
        dispose();

    }//GEN-LAST:event_viewGradesButtonActionPerformed

    private void studentTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_studentTableMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_studentTableMouseClicked

    // method to open ViewStudent frame (displaying, editing selected student data) 
    // occurs when a row is pressed on student JTable
    private void studentTableMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_studentTableMousePressed
        // get the table model of the JTable of students 
        DefaultTableModel tableModel = (DefaultTableModel) studentTable.getModel();

        // when a row is selected, get its index
        int selectedRowIndex = studentTable.getSelectedRow();
        
        // get the data from table model at the selected row and columns
        // column 0 - stores first name
        // column 1 - store last name 
        // row - stores one student
        String firstName = tableModel.getValueAt(selectedRowIndex, 0).toString();
        String lastName = tableModel.getValueAt(selectedRowIndex, 1).toString();

        // ViewStudents frame created from selected data, shows, displays student
        ViewStudent viewStudent = new ViewStudent(firstName, lastName);
        viewStudent.show();
        // current frame closed
        dispose();
    }//GEN-LAST:event_studentTableMousePressed

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
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addStudentButton;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.ButtonGroup buttonGroup4;
    private javax.swing.JButton exitButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTree jTree1;
    private javax.swing.JButton searchButton;
    private javax.swing.JTextField searchTextField;
    private javax.swing.JTable studentTable;
    private javax.swing.JComboBox<String> termCBox;
    private javax.swing.JLabel termLabel;
    private javax.swing.JButton viewBirthdayButton;
    private javax.swing.JButton viewGradesButton;
    // End of variables declaration//GEN-END:variables
}
