package lv.javaguru.demo.HomeWork.Stock;

public class Stock {
    private String companyName;
    private double currentPrice;
    private double maxPrice;
    private double minPrice;

    public Stock(String companyName, int currentPrice) {
        this.companyName = companyName;
        this.currentPrice = currentPrice;
        this.maxPrice = this.currentPrice;
        this.minPrice = this.currentPrice;
    }

    public void updatePrice(double newPrice) {
        this.currentPrice = newPrice;
        if (newPrice >= maxPrice) {
            maxPrice = newPrice;
        } else if (newPrice <= minPrice) {
            minPrice = newPrice;
        }
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public double getCurrentPrice() {
        return currentPrice;
    }

    public void setCurrentPrice(double currentPrice) {
        this.currentPrice = currentPrice;
    }

    public double getMaxPrice() {
        return maxPrice;
    }

    public void setMaxPrice(double maxPrice) {
        this.maxPrice = maxPrice;
    }

    public double getMinPrice() {
        return minPrice;
    }

    public void setMinPrice(double minPrice) {
        this.minPrice = minPrice;
    }

    public void printInformation() {
        System.out.println("Company = " + companyName + "; Current Price = " + currentPrice + "; Min Price = " + minPrice + "; Max Price = " + maxPrice);
    }
}
