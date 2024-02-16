package Lesson_18.example_1;

public class Main {
    public static void main(String[] args) {
        Balance balance=new Balance();
        Money money=new Money();
        ATM atm=new ATM();
        System.out.println(atm.isGetMoney(60000));
        atm.getBalance();
        atm.moneyInfo(money);

    }
}
