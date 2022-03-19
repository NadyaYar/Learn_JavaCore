package lesson12;

public class UkraineBankSystem implements BankSystem {

    @Override
    public void withDraw(User user, int amount) {
        if (user == null) return;
        if (!checkWithdraw(user, amount)) {
            return;
        }
        user.setBalance(user.getBalance() - amount - amount * user.getBank().getComission(amount));
    }

    @Override
    public void fund(User user, int amount) {
        if (user == null) return;
        if (!checkFund(user, amount)) {
            return;
        }
        user.setBalance(user.getBalance() + amount - amount * user.getBank().getComission(amount));
    }

    @Override
    public void transferMoney(User fromUser, User toUser, int amount) {
        if (fromUser == null && toUser == null) return;
        if (!checkWithdraw(fromUser, amount)) {
            return;
        }

        if (!checkFund(toUser, amount)) {
            return;
        }

        withDraw(fromUser, amount);
        fund(toUser, amount);
    }

    @Override
    public void paySalary(User user) {
        if (user == null) return;
        user.setBalance(user.getBalance() + user.getSalary() - user.getSalary() * user.getBank().getMonthlyPate());
    }

    private boolean checkWithdraw(User user, int amount) {
        return checkOfLimitOperation(user, amount, user.getBank().gerLimitOfWithDraw())
                && checkOfLimitOperation(user, amount, user.getBalance());
    }

    private boolean checkOfLimitOperation(User user, int amount, double limit) {
        if (amount + user.getBank().getComission(amount) > limit) {
            operationErrMassage(user);
            return false;
        }
        return true;
    }

    private void operationErrMassage(User user) {
        System.err.println("Can't done this operation" + " " + "from user" + user.toString());
    }

    private boolean checkFund(User user, int amount) {
        return checkOfLimitOperation(user, amount, user.getBank().getLimitOfFunding())
                && checkOfLimitOperation(user, amount, user.getBalance());
    }
}
