package Lesson_19.Burger;

public class Burger {
    private ProductSimple productSimple;
    private Ingredient ingredient;
    private int count;
    private int price;

    public Burger(ProductSimple productSimple, int count, int price) {
        this.productSimple = productSimple;
        this.count = count;
        this.price = price;
    }

    public Burger(Ingredient ingredient, int count, int price) {
        this.ingredient = ingredient;
        this.count = count;
        this.price = price;
    }

    public Burger(ProductSimple productSimple, int count) {
        this.productSimple = productSimple;
        this.count = count;
    }

    public Burger(Ingredient ingredient, int count) {
        this.ingredient = ingredient;
        this.count = count;
    }

}
