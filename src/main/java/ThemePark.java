import java.util.ArrayList;
import java.util.stream.DoubleStream;

public class ThemePark {

    ArrayList<Stall> allStalls;
    ArrayList<Attraction> allAttractions;

    public ThemePark() {
        this.allStalls = new ArrayList<>();
        this.allAttractions = new ArrayList<>();
    }

    public void addStall(Stall stall){
        this.allStalls.add(stall);
    }

    public void addAttraction(Attraction attraction){
        this.allAttractions.add(attraction);
    }

    public boolean hasPlace(Attraction attraction){
        return this.allAttractions.contains(attraction);
    }

    public boolean hasPlace(Stall stall){
        return this.allStalls.contains(stall);
    }

    public ArrayList<IReviewed> getAllReviewed(){
        ArrayList<IReviewed> allReviewed = new ArrayList<>();
        for (IReviewed place : allAttractions){
            allReviewed.add(place);
        }
        for (IReviewed place : allStalls){
            allReviewed.add(place);
        }
        return allReviewed;
    }

}
