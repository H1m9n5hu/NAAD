package Assignment_3.J03;

import java.util.ArrayList;
import java.util.List;

public class City {
    String name;
    String state;
    List<TouristPlace> touristPlaces;

    City(String name, String state) {
        this.name = name;
        this.state = state;
        touristPlaces = new ArrayList<>();
    }
}
