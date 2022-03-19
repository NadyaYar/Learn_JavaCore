package lesson12;

public abstract class Bank {
    private long id;
    private String bankCountry;
    private Currency currency;
    private int numberOfEmploeyes;
    private double avrSalaryOfEmployee;
    private long rating;
    private long totalCapital;

    public Bank(double avrSalaryOfEmployee) {
        this.avrSalaryOfEmployee = avrSalaryOfEmployee;
    }

    public Bank(long id, String bankCountry,
                Currency currency,
                int numberOfEmploeyes,
                long rating,
                long totalCapital) {
        this.id = id;
        this.bankCountry = bankCountry;
        this.currency = currency;
        this.numberOfEmploeyes = numberOfEmploeyes;
        this.rating = rating;
        this.totalCapital = totalCapital;
    }

    public abstract int gerLimitOfWithDraw();

    public abstract int getLimitOfFunding();

    public abstract double getMonthlyPate();

    public abstract double getComission(int amount);

    public double moneyPaidMonthlySalary() {
        return numberOfEmploeyes * avrSalaryOfEmployee;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getBankCountry() {
        return bankCountry;
    }

    public void setBankCountry(String bankCountry) {
        this.bankCountry = bankCountry;
    }

    public Currency getCurrency() {
        return currency;
    }

    public void setCurrency(Currency currency) {
        this.currency = currency;
    }

    public int getNumberOfEmploeyes() {
        return numberOfEmploeyes;
    }

    public void setNumberOfEmploeyes(int numberOfEmploeyes) {
        this.numberOfEmploeyes = numberOfEmploeyes;
    }

    public long getRating() {
        return rating;
    }

    public void setRating(long rating) {
        this.rating = rating;
    }

    public long getTotalCapital() {
        return totalCapital;
    }

    public void setTotalCapital(long totalCapital) {
        this.totalCapital = totalCapital;
    }

}
