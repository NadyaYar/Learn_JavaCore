package lesson12;

public class Demo {
    public static void main(String[] args) {
        Bank usbBank = new UsbBank(123, "Ukraine", Currency.EUR, 100, 1400, 1230000);

        Bank eubank = new UsbBank(1,"German",Currency.USD,300,2000,5000000);

        Bank chinaBank = new ChinaBank(2,"Canada",Currency.USD,300,2000,1000000000);

        User user = new User(111, "Alla", 10000, 48, "Redmi", 1500, usbBank);

        User user1 = new User(122, "Denis", 10000, 39, "Apple", 4000, chinaBank);

        User user2 = new User(110,"Nadya",20000,58,"Google",5000,eubank);



        BankSystem bankSystem = new UkraineBankSystem();

        bankSystem.withDraw(user1, 100);
        System.out.println(user1.getBalance());

        bankSystem.fund(user1, 120);
        System.out.println(user1.getBalance());

        bankSystem.transferMoney(user, user1, 10);
        System.out.println(user.getBalance());
        System.out.println(user1.getBalance());

        bankSystem.paySalary(user1);
        System.out.println(user1.getBalance());

        bankSystem.withDraw(null, 12);
        System.out.println(user.getBalance());

        bankSystem.fund(null, 100);
        System.out.println(user.getBalance());

        bankSystem.transferMoney(user, user1, 100);
        System.out.println(user.getBalance());
        System.out.println(user1.getBalance());


    }
}
