public abstract class Stall implements IReviewed, ISecurity {
    protected String name;
    protected String ownerName;
    protected String parkingSpot;
    protected int rating;


    public Stall(String name, String ownerName, String parkingSpot) {
        this.ownerName = ownerName;
        this.parkingSpot = parkingSpot;
        this.name = name;
    }

    public String getName() {
        return name;
    }


    public int getRating() {
        return rating;
    }
}
