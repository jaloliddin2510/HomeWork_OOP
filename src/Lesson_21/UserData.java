package Lesson_21;

public class UserData {
    private String userName;
    private String nikeName;

    UserData(String userName, String  nikeName){
        this.userName=userName;
        this.nikeName=nikeName;
    }


    @Override
    public String toString() {
        return "UserData{" +
                "userName='" + userName + '\'' +
                ", nikeName='" + nikeName + '\'' +
                '}';
    }
}
