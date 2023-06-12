# Student Organizer
**Organize all things student-related in one place!**

The Student Organizer is a full-stack application that allows users to organize and view key information about a student in one place, storing user input by reading and writing to files. It was created for my client, a primary teacher, as part of the IB CS Higher Level Internal Assessment, and attained a score of 7/7.

With the Student Organizer, you can:
1. Manage student and year group portfolios, storing data such as grades, allergies, birthdates, etc.
2. Create visualizations birthdates on a calendar and grades for a class group in a table.
3. Search and retrieve student information based on any data stored. 

### Running the Program 
Download the files and run **`StudentOrganizer.java`**. This initializes the main class, **`MainWindow.java`**. 

### Technical Documentation
The **front-end** is constructed with **`Java Swing`**.
#### Top-Down Design of GUI Frames, Showing Navigation Paths Between Frames
<img width="550" alt="image" src="https://github.com/not-ryan-ning/Student-Organizer/assets/136235474/40cc24ab-5dc1-4c39-8c53-355096401187">

- Each JFrame is contained in the corresponding `[JFrameName].java` file. 

The **back-end** is constructed using several Java utilities, including **`RegEx`**, **`ArrayList`**, **`PrintWriter`**, and **`Scanner`**.
- **`RegEx`** utility is used for data validation of user inputted data in various JFrames such as `AddStudent.java` or `AddClass.java`.
- **`BirthdayCalendar.java`** and **`GradeTable.java`** use the `ArrayList` utility to generate **dynamic 2D String[][]** arrays to display birthdates in a calendar, and grades in a table.
- **`ReaderHelper.java`** and **`WriterHelper.java`** classes contain methods which use `File`, `PrintWriter`, and `Scanner` utilities to read and write data to files.
- **`SearchHelper.java`** contains methods to search for students.
- **`Student.java`** contains initialzation methods of `Student` objects. Each `Student` object contains a `StudentGrade` object, which is initialized in **`StudentGrade.java`**. **`ClassGroup.java`** contains initialzation methods of 'ClassGroup' objects.
- **`GradeEditor.java`**, **`EditStudents.java`**, **`ClassEditor.java`** contain methods to manage information of the various objects. 
- **`ViewStudents.java`** is used to display information stored in `Student` objects.
