package lesson12;

public class EuBank extends Bank {

    public EuBank(long id,
                  String bankCountry,
                  Currency currency,
                  int numberOfEmploeyes,
                  long rating,
                  long totalCapital) {
        super(id,
                bankCountry,
                currency,
                numberOfEmploeyes,
                rating,
                totalCapital);
    }

    @Override
    public int gerLimitOfWithDraw() {
        if (getCurrency() == Currency.USD) {
            return 2000;
        }
        return 2200;
    }

    @Override
    public int getLimitOfFunding() {
        if (getCurrency() == Currency.EUR) {
            return 20000;
        }
        return 10000;
    }

    @Override
    public double getMonthlyPate() {
        if (getCurrency() == Currency.USD) {
            return 0.0;
        }
        return 0.01;
    }

    @Override
    public double getComission(int amount) {
        if (getCurrency() == Currency.USD) {
            if (amount <= 1000) {
                return 0.05;
            }  else  return 0.07;
            } else {
                if (amount <= 1000) {
                    return 0.02;
                } else {
                    return 0.04;
                }
            }
        }
    }




