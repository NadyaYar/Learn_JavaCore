package Lesson8.accounts;

public class CheckingAccount extends Account {
    int limpOfExpenses;

    public CheckingAccount(String bankName, String ownerName, int moneyAmount, int limpOfExpenses) {
        super(bankName, ownerName, moneyAmount);
        this.limpOfExpenses = limpOfExpenses;
    }



    void withDraw(int amount){
        if (amount > limpOfExpenses)
            return;
        moneyAmount -= amount;
    }

}
