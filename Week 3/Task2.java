public class Task2 {
    public static void main(String[] args) {
        BankTask2 bank = new BankTask2();
        bank.setaccountHoldert("Ram");
        bank.setbalance(123);
        System.out.println(bank.deposit(100));
        System.out.println(bank.withdraw(100));
        System.out.println(bank.withdraw(1000));
    }
}
