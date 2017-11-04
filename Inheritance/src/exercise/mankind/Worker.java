package exercise.mankind;

public class Worker extends Human {

    private double weeklySalary;
    private double hoursPerDay;

    public double getWeeklySalary() {
        return weeklySalary;
    }

    private void setWeeklySalary(double weeklySalary) {
        if (weeklySalary <= 10) {
            throw new IllegalArgumentException("Expected value mismatch!Argument: weekSalary");
        }
        this.weeklySalary = weeklySalary;
    }

    public double getHoursPerDay() {
        return hoursPerDay;
    }

    private void setHoursPerDay(double hoursPerDay) {
        if (hoursPerDay < 1 || hoursPerDay > 12) {
            throw new IllegalArgumentException("Expected value mismatch!Argument: workHoursPerDay");
        }
        this.hoursPerDay = hoursPerDay;
    }

    public Worker(String firstName, String lastName, double weeklySalary, double hoursPerDay) {
        super(firstName, lastName);
        this.setWeeklySalary(weeklySalary);
        this.setHoursPerDay(hoursPerDay);
    }

    public double getSalaryPerHour() {
        return weeklySalary / (hoursPerDay * 7);
    }

    @Override
    public String toString() {
        return  "First Name: " + firstName +
                "\nLast Name: " + lastName +
                "\nWeek Salary: " + String.format("%.2f", weeklySalary) +
                "\nHours per day: " + String.format("%.2f", hoursPerDay) +
                "\nSalary per hour: " + String.format("%.2f",getSalaryPerHour());
    }
}
