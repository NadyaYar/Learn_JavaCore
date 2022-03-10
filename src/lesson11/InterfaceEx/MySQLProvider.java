package lesson11.InterfaceEx;

// не можна створювати обєкти
// може мати  абстрактні методи (метод без реалзації) та звичайні методи
// можуть бути звичаній поля і конструктор
// задає спільну поведінку
public class MySQLProvider implements DbProvider {
    @Override
    public void connectToDb() {

    }

    @Override
    public void disconnectFromDb() {

    }

    @Override
    public void encript() {

    }
}
