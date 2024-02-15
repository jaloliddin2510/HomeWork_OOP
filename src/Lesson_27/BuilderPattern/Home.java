package Lesson_27.BuilderPattern;

public class Home {
    //Product
    private final HomeType homeType;
    private final String homeField;
    private final String homeCost;
    private final Location homeLocation;

    public Home(HomeType homeType, String homeField, String homeCost, Location homeLocation) {
        this.homeType = homeType;
        this.homeField = homeField;
        this.homeCost = homeCost;
        this.homeLocation = homeLocation;
    }

    public HomeType getHomeType() {
        return homeType;
    }

    public String getHomeField() {
        return homeField;
    }

    public String getHomeCost() {
        return homeCost;
    }

    public Location getHomeLocation() {
        return homeLocation;
    }

    @Override
    public String toString() {
        return "Home{" +
                "homeType=" + homeType +
                ", homeField='" + homeField + '\'' +
                ", homeCost='" + homeCost + '\'' +
                ", homeLocation='" + homeLocation + '\'' +
                '}';
    }
}
