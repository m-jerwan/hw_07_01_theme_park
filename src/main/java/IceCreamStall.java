public class IceCreamStall extends Stall implements ITicketed {


    public IceCreamStall(String name, String ownerName, String parkingSpot) {
        super(name, ownerName, parkingSpot);
    }

    public double defaultPrice(){
        return 4.20;
    }

    public double priceFor(Visitor visitor){
        return defaultPrice();
    }


}
