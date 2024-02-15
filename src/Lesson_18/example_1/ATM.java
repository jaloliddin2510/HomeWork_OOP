package Lesson_18.example_1;


public class ATM {

    public String setMessage(MessageInterface messageListener) {
        return messageListener.toString();
    }

    public String setShowMoneyInfoInterface(ShowMoneyInterface moneyListener) {
        return moneyListener.toString();
    }
    public String isGetMoney(int getSum) {
        Money money = new Money();

        while (getSum > money.getCountFiftyThousand()) {
            getSum=getSum-50000;
        }
        while (getSum>money.getCountTwentyThousand()){
            getSum=getSum-20000;
        }
        while (getSum>money.getCountTenThousand()){
            getSum=getSum-10000;
        }
        if (getSum==0){
            return "Marhamat pullaringizni olishingiz mumkin";
        }
        else return "Noto'g'ri miqdor kiritilgan";
    }
    public void moneyInfo(Money money){
        System.out.println("10_000 so'mlikdan "+money.getCountTenThousand()+" ta mavjud");
        System.out.println("20_000 so'mlikdan "+money.getCountTwentyThousand()+" ta mavjud");
        System.out.println("50_000 so'mlikdan "+money.getCountFiftyThousand()+" ta mavjud");
    }
    public void getBalance(){
        Money money=new Money();
        Balance balance=new Balance();
        System.out.println(balance.addMoney(money));
    }
}
