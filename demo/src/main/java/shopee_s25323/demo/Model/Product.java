package shopee_s25323.demo.Model;

public class Product {
    private String name;
    private int price;

    public Product(String product, int price) {
        this.name = product;
        this.price = price;
    }

    public String getProduct() {
        return name;
    }

    public void setProduct(String product) {
        this.name = product;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "product='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
