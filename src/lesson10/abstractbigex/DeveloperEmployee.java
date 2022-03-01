package lesson10.abstractbigex;

public class DeveloperEmployee extends Employee {
  private   String [] fraemworks = new String[10];

    @Override
    void peySalary() {
        int newBalance = getBankAccount().getBalance()+getSalary() + 1000;
        getBankAccount().setBalance(newBalance);
    }
}
