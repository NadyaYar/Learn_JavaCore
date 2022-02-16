package Lesson8.accounts;

public class Account {
    String bankName;
    String ownerName;
    int moneyAmount;

    public Account(String bankName, String ownerName, int moneyAmount) {
        this.bankName = bankName;
        this.ownerName = ownerName;
        this.moneyAmount = moneyAmount;
    }
    void depositeMoney(int amount){
        moneyAmount += amount;
    }
    // overloading (перезагрузка)
    void depositeMoney(){
        moneyAmount += 1000;
        System.out.println("deposit was successful");
    }
     void changeOwnerName(String newOwnerName){
        ownerName = newOwnerName;
     }
}
