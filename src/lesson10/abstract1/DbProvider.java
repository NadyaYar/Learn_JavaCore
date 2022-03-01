package lesson10.abstract1;

public abstract class DbProvider {
    public String dbHost;

    public DbProvider(String dbHost) {
        this.dbHost = dbHost;
    }

    abstract void connectToDb();

    abstract void disconnectFromDb();

    void  printDbHost(){
        System.out.println("db host is " + dbHost);
    }
}
