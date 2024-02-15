package Lesson_18.example_1;

import java.util.ArrayList;

public class Balance {
    ArrayList<Money> monies=new ArrayList<>();
    public ArrayList<Money> addMoney(Money money) {
        money.setCountFiftyThousand(30);
        monies.add(money);
        return monies;
    }

    @Override
    public String toString() {
        return "Balance{" +
                "monies=" + monies +
                '}';
    }
}
