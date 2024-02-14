package Lesson_27.BuilderPattern;

public class ConcreteHome implements HomeBuilder{
    private HomeType homeType;
    private String homeField;
    private String homeCost;
    private Location homeLocation;

    @Override
    public void setHomeType(HomeType homeType) {
        this.homeType=homeType;

    }

    @Override
    public void setHomeField(String field) {
        this.homeField=field;
    }

    @Override
    public void setHomeCost(String cost) {
        this.homeCost=cost;
    }

    @Override
    public void setHomeLocation(Location location) {
        this.homeLocation=location;
    }

    public Home build(){
        return new Home(homeType,homeField,homeCost,homeLocation);
    }
}
