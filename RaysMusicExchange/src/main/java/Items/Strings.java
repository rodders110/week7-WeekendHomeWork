package Items;

public class Strings extends Item {

    public Strings(String type, Double buyingPrice, Double sellingPrice) {
        super(type, buyingPrice, sellingPrice);
    }


    public Double calculateMarkup() {
        return this.getSellingPrice() - this.getBuyingPrice();
    }
}
