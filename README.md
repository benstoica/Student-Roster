# Student-Roster

The program contains two classes named student and roster, respectively. The program maintains a current roster of students within a given course. Student data for the program includes student ID, first name, last name, e-mail address, age, and array of grades. The program reads a list of five students, with one of the students being myself, and uses a series of method calls. Uses the principles of encapsulation and information hiding. 

For the Student object class, the following is included

1.   instance variables that describe each student:
•   student ID
•   first name
•   last name
•   e-mail address
•   age
•   array of grades

2.  The following methods are included in the Student class:
a.  an accessor (i.e., getter) for each instance variable
b.  a mutator (i.e., setter) for each instance variable
c.  constructor using all of the input parameters
d.  print() to print specific student data (e.g., student ID, first name, last name) using accessors (i.e., getters)

The student Roster class contains the following methods that contain all ArrayList method calls:
a.  public static void remove(String studentID) that removes students from the roster by student I
Note: If the student ID doesn’t exist, the method should print an error message indicating that it is not found
b.  public static void print_all() that prints a complete tab-separated list of student data using accessor methods
c.  public static void print_average_grade(String studentID) that correctly prints a student’s average grade by student ID
d.  public static void print_invalid_emails() that verifies student e-mail addresses and displays all invalid e-mail addresses to the user
Note: A valid e-mail should include an at sign (“@”) and period (“.”) and doesn’t include a space.

C.  The programs required functionality can be demonstrated by running the following scenario:
print_all();
print_invalid_emails();
//loop through the ArrayList and for each element:
print_average_grade(current_loop_student);
remove("3");
remove("3");
//expected: this should print a message saying such a student with this ID was not found.
