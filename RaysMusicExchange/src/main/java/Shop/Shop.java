package Shop;

import Behavoirs.ISell;

import java.util.ArrayList;

public class Shop {

    private ArrayList<ISell> stock;

    public Shop() {
        this.stock = new ArrayList<ISell>();
    }

    public void addItem(ISell item){
        this.stock.add(item);
    }

    public void removeItem(ISell item){
        this.stock.remove(item);
    }

    public ArrayList<ISell> getStock() {
        return stock;
    }

    public double totalProfit(){
        double total = 0;
        for(ISell item : getStock()){
            total += item.calculateMarkup();
        }
        return total;
    }
}
