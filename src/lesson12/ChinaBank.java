package lesson12;

public class ChinaBank extends Bank {

    public ChinaBank(long id, String bankCountry, Currency currency, int numberOfEmploeyes, long rating, long totalCapital) {
        super(id, bankCountry, currency, numberOfEmploeyes, rating, totalCapital);
    }

    @Override
    public int gerLimitOfWithDraw() {
        if (getCurrency() == Currency.USD)
            return 100;

        return 150;
    }

    @Override
    public int getLimitOfFunding() {
        if (getCurrency() == Currency.EUR)
            return 5000;

        return 10000;
    }

    @Override
    public double getMonthlyPate() {
        if (getCurrency() == Currency.USD)
            return 0.01;

        return 0.0;
    }

    @Override
    public double getComission(int amount) {
        if (getCurrency() == Currency.USD) {
            if (amount <= 1000)
                return 0.03;
            else return 0.05;
        } else {
            if (amount <= 1000)
                return 0.1;
            else
                return 0.11;
        }
    }
}
