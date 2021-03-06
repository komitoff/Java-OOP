package exercise.mankind;

public class Student extends Human {

    private String facultyNumber;

    public String getFacultyNumber() {
        return facultyNumber;
    }

    private void setFacultyNumber(String facultyNumber) {
        if (facultyNumber.length() <= 5 || facultyNumber.length() >= 10) {
            throw new IllegalArgumentException("Invalid faculty number!");
        }
        this.facultyNumber = facultyNumber;
    }

    public Student(String firstName, String lastName, String facultyNumber) {
        super(firstName, lastName);
        this.setFacultyNumber(facultyNumber);
    }

    @Override
    public String toString() {
        return  "First Name: " + firstName +
                "\nLast Name: " + lastName +
                "\nFaculty Number: " + facultyNumber;
    }
}
