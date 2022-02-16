package Lesson8.accounts;

public class SavingAccount extends Account {
    int savePerMonth;
    int savings;

    public SavingAccount(String bankName, String ownerName, int moneyAmount, int savePerMonth) {
        super(bankName, ownerName, moneyAmount);
        this.savePerMonth = savePerMonth;
    }

@Override // перезапис
    void changeOwnerName(String newOwnerName) {
        if (newOwnerName == "Jack" || newOwnerName == "Ann") {
            ownerName = newOwnerName;
        } else {
            System.out.println("sorry..");
        }
    }
}
