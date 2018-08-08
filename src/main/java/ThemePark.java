import java.util.ArrayList;

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

    public void visit(Visitor visitor, Attraction attraction){
//        TODO empty method
    }


    public ArrayList<ISecurity> getAllAllowedFor(Visitor visitor) {

        ArrayList<ISecurity> allAllowed = new ArrayList<ISecurity>();


        for (Stall stall : allStalls) {
            if (stall.isAllowedTo(visitor) == true) {
                allAllowed.add(stall);
            }
        }
        for (Attraction attraction : allAttractions) {
            if (attraction.isAllowedTo(visitor) == true) {
                allAllowed.add(attraction);
            }
        }
        return allAllowed;
    }
}
