package Lesson_12.HomeWork_1;

public class Client {
    private int sumAll;
    private int sumCall;
    private int sumSms;

    public Client(int sumCall, int sumSms) {
        this.sumCall = sumCall;
        this.sumSms = sumSms;
    }
    public int addSum(int newSum){
        return sumAll=sumAll+newSum;
    }
    public boolean isActive(){
        return this.sumAll>=sumCall || this.sumAll>=sumSms;
    }
    public boolean call(int timeCall){
        return timeCall*sumCall<=sumAll;
    }
    public boolean sms(int countSms){
        return countSms*sumSms<=sumAll;
    }
    public int getSumAll() {
        return sumAll;
    }
}
