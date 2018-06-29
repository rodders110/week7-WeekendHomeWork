package Instruments;


import Behavoirs.IPlay;

public class Saxophone extends Instrument implements IPlay {

    private String decoration;


    public Saxophone(String make, String model, Double buyingPrice, Double sellingPrice, String decoration) {
        super(make, model, buyingPrice, sellingPrice);
        this.decoration = decoration;
    }

    public String getDecoration() {
        return decoration;
    }

    public String play() {
        return "Parrrrp";
    }
    public Double calculateMarkup() {
        return this.getSellingPrice() - this.getBuyingPrice();
    }
}
