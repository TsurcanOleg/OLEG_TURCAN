package homework_nr_6;

public class BankAccount {

    String accountNumber;
    double balance;
    String Nomoney;

    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public static double deposit (double balance, double amount){
         balance += amount;
         return balance;
    }
    public static double withdrow (double balance, double amount) {
        if (balance >= amount) {
            return balance -= amount;
        }
        else return balance;
        }
    }

