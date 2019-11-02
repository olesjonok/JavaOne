package lv.javaguru.demo.HomeWork;

public class Product {
    public String name;
    public double regularPrice;
    public double discount;

    public Product() {
        this.name = name;
        this.regularPrice = regularPrice;
        this.discount = discount;
    }

    public double actualPrice() {
        this.regularPrice = regularPrice;
        this.discount = discount;
        return regularPrice - (regularPrice * discount) / 100;
    }

    public void printInformation() {
        double priceWithDiscount = this.actualPrice();
        System.out.println(this.name + " price with discount = " + priceWithDiscount + " EUR");

    }
}
