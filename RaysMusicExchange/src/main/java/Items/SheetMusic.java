package Items;

public class SheetMusic extends Item {

    private String author;
    private String title;
    private String publishingYear;

    public SheetMusic(String type, Double buyingPrice, Double sellingPrice, String author, String title, String publishingYear) {
        super(type, buyingPrice, sellingPrice);
        this.author = author;
        this.title = title;
        this.publishingYear = publishingYear;
    }

    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    public String getPublishingYear() {
        return publishingYear;
    }

    public Double calculateMarkup() {
        return this.getSellingPrice() - this.getBuyingPrice();
    }
}
