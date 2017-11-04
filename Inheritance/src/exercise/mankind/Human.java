package exercise.mankind;

public class Human {
    protected String firstName;
    protected String lastName;

    public String getFirstName() {
        return firstName;
    }

    protected void setFirstName(String firstName) {
        if (firstName.length() < 4) {
            throw new IllegalArgumentException("Expected length at least 4 symbols!Argument: firstName");
        }

        if (firstName.charAt(0) != firstName.toUpperCase().charAt(0)) {
            throw new IllegalArgumentException("Expected upper case letter!Argument: firstName");
        }
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    protected void setLastName(String lastName) {
        if (lastName.length() < 3) {
            throw new IllegalArgumentException("Expected length at least 3 symbols!Argument: lastName");
        }

        if (lastName.charAt(0) != lastName.toUpperCase().charAt(0)) {
            throw new IllegalArgumentException("Expected upper case letter!Argument: lastName");
        }
        this.lastName = lastName;
    }

    public Human(String firstName, String lastName) {
        this.setFirstName(firstName);
        this.setLastName(lastName);
    }

    @Override
    public String toString() {
        return  "First Name: " + firstName +
                "\nLast Name: " + lastName;
    }
}
