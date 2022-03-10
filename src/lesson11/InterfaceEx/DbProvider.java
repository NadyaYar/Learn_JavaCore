package lesson11.InterfaceEx;

public interface DbProvider {
    // only abstract method
    void connectToDb();

    void disconnectFromDb();

    void encript();

}
