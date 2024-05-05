public class Main {
    public static void main(String[] args) {
        AccountManager manager = new AccountManager();
        System.out.println("Hesap Bakiyesi: " + manager.getBalance());

        manager.deposit(100);
        System.out.println("Hesap Bakiyesi: " + manager.getBalance());

        try {
            manager.withdraw(90);
            System.out.println("Hesap Bakiyesi: " + manager.getBalance());
        } catch (BalanceInsufficentException exception) {
            System.out.println(exception.getMessage());
        }

        try {
            manager.withdraw(20);
            System.out.println("Hesap Bakiyesi: " + manager.getBalance());
        } catch (BalanceInsufficentException exception) {
            System.out.println(exception.getMessage());
        }

        System.out.println("Hesap Bakiyesi: " + manager.getBalance());
    }
}