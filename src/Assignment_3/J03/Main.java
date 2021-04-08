package Assignment_3.J03;

public class Main {
    public static void main(String[] args) {
        TouristPlace england = new TouristPlace("London","10:00AM to 5:00PM",1000);

        england.addFamousPlace("Big Ben")
                .addFamousPlace("The British Museum")
                .addFamousPlace("Parks and Gardens")
                .addFamousPlace("London Eye");

        england.rate(4);
        england.rate(5);
        england.rate(5);
        england.rate(5);

        System.out.println("Rating of England as a Tourist Place is " + england.starRating + ".");

    }
}
