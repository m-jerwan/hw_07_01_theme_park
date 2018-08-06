public class Rollercoaster extends Attraction implements ISecurity {

    public boolean isAllowedTo(Visitor visitor) {
        if (visitor.getHeight() >= 145 && visitor.getAge() >= 12) {
            return true;
        }
        return false;

    }
}
