package lesson20.task2;

import java.util.Date;

public record Transaction(long id, String city, int amount, String description,
                          TransactionType type, Date dateCreated) {

    public long getId() {
        return id;
    }

    public String getCity() {
        return city;
    }

    public int getAmount() {
        return amount;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    @Override
    public String toString() {
        return "Transaction{" +
                "id=" + id +
                ", city='" + city + '\'' +
                ", amount=" + amount +
                ", description='" + description + '\'' +
                ", type=" + type +
                ", dateCreated=" + dateCreated +
                '}';
    }
}
