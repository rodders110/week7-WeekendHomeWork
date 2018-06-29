package Items;

public class CarryCase extends Item {

    private String colour;
    private String material;

    public CarryCase(String type, Double buyingPrice, Double sellingPrice, String colour, String material) {
        super(type, buyingPrice, sellingPrice);
        this.colour = colour;
        this.material = material;
    }

    public String getColour() {
        return colour;
    }

    public String getMaterial() {
        return material;
    }

    public Double calculateMarkup() {
        return this.getSellingPrice() - this.getBuyingPrice();
    }
}
