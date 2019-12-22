package lv.javaguru.demo.HomeWork.Product;

public class ProductDemo {
    public static void main(String[] args) {
        Product product = new Product();

        product.name = "Balsam";
        product.regularPrice = 3.10;
        product.discount = 30;

        System.out.println("Product = " + product.name);
        System.out.println("Product's regular price = " + product.regularPrice + " EUR");
        System.out.println("Product's discount = " + product.discount + " %");

        product.printInformation();
    }
}
