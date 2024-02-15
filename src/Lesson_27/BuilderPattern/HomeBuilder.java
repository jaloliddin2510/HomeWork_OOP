package Lesson_27.BuilderPattern;

public interface HomeBuilder {
    // Builder
    void setHomeType(HomeType homeType);
    void setHomeField(String field);
    void setHomeCost(String cost);
    void setHomeLocation(Location location);
}
