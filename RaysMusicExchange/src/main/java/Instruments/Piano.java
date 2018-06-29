package Instruments;

import Behavoirs.IPlay;

public class Piano extends Instrument implements IPlay {


    public Piano(String make, String model, Double buyingPrice, Double sellingPrice) {
        super(make, model, buyingPrice, sellingPrice);
    }

    public String play() {
        return "Plink, plonk";
    }
    public Double calculateMarkup() {
        return this.getSellingPrice() - this.getBuyingPrice();
    }
}
