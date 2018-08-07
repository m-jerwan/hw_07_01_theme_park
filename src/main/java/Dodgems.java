public class Dodgems extends Attraction implements ITicketed  {

    public Dodgems(String name, int rating) {
        super(name, rating);
    }

    public double defaultPrice(){
        return 4.50;
    }

    public double priceFor(Visitor visitor){
        if (visitor.getAge()<= 11 ){
            return defaultPrice()/2;
        }
        return  defaultPrice();
    }

}
