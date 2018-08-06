public abstract class Stall implements IReviewed {
    protected String name;
    protected String ownerName;
    protected String parkingSpot;
    protected int rating;


    public String getName() {
        return name;
    }


    public int getRating() {
        return rating;
    }
}
