public class Playground extends Attraction implements ISecurity {

    public boolean isAllowedTo(Visitor visitor) {
        if (visitor.getAge() < 16){
            return true;
        }
            return false;

    }
}
