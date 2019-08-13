package overdrawn.at.the.bank;

public class BankAccount {

    double balance;
    String name;

    BankAccount(String s, double d) {

        name = s;
        balance = d;
        
    }

    void deposit(double d) {

        balance += d;
        
    }

    void withdraw(double d) {
        
        balance -= d;
        
    }

}
