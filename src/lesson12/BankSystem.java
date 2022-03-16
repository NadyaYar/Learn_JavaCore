package lesson12;
// методи без реалізації то треба використовувати інтерфейс , тільки поведінка
// метод з реалізацією або є поля то абстрактний клас

public interface BankSystem {

    void withDraw(User user, int amount);

    void fund(User user, int amount);

    void transferMoney(User fromUser, User toUser , int amount);

    void paySalary(User user);

}
