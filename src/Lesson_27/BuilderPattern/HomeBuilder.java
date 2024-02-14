package Lesson_27.BuilderPattern;

public interface HomeBuilder {

    void setHomeType(HomeType homeType);
    void setHomeField(String field);
    void setHomeCost(String cost);
    void setHomeLocation(Location location);
}
