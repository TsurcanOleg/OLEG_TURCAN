package homework_nr_6;

public class BankAccountMain {
    public static void main(String[] args) {

        BankAccount account1 = new BankAccount("MD2044", 8000);
        BankAccount account2 = new BankAccount("MD2020", 5000);
        BankAccount account3 = new BankAccount("MD1998", 3000);

        System.out.println("Account1 " + account1.accountNumber + " Balance = " + BankAccount.deposit(account1.balance, 1000));
        System.out.println("Account2 " + account2.accountNumber + " Balance = " + BankAccount.deposit(account2.balance, 12000));
        System.out.println("Account3 " + account3.accountNumber + " Balance = " + BankAccount.deposit(account3.balance, 13000));

        System.out.println("Account1 " + account1.accountNumber + " Balance = " + BankAccount.withdrow(account1.balance, 4000));
        System.out.println("Account2 " + account2.accountNumber + " Balance = " + BankAccount.withdrow(account2.balance, 15000));
        System.out.println("Account3 " + account3.accountNumber + " Balance = " + BankAccount.withdrow(account3.balance, 5000));
    }
}
