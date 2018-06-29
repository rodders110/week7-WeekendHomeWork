package Items;

import Behavoirs.ISell;

public abstract class Item implements ISell {

    private String type;
    private Double buyingPrice;
    private Double sellingPrice;

    public Item(String type, Double buyingPrice, Double sellingPrice) {
        this.type = type;
        this.buyingPrice = buyingPrice;
        this.sellingPrice = sellingPrice;
    }

    public String getType() {
        return type;
    }

    public Double getBuyingPrice() {
        return buyingPrice;
    }

    public Double getSellingPrice() {
        return sellingPrice;
    }
}
