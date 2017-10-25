package lab.static_id_rates;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;
import java.util.HashMap;

public class Main {

    public static HashMap<Integer, BankAccount> accounts = new HashMap<>();

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String command  = reader.readLine();
        int id = 0;
        while (!"End".equals(command)) {
            String[] tokens = command.split("\\s+");
            switch (tokens[0]) {
                case "Create":
                    tryCreateAccount();
                    break;
                case "Deposit":
                    id = Integer.valueOf(tokens[1]);
                    double amount = Double.valueOf(tokens[2]);
                    tryDeposit(id, amount);
                    break;
                case "SetInterest":
                    double interest = Double.valueOf(tokens[1]);
                    trySetInterest(interest);
                    break;
                case "GetInterest":
                    id = Integer.valueOf(tokens[1]);
                    int years = Integer.valueOf(tokens[2]);
                    tryGetInterest(id, years);
                    break;
                default:
                    break;
            }

            command = reader.readLine();
        }
    }

    private static void tryGetInterest(int id, int years) {
        if (accounts.containsKey(id)) {
            System.out.println(String.format("%.2f",accounts.get(id).getInterestRate(years)));
            return;
        }
        System.out.println("Account does not exist");
    }

    private static void trySetInterest(double interest) {
        BankAccount.setInterestRate(interest);
    }

    private static void tryDeposit(int id, double amount) {
        if (accounts.containsKey(id)) {
            accounts.get(id).deposit(amount);
            DecimalFormat df = new DecimalFormat("#.##");
            System.out.println("Deposited " + df.format(amount) + " to " + accounts.get(id));
            return;
        }
        System.out.println("Account does not exist");
    }

    private static void tryCreateAccount() {
        BankAccount account = new BankAccount();
        accounts.put(account.getId(), account);
        System.out.println(String.format("Account %s created", account));
    }
}
