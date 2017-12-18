package Instruments;


import Behaviours.IPlay;

public class Guitar extends Instrument implements IPlay {

    private int numberStrings;

    public Guitar(String colour, Type type, double buy_price, double sell_price, int numberStrings){
        super(colour, type, buy_price, sell_price);
        this.numberStrings = numberStrings;
    }

    public int getNumberStrings(){
        return numberStrings;
    }

    public String play() {
        return "Twaaaaang";
    }

    @Override
    public double MarkUp() {
        return 0;
    }
}
