public class TobaccoStall extends Stall implements ISecurity {

    public TobaccoStall(String name, String ownerName, String parkingSpot) {
        super(name, ownerName, parkingSpot);
    }

    public boolean isAllowedTo(Visitor visitor) {
        if (visitor.getAge() >= 18){
            return true;
        }
        return false;
    }

    public double defaultPrice(){
        return 6.60;
    }

    public double priceFor(Visitor visitor){
        return defaultPrice();
    }
}
