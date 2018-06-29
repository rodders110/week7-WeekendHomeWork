package Instruments;

public  abstract class Instrument {
    private String make;
    private String model;
    private Double buyingPrice;
    private Double sellingPrice;

    public Instrument(String make, String model, Double buyingPrice, Double sellingPrice) {
        this.make = make;
        this.model = model;
        this.buyingPrice = buyingPrice;
        this.sellingPrice = sellingPrice;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public Double getBuyingPrice() {
        return buyingPrice;
    }

    public Double getSellingPrice() {
        return sellingPrice;
    }
}
