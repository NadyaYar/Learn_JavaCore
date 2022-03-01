package lesson10.abstract1;
// не можна створювати обєкти
// може мати  абстрактні методи (метод без реалзації) та звичайні методи
// можуть бути звичаній поля і конструктор
// задає спільну поведінку
public class MySQLProvider extends DbProvider {
    public MySQLProvider(String dbHost) {
        super(dbHost);
    }

    @Override
    void connectToDb(){

    }
    @Override
    void disconnectFromDb() {

    }
}
