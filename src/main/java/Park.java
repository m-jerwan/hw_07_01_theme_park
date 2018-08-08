public class Park extends Attraction {

    public Park(String name, int rating) {
        super(name, rating);
    }

    public boolean isAllowedTo(Visitor visitor){
        return true;
    }


}

