package Lesson_5;

public class MyCostsTheResult {
    public static void main(String[] args) {
        MyCosts costs=new MyCosts();
        costs.userName="Jalol";
        costs.Money=10000;
        costs.shownInfo();
        System.out.println(costs.getNowMoney());
        costs.spendMoney(12000);
    }
}
