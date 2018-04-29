import java.util.ArrayList;

public class roster {

    private static ArrayList<Students> myRoster = new ArrayList<>();

    public static void main (String[] args){

        roster.add("1", "John", "Smith", "John1989@gmail.com", 20, 88, 79,59);
        add("2", "Suzan","Erickson","Erickson_1990@gmailcom", 19, 91, 72,85);
        add("3", "Jack", "Napoli", "The_lawyer99yahoo.com", 19, 85, 84,87);
        add("4", "Erin", "Black", "Erin.black@comcast.net", 22, 91,98,82);
        add("5", "Ben",  "Stoica", "bstoica@wgu.edu", 23, 90, 91,92);

        print_all();
        print_invalid_emails();
        print_average_grade("5");
        remove("3");
        remove("3");
    }

    public static void add(String studentID, String firstName, String lastName, String emailAddress, int age, int grade1, int grade2, int grade3){

        int[] grades = {grade1, grade2, grade3};
        Students newStudent = new Students(studentID, firstName, lastName, emailAddress, age, grades);
        myRoster.add(newStudent);
    }

    public static void remove(String studentId) {
        for (Students s : myRoster) {
            if (s.getStudentId().equals(studentId)) {
                myRoster.remove(s);
                return;
            }
        }
        System.out.println("That student ID does not exist.");
    }

    public static void print_all() {
        for (int i=0; i < myRoster.size(); i++) {
            myRoster.get(i).print();
        }

    }

    public static void print_average_grade(String studentId) {
            for(Students s : myRoster) {
                if(s.getStudentId().equals(studentId)) {
                    double average = (s.getGrades()[0] + s.getGrades()[1] + s.getGrades()[2])/3.0;
                    System.out.println("Student ID:\t" + s.getStudentId() + "\tAverage:\t" + average);
                }
            }
        }

    public static void print_invalid_emails() {
        for (Students s : myRoster) {
            if (!s.getEmailAddress().contains("@")) {
                System.out.println("Invalid e-mail address: " + s.getEmailAddress());
            }
            else if(!s.getEmailAddress().contains(".")) {
                System.out.println("Invalid e-mail address: " + s.getEmailAddress());
            }
            else if(s.getEmailAddress().contains(" ")) {
                System.out.println("Invalid e-mail address: " + s.getEmailAddress());
            }
        }
    }

}
