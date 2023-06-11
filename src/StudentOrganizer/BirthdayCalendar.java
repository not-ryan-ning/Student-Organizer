/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StudentOrganizer;

import java.io.File;
import static java.lang.Integer.parseInt;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAdjusters;
import java.util.ArrayList;
import java.util.StringJoiner;
import javax.swing.JLabel;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ryan
 */
public class BirthdayCalendar extends javax.swing.JFrame {

    /**
     * Creates new form BirthdayCalendar
     */
    ArrayList<Student> studentData;
    DateTimeFormatter dayOfWeekFormatter = DateTimeFormatter.ofPattern("e");  // day of week in numbers (eg. Tuesday = 2) - because we want to know what NUMBER index we start on
    DateTimeFormatter dayOfMonthFormatter = DateTimeFormatter.ofPattern("d");  // day of month eg 10 - because we want to know the last NUMBER date of the month
    DateTimeFormatter monthNameFormatter = DateTimeFormatter.ofPattern("MMMM");  // full name of month
    DateTimeFormatter monthNumberFormatter = DateTimeFormatter.ofPattern("MM");
    DateTimeFormatter yearFormatter = DateTimeFormatter.ofPattern("y");

    
    File studentFile = new File("studentFile.txt");

    SearchHelper searcher = new SearchHelper();
    ReaderHelper reader = new ReaderHelper();


    public BirthdayCalendar() {
        studentData = reader.readStudentInformation();
        
        initComponents();
        
        LocalDate localDate = LocalDate.now();
        addYearsToCBox(localDate);
        
        String month = localDate.format(monthNumberFormatter);
        String year = yearCBox.getSelectedItem().toString();

        buildCalendar(year, month);
    }


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        calendarTable = new javax.swing.JTable();
        monthCBox = new javax.swing.JComboBox<>();
        yearCBox = new javax.swing.JComboBox<>();
        nextButton = new javax.swing.JButton();
        backButton = new javax.swing.JButton();
        returnButton = new javax.swing.JButton();
        monthLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Calendar");
        setResizable(false);

        calendarTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        calendarTable.setEnabled(false);
        calendarTable.setGridColor(new java.awt.Color(153, 153, 153));
        calendarTable.setRequestFocusEnabled(false);
        calendarTable.setRowHeight(65);
        jScrollPane1.setViewportView(calendarTable);

        monthCBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" }));
        monthCBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                monthCBoxActionPerformed(evt);
            }
        });

        yearCBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yearCBoxActionPerformed(evt);
            }
        });

        nextButton.setText("Next");
        nextButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextButtonActionPerformed(evt);
            }
        });

        backButton.setText("Back");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        returnButton.setForeground(new java.awt.Color(244, 94, 89));
        returnButton.setText("Return");
        returnButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                returnButtonActionPerformed(evt);
            }
        });

        monthLabel.setFont(new java.awt.Font("Lucida Grande", 0, 15)); // NOI18N
        monthLabel.setText("Calendar");
        monthLabel.setToolTipText("");
        monthLabel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 539, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 6, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(monthCBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(yearCBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(61, 61, 61)
                        .addComponent(monthLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(backButton)
                        .addGap(4, 4, 4)
                        .addComponent(nextButton)
                        .addContainerGap())))
            .addGroup(layout.createSequentialGroup()
                .addComponent(returnButton)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(14, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(monthCBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(yearCBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nextButton)
                    .addComponent(backButton)
                    .addComponent(monthLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 346, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(returnButton)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    
    // method to handle switching monthCBox selections 
    private void monthCBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_monthCBoxActionPerformed
        // get selected year 
        String year = yearCBox.getSelectedItem().toString();
        
        // get selected month
        String month = getMonth();
        
        // build calendar 
        buildCalendar(year, month);
    }//GEN-LAST:event_monthCBoxActionPerformed

    // method to handle switching yearCBox selections 
    private void yearCBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yearCBoxActionPerformed
        // get selected year 
        String year = yearCBox.getSelectedItem().toString();
        
        // get selected month
        String month = getMonth();
        
        // build calendar 
        buildCalendar(year, month);
    }//GEN-LAST:event_yearCBoxActionPerformed
    
    // method to handle nextButton pressed 
    // (next month)
    private void nextButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextButtonActionPerformed
        // get current selected year 
        String year = yearCBox.getSelectedItem().toString();
        
        // get the next month
        String month = getNextMonth();
        
        // build calendar 
        buildCalendar(year, month);
    }//GEN-LAST:event_nextButtonActionPerformed

    // method to handle backButton pressed 
    // (previous month)
    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        // get current selcted year 
        String year = yearCBox.getSelectedItem().toString();
        
        // get previous month
        String month = getPreviousMonth();
        
        // build calendar 
        buildCalendar(year, month);
    }//GEN-LAST:event_backButtonActionPerformed

    
    // method to handle returnButton pressed 
    private void returnButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_returnButtonActionPerformed
        // create and show MainWindow frame
        MainWindow mainWindow = new MainWindow();
        mainWindow.show();
        // current frame closed 
        dispose(); 
    }//GEN-LAST:event_returnButtonActionPerformed

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
            java.util.logging.Logger.getLogger(BirthdayCalendar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BirthdayCalendar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BirthdayCalendar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BirthdayCalendar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

    }
    
    // method to construct JTable calendar with students birthdays 
    public void buildCalendar(String year, String month) {
        // days of the week title for JTable
        String[] days = {"Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat"};     
        
        // join the year and month of desired calendar
        // date - 01-month-year
        String date = String.join("-", year, month, "01"); 
        
        // converting date to LocalDate
        LocalDate localDate = LocalDate.parse(date);
        
        // setting the month name label 
        String monthName = localDate.format(monthNameFormatter);
        monthLabel.setText(monthName);
       
        // getting first day of month number 
        LocalDate LDFirstDay = localDate.with(TemporalAdjusters.firstDayOfMonth()); 
        // getting last day of month number
        LocalDate LDLastDay = localDate.with(TemporalAdjusters.lastDayOfMonth()); 
        
        // converting those dates into integers 
        int firstDayOfMonthNumber = parseInt(LDFirstDay.format(dayOfWeekFormatter));   
        int totalDayOfMonth = parseInt(LDLastDay.format(dayOfMonthFormatter)); 
        
        // search for all students that have their birthdays in that month
        // put them in the ArrayList 
        ArrayList<Student> birthdayStudents = searcher.searchBirthdayMonth(studentData, month);
        
        // calculate rows of JTable
        int rows = calculateRows(date);
        // columns will always be 7 as there are 7 days in a week
        int columns = 7;
        
        // creating 2D array, representing the month 
        String[][] weeksArray = new String[rows][columns];
       
        
        // first day of month, will be incremented 
        int count = 1;
    
        // flag to determine whether or not date is a birthday 
        boolean flag = false; 

        // stringjoiner with delimiter <br>, prefix <br> and suffix </html> 
        // prints student name on new line if birthday
        StringJoiner lineBreaker = new StringJoiner("<br>", "<br>", "</html>"); 
        
        // colour changer adds HTML code to date colour to red if birthday 
        StringJoiner colourChanger = new StringJoiner("","<html><font color=\"red\">","</font>"); 
    
        // for each row (week) in the month 
        for (int i = 0; i < rows; i++) {
            
            // for each day of that week 
            for (int j = 0; j < columns; j++) {
                
                // gets the day of week number for the first day of month    
                // verifies that dates are being inputted correctly 
                int currentDayOfWeekNumber = parseInt(LDFirstDay.plusDays(count-1).format(dayOfWeekFormatter)) - 1;
               
                // check if current column is the currentDayOfWeek number
                // also if count has exceed month's total date, ending it 
                if (j == currentDayOfWeekNumber && count <= totalDayOfMonth) {
                    
                    // loop through each student in birthdayStudent ArrayList
                    for (Student student : birthdayStudents) {
                        
                        // if their birthday date matches count, means that it is their birthday
                        // flag is triggered
                        if (student.getDateOfBirthDay().equals(Integer.toString(count))) { 
                            flag = true; 
                            String firstName = student.getFirstName();
                            String lastName = student.getLastName().substring(0,1) + ".";
                            
                            // student's name added to lineBreaker
                            lineBreaker.add(firstName + " " + lastName);
                        }
                    }
                    
                    // if there are students' birthdays
                    if (flag) { 
                        // HTML code for colour red is applied to count
                        colourChanger.add(Integer.toString(count));
                        
                        // count (date) and birthdays are joined to one string
                        String merged = String.join("",colourChanger.toString(),lineBreaker.toString());
                        
                        // string is inputted in to 2D array
                        weeksArray[i][j] = merged;
                        
                        // flag is reset
                        flag = false;  
                       
                        // date number is incremented 
                        count+=1; 
  
                    } else { 
                        // regular day, just date number inputted 
                        weeksArray[i][j] = Integer.toString(count); 
                        
                        // date number incremented 
                        count+=1;
                    }
                } 
                
                // else, if the count (date) > max days in month
                else {
                    // blank is added instead
                    weeksArray[i][j] = " ";
                }   
            }
        }
        // create new TableModel for calendarTable
        DefaultTableModel tableModel = new DefaultTableModel(weeksArray, days) {
            
            @Override
            public Class<?> getColumnClass(int column) { // for top alignment
                return getValueAt(0, column).getClass();
            }
            
        };
        // create new DefaultTableCellRenderer to align elements inside a column to the center 
        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        
        centerRenderer.setVerticalAlignment(JLabel.TOP);
        calendarTable.getColumnModel().getColumn(0).setCellRenderer(centerRenderer);
        calendarTable.getColumnModel().getColumn(1).setCellRenderer(centerRenderer);
        // update DefaultRenderers 
        calendarTable.setDefaultRenderer(String.class, centerRenderer);
    
        // setting cbox value to month index
        String monthIndex = localDate.format(monthNumberFormatter);
        
        // there isn't a 0th value stored in cBox therefore must be adjusted downwards
        // so the actual month is 1 index ahead of the actual month. 
        // eg. (eg. Jan is 0, Feb is 1, etc.)
        monthCBox.setSelectedIndex(parseInt(monthIndex) - 1); 
        
        // update model 
        calendarTable.setModel(tableModel);
    }
    
    // method to calculate how many rows there are in a month
    public int calculateRows(String date){
        // create variable for rows
        // row starts at 1, accounted for by taking away remainder 
        int rows = 1; 
        
        // parse LocalDate from paramenter
        LocalDate localDate = LocalDate.parse(date);
      
        // first number date of month 
        // eg. if first day of month = tuesday - returns 3, wednesday - returns 4, etc. 
        LocalDate LDFirstDay = localDate.with(TemporalAdjusters.firstDayOfMonth());
        
        // last date of month 
        // eg. 28, 30, 31
        LocalDate LDTotalDays = localDate.with(TemporalAdjusters.lastDayOfMonth());  
        
        // convert LocalDates into integers 
        int firstNumberDayOfWeek = parseInt(LDFirstDay.format(dayOfWeekFormatter));      
        int totalDaysMonth = parseInt(LDTotalDays.format(dayOfMonthFormatter));   
        
        // remainder = how many days are in the first row/week 
        // calculate by subtracting starting day of week from 8
        int remainder = 8 - firstNumberDayOfWeek;   
        
        // subtract remainder from rest of month
        int restOfMonth = totalDaysMonth - remainder;
        
        // rest of rows can be calculated by dividing rows by 7
        rows = rows + (restOfMonth / 7);
        
        // since Java always rounds down, check if there is remainder dates using modulus
        if (restOfMonth % 7 != 0) {
            // if yes, add one more row for dates at the end
            rows += 1;
        }
 
        return rows; 
    }
    
    // method to convert string CBox month to a string number
    public String getMonth() {
        // get selected item from monthCBox 
        String monthCBoxSelected = monthCBox.getSelectedItem().toString();
        String month = "";
        
        // switch statment for selected month 
        switch(monthCBoxSelected) {
            // case Jan returns string number value of Janurary, 01
            case "Jan":
                return "01";
            // case Feb returns string number value of Februrary, 02
            case "Feb":
                return "02";
            // case Mar returns string number value of March, 03 - and so on
            case "Mar":
                return "03";
            case "Apr":
                return "04";
            case "May":
                return "05";
            case "Jun":
                return "06";
            case "Jul":
                return "07";
            case "Aug":
                return "08";
            case "Sep":
                return "09";
            case "Oct":
                return "10";
            case "Nov":
                return "11";
            case "Dec":
                return "12";      
        } 
        
        return month;
    
    } 
    
    // method to get the next month
    public String getNextMonth() {
        // get the current month from CBox 
        int currentMonth = parseInt(getMonth());
        
        // array of months 
        // first month is blank because there is no '0' month
        String months[] = {" ", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12"}; 
        
        // check if current month is 12
        if (currentMonth != 12) {
            // if not, next month is currentMonth + 1
            int nextMonth = currentMonth + 1;
            
            // Real months do not start at 0, therefore current month is already the next month
            // eg. current month is 1, but index 1 stores Feb in the CBox, as Jan is in 0 
            monthCBox.setSelectedIndex(currentMonth); 
            
            // return next month String from array
            return months[nextMonth]; 
            
        } else {
            // if month is 12, must start at beginning of array 
            // set selected index to first month in CBox
            monthCBox.setSelectedIndex(0);
            
            // return first month String from array 
            return months[1];
        }
    }
    
    // method to get the previous month
    public String getPreviousMonth() {
        // get the current month from CBox
        int currentMonth = parseInt(getMonth());
        
        // array of months 
        // first month is blank because there is no '0' month
        String months[] = {" ", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12"};
        
        // check if current month is 1
        if (currentMonth != 1) {
            // if not, previous month is current month -1
            int previousMonth = currentMonth - 1;
            
            // current month is 1 ahead of combobox 
            // therefore previous month is current month - 2 
            monthCBox.setSelectedIndex(currentMonth - 2); 
            
            // return previous month String from array
            return months[previousMonth]; 
        } else {
            // if month is 1, must start at end of array
            // set selected index to last month in CBox
            monthCBox.setSelectedIndex(11); // december is 11 (no 0 index month in cBox)
            
            // return last month String from array 
            return months[12];
        }
    }
    
    public void addYearsToCBox(LocalDate localDate) { // returns current year and next year in an array 
        
        LocalDate currentYear = localDate;
        
        String convertedYear = currentYear.format(yearFormatter); 
        int nextYear = parseInt(currentYear.format(yearFormatter)) + 1; 
        
        yearCBox.addItem(convertedYear);
        yearCBox.addItem(Integer.toString(nextYear));
        
        yearCBox.setSelectedIndex(0);
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backButton;
    private javax.swing.JTable calendarTable;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> monthCBox;
    private javax.swing.JLabel monthLabel;
    private javax.swing.JButton nextButton;
    private javax.swing.JButton returnButton;
    private javax.swing.JComboBox<String> yearCBox;
    // End of variables declaration//GEN-END:variables
}