package lesson10.abstractbigex;

public class Manager extends Employee {
    @Override
    void peySalary() {
        int newBalance = getBankAccount().getBalance() + getSalary();
        newBalance += newBalance * 0.1;
        getBankAccount().setBalance(newBalance);
    }
}
