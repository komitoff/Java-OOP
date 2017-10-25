package bank_accaunt_test_client.app;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Main {

    public static Map<Integer, BankAccount> accounts = new HashMap<>();

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String[] command = reader.readLine().split("\\s+");

        while (!"End".equals(command[0])) {
            int id = Integer.valueOf(command[1]);
            double amount = 0;
            switch (command[0]) {
                case "Create":
                    tryCreateBankAccount(id);
                    break;
                case "Deposit":
                    amount = Double.valueOf(command[2]);
                    tryMakeDeposit(id, amount);
                    break;
                case "Withdraw":
                    amount = Double.valueOf(command[2]);
                    tryMakeWithdraw(id, amount);
                    break;
                case "Print":
                    tryPrintAccount(id);
                    break;
            }

            command = reader.readLine().split("\\s+");
        }
    }

    private static void tryPrintAccount(int id) {
        if (accounts.containsKey(id)) {
            System.out.println(accounts.get(id));
            return;
        }
        System.out.println("Account does not exist");
    }

    private static void tryMakeWithdraw(int id, double amount) {
        if (accounts.containsKey(id)) {
            if (amount <= accounts.get(id).getBalance()) {
                accounts.get(id).withdraw(amount);
                return;
            }
            System.out.println("Insufficient balance");
            return;
        }
        System.out.println("Account does not exist");
    }

    private static void tryMakeDeposit(Integer id, Double amount) {
        if (accounts.containsKey(id)) {
            accounts.get(id).deposit(amount);
            return;
        }
        System.out.println("Account does not exist");
    }

    private static void tryCreateBankAccount(Integer id) {
        if (!accounts.containsKey(id)) {
            BankAccount account = new BankAccount();
            account.setId(id);
            accounts.put(id, account);
            return;
        }
        System.out.println("Account already exists");
    }
}
