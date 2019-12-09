public class Transactions {

    public static void transactions() {

        Singleton singleton = Singleton.getInstance();

        singleton.withdraw(300);
        singleton.deposit(12);
        singleton.deposit(54);
        singleton.withdraw(47);
    }

    public static void balance() {

        // TODO 2 : call singleton and get total

        Singleton instance = Singleton.getInstance();
        Bank bank = instance.getBank();
        int total = bank.getTotal();
        System.out.printf("Your balance is:%d%n", total);
    }
}
