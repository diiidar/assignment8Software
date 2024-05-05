package assignment8Software.ex1;

public class Main {
    public static void main(String[] args) {
        Investor investor1 = new Investor("Arman");
        Investor investor2 = new Investor("Olzhas");

        Stock kaspi = new Stock("KSPI", 118.5);
        Stock kolesa = new Stock("KLSA", 140.2);

        investor1.investInStock(kaspi);
        investor2.investInStock(kolesa);

        kaspi.updatePrice(160.0);
        kolesa.updatePrice(310.0);

        investor1.divestFromStock(kaspi);

        kaspi.updatePrice(170.0);
    }
}
