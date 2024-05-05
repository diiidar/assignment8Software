package assignment8Software.ex1;

import java.util.ArrayList;
import java.util.List;

public class Investor {private String name;
    private List<Stock> stocks;

    public Investor(String name) {
        this.name = name;
        this.stocks = new ArrayList<>();
    }

    public void update(Stock stock, double price) {
        System.out.println("Notification for investor " + name + ": Price of stock " + stock.getSymbol() + " updated to " + price);
    }

    public void investInStock(Stock stock) {
        stocks.add(stock);
        stock.registerInvestor(this);
    }

    public void divestFromStock(Stock stock) {
        stocks.remove(stock);
        stock.unregisterInvestor(this);
    }

    public String getName() {
        return name;
    }
}
