package Instruments;


public class Guitar extends Instrument {

    private int numberStrings;

    public Guitar(String colour, Type type, double buy_price, double sell_price, int numberStrings){
        super(colour, type, buy_price, sell_price);
        this.numberStrings = numberStrings;
    }



}
