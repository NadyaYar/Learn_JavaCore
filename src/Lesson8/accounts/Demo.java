package Lesson8.accounts;

public class Demo {
    public static void main(String[] args) {
        SavingAccount savingAccount = new SavingAccount("Somebank", "Denis", 1000, 50);
        savingAccount.depositeMoney(100);
        System.out.println(savingAccount.moneyAmount);
        savingAccount.changeOwnerName("Oleh");
        System.out.println(savingAccount.ownerName);
        CheckingAccount checkingAccount = new CheckingAccount("Somebank", "Denis", 1000, 500);
        checkingAccount.changeOwnerName("Oleh");
        System.out.println(checkingAccount.ownerName);
    }
}
