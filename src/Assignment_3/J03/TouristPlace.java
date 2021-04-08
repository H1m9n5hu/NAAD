package Assignment_3.J03;

import java.util.ArrayList;
import java.util.List;

public class TouristPlace {
    String name;
    String workingHour;
    int entryTicketPrice;
    int noOfRatings;
    float starRating;
    List<String> famousFor;

    TouristPlace(String name, String workingHour, int entryTicketPrice) {
        this.name = name;
        this.workingHour = workingHour;
        this.entryTicketPrice = entryTicketPrice;
        famousFor = new ArrayList<>();
        noOfRatings = 0;
        starRating = 0;
    }

    public void rate(int stars) {
        starRating = starRating*noOfRatings + stars;
        noOfRatings++;
        starRating /= noOfRatings;
    }

    public TouristPlace addFamousPlace(String S) {
        famousFor.add(S);
        return this;
    }

    public boolean isPlaceOpen() {
        return true;
    }
}

