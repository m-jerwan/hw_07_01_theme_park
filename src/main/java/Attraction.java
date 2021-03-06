public abstract class Attraction implements IReviewed, ISecurity{
    protected String name;
    protected int rating;

    public Attraction(String name, int rating) {
        this.name = name;
        this.rating = rating;
    }

    public String getName() {
        return name;
    }


    public int getRating() {
        return rating;
    }

    public boolean isAllowedTo(Visitor visitor){
        return true;
    }
}

