package Lesson_5;

public class MakeiceCream {
    public static void main(String[] args) {
        int a=4;
        int b=4;
        MakeiceCream makeiceCream=new MakeiceCream();
        makeiceCream.milk=15;
        makeiceCream.sugar=15;
        makeiceCream.addMilk(a);
        makeiceCream.addSugar(b);
        System.out.println(makeiceCream.maxIceCreamCount(a, b));
        makeiceCream.showInfo();
        makeiceCream.makeIceCream(a,b,3);
    }
    int milk;
    int sugar;
    public void addMilk(int a){
        System.out.println(a+" litr sutimiz bor");
    }
    public void addSugar(int b){
        System.out.println(b+" kg shakarimiz bor");
    }
    public int  maxIceCreamCount(int a, int b){
        int litr=0, kg=0;
        while (milk>0){
            milk=milk-a;
            litr++;
        }
        while (sugar>0){
            sugar=sugar-b;
            kg++;
        }return (litr>kg) ? kg : litr;
    }
    public void showInfo(){
        MakeiceCream makeiceCream=new MakeiceCream();
        System.out.println(makeiceCream.maxIceCreamCount(4, 4)+" ta muzqaymoq tayyorlasa bo'ladi");
    }public void makeIceCream(int a, int b, int count){
        int x, y;
        if (a*count<milk && b*count<sugar){
            x=milk-a*count;
            y=sugar-b*count;
            System.out.println(x+" litr sut va "+y+" litr shakar ortib qoladi");
        }
        else System.out.println(count+" ta muzqaymoq tayyorlash uchun mahsulot yetarli emas");
    }
}
