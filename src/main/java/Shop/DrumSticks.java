package Shop;

import Behaviours.ISell;

public class DrumSticks extends Accessories implements ISell {

    public DrumSticks(String item, double buyPrice, double sellPrice) {

        this.item = item;
        this.buyPrice = buyPrice;
        this.sellPrice = sellPrice;
    }
}
