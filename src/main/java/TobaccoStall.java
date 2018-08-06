public class TobaccoStall extends Stall implements ISecurity {

    public boolean isAllowedTo(Visitor visitor) {
        if (visitor.getAge() >= 18){
            return true;
        }
        return false;

    }
}
