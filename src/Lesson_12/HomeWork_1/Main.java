package Lesson_12.HomeWork_1;

public class Main {
    public static void main(String[] args) {
    Client client=new Client(5,3);
        System.out.println("New schot client: "+client.addSum(20));
        System.out.println("Biror xizmatdan foydalanish uchun hisob faolmi? "+client.isActive());
        System.out.println("10 daqiqa gaplashishga pul yetadimi? "+client.call(10));
        System.out.println("21 ta sms yuborish uchun pul yetadimi? "+client.sms(21));
        System.out.println("New schot client: "+client.addSum(20));
        System.out.println("Biror xizmatdan foydalanish uchun hisob faolmi? "+client.isActive());
        System.out.println("10 daqiqa gaplashishga pul yetadimi? "+client.call(10));
        System.out.println("21 ta sms yuborish uchun pul yetadimi? "+client.sms(21));
        System.out.println("New schot client: "+client.addSum(20));
        System.out.println("Biror xizmatdan foydalanish uchun hisob faolmi? "+client.isActive());
        System.out.println("10 daqiqa gaplashishga pul yetadimi? "+client.call(10));
        System.out.println("21 ta sms yuborish uchun pul yetadimi? "+client.sms(21));
    }
}
