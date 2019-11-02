package lv.javaguru.demo.HomeWork;


public class Stock2 {
    private String companyName;
    private double currentPrice;
    private double maxPrice;
    private double minPrice;

    public Stock2(String companyName, double currentPrice) {
        this.companyName = companyName;
        this.currentPrice = currentPrice;
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

    public void updatePrice(double newPrice) {

        if (newPrice > maxPrice) {
            maxPrice = newPrice;
            this.currentPrice = newPrice;
        } else if (newPrice < this.currentPrice) {
            minPrice = newPrice;
            this.currentPrice = newPrice;
        } else  {
            this.currentPrice = newPrice;
        }
    }

    public void printInformation() {
        System.out.println("Company = " + companyName + "; Current Price = " + currentPrice + "; Min Price = " + minPrice + "; Max Price = " + maxPrice);
    }
}

