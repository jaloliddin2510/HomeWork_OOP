package Lesson_8.HomeWork.Backet;

public class Basket {
    private  CapaCity maxWeight;
    private int FruitCapaCity;

    private Basket(CapaCity capaCity){
        this.maxWeight=capaCity;
        this.FruitCapaCity=0;
    }

    public CapaCity getMaxWeight() {
        return maxWeight;
    }

    public void setMaxWeight(CapaCity maxWeight) {
        this.maxWeight = maxWeight;
    }
}