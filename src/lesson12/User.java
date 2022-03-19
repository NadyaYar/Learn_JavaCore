package lesson12;

public class User {
    private long id;
    private String name;
    private double balance;
    private int monthOfEmployment;
    private String companyName;
    private double salary;
    private Bank bank;

    public User(long id,
                String name,
                double balance,
                int monthOfEmployment,
                String companyName,
                int salary,
                Bank bank) {
        this.id = id;
        this.name = name;
        this.balance = balance;
        this.monthOfEmployment = monthOfEmployment;
        this.companyName = companyName;
        this.salary = salary;
        this.bank = bank;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setMonthOfEmployment(int monthOfEmployment) {
        this.monthOfEmployment = monthOfEmployment;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getBalance() {
        return balance;
    }

    public int getMonthOfEmployment() {
        return monthOfEmployment;
    }

    public String getCompanyName() {
        return companyName;
    }

    public double getSalary() {
        return salary;
    }

    public Bank getBank() {
        return bank;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", balance=" + balance +
                ", monthOfEmployment=" + monthOfEmployment +
                ", companyName='" + companyName + '\'' +
                ", salary=" + salary +
                ", bank=" + bank +
                '}';
    }
}
