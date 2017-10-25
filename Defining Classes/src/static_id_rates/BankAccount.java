package static_id_rates;

public class BankAccount {

    private static final double DEFAULT_INTEREST = 0.02;
    private static double rate = DEFAULT_INTEREST;
    private static int bankAccountCount;

    private int id;
    private double balance;

    public double getInterestRate(int years) {
        return this.balance * rate * years;
    }

    public static void setInterestRate(double interest) {
        rate = interest;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public BankAccount() {
        this.id = ++bankAccountCount;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            this.balance += amount;
        }
    }

    @Override
    public String toString() {
        return "ID" + this.id;
    }
}
