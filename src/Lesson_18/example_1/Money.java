package Lesson_18.example_1;

public class Money {
    private int countTenThousand=100;
    private int countTwentyThousand=30;
    private int countFiftyThousand=20;
    private int count;

    public int getCountTenThousand() {
        return countTenThousand;
    }

    public int getCountTwentyThousand() {
        return countTwentyThousand;
    }

    public int getCountFiftyThousand() {
        return countFiftyThousand;
    }

    public void setCountTenThousand(int countTenThousand) {
        this.countTenThousand = countTenThousand;
    }

    public void setCountTwentyThousand(int countTwentyThousand) {
        this.countTwentyThousand = countTwentyThousand;
    }

    public void setCountFiftyThousand(int countFiftyThousand) {
        this.countFiftyThousand = countFiftyThousand;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    @Override
    public String toString() {
        return "Money{" +
                "countTenThousand=" + countTenThousand +
                ", countTwentyThousand=" + countTwentyThousand +
                ", countFiftyThousand=" + countFiftyThousand +
                ", count=" + count +
                '}';
    }
}
