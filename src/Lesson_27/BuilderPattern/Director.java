package Lesson_27.BuilderPattern;

import java.util.Random;

public class Director {
    // Director
    public void createApart(HomeBuilder homeBuilder, Location location){
        homeBuilder.setHomeType(HomeType.APART);
        homeBuilder.setHomeField(String.valueOf(new Random().nextLong(150)));
        homeBuilder.setHomeCost("100 000 $");
        homeBuilder.setHomeLocation(Location.TASHKENT);
    }
    public void createCourt(HomeBuilder homeBuilder, Location location){
        homeBuilder.setHomeType(HomeType.COURT);
        homeBuilder.setHomeField(String.valueOf(new Random().nextLong(800)));
        homeBuilder.setHomeCost("200 000 $");
        homeBuilder.setHomeLocation(Location.TASHKENTREGION);
    }
    public void createOffice(HomeBuilder homeBuilder, Location location){
        homeBuilder.setHomeType(HomeType.OFFICE);
        homeBuilder.setHomeField(String.valueOf(new Random().nextLong(100)));
        homeBuilder.setHomeCost("90 000 $");
        homeBuilder.setHomeLocation(Location.TASHKENT);
    }

}
