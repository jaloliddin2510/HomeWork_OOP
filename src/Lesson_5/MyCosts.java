package Lesson_5;

public class MyCosts {
    String userName;
    int Money;

    void shownInfo() {
        System.out.println(userName + " ning joriy balanisi" + Money + " ga teng");
    }

    int getNowMoney() {
        return Money;
    }

    public void spendMoney(int spend) {
        if (this.Money<spend) {
            System.out.println("Mablag' yetarli emas");
        }
        else {
            this.Money -= spend;
            shownInfo();
        }
    }

    public void addMoney(int addSum) {
        this.Money += addSum;
        shownInfo();
    }

}
