import java.util.HashMap;
import java.util.Map;

public class Bank {
    private Map<String, BankAccount> accounts;

    public Bank() {
        accounts = new HashMap<>();
    }

    public void createAccount(String accountNumber, String accountHolderName, double initialBalance) {
        if (!accounts.containsKey(accountNumber)) {
            BankAccount newAccount = new BankAccount(accountNumber, accountHolderName, initialBalance);
            accounts.put(accountNumber, newAccount);
            System.out.println("Account created successfully.");
        } else {
            System.out.println("Account with this number already exists.");
        }
    }

    public BankAccount getAccount(String accountNumber) {
        return accounts.get(accountNumber);
    }

    public void deposit(String accountNumber, double amount) {
        BankAccount account = accounts.get(accountNumber);
        if (account != null) {
            account.deposit(amount);
        } else {
            System.out.println("Account not found.");
        }
    }

    public void withdraw(String accountNumber, double amount) {
        BankAccount account = accounts.get(accountNumber);
        if (account != null) {
            account.withdraw(amount);
        } else {
            System.out.println("Account not found.");
        }
    }

    public void checkBalance(String accountNumber) {
        BankAccount account = accounts.get(accountNumber);
        if (account != null) {
            account.checkBalance();
        } else {
            System.out.println("Account not found.");
        }
    }
}
