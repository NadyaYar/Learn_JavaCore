package lesson10.abstractbigex;

public class BankAccount {
    private  Employee employee;
    private  int balance;

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public int getBalance() {
        return balance;
    }

    public BankAccount(Employee employee, int balance) {
        this.employee = employee;
        this.balance = balance;
    }
}
