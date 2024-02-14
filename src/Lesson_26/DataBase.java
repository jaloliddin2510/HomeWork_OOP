package Lesson_26;


import java.util.ArrayList;
import java.util.Scanner;
import java.util.function.Consumer;

public class DataBase {
    private static DataBase base = null;
    private final ArrayList<UserPerson> user = new ArrayList<>();
    private final Scanner scanner = new Scanner(System.in);
    private final Consumer<String> listener = System.out::println;
    private final LoginSignFunc<Sign, String> signListener = (sign, number) -> {
        switch (sign) {
            case IN -> {
                System.out.println("password kiritilgan");
                String password = scanner.nextLine();
                login(number, password);
            }
            case UP -> {
                System.out.println("Ismingizni kiriting: ");
                String name = scanner.nextLine();
                System.out.println("parol kiriting");
                String password = scanner.nextLine();
                registration(name, password, number);
            }
        }
    };

    private void registration(String name, String password, String phoneNumber) {
        user.add(new UserPerson(name, password, phoneNumber));
        listener.accept("tizimdasiz");
        listener.accept("parol kiriting");

    }

    private DataBase() {
    }

    ;

    public static DataBase getInstance() {
        if (base == null) {
            base = new DataBase();
        }
        return base;
    }

    public void chekUser(String phoneNumber) {
        if (!isUserExist(phoneNumber)) {
            signListener.notify(Sign.IN, phoneNumber);
        } else {
            listener.accept("Tizimda borsiz");
            listener.accept("Parolni kiriting");

        }
    }

    public void showData() {

    }

    private boolean isUserExist(String phoneNumber) {
        for (UserPerson userPerson : user) {
            return (userPerson.getPhoneNumber().equals(phoneNumber));
        }
        return false;
    }

    private int getUserIndex(UserPerson userPerson) {
        return user.indexOf(userPerson);
    }

    private void login(String number, String password) {
        for (UserPerson userPerson : user) {
            if (userPerson.getPhoneNumber().equals(number) && userPerson.getPassword().equals(password)) {
                System.out.println("Tizimdasiz");
            } else {
                listener.accept("Kirolmadingiz");
            }
        }
    }
}
