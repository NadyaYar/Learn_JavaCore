package lesson10.abstractbigex;

public  abstract  class Employee {
    private String name;
    private int age;
    private int yearsOfExperience;

    private int salary;
    private BankAccount bankAccount;
    private Company[] companiesWorked = new Company[10];
    private String[] position = new String[10];
    private String curPosition;
  abstract void peySalary();

    public String getName() {
        return name;
    }

    void changePosition() {

    }
    void  changePosition(String newPosition) {
        // save current position
        // change position
       savePositionToHistory();
        curPosition = newPosition;
    }
    private void  savePositionToHistory(){
        int index = 0;
        for (String pos : position) {
            if (pos == null){
                position[index] = curPosition;
                break;
            }
            index++;
        }
    }

    public int getSalary() {
        return salary;
    }

    public BankAccount getBankAccount() {
        return bankAccount;
    }

    int getBalance(){
       return bankAccount.getBalance();
    }
}
