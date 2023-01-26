package shopee_s25323.demo.Model;

import java.util.ArrayList;
import java.util.List;

public class Basket {
    private final int basketID;
    private TransactionStatus status;
    private final Customer customer;
    private List<String> products = new ArrayList<>();

    public Basket(int basketID, Customer customer) {
        this.basketID = basketID;

        this.customer = customer;
    }

    public int getBasketID() {
        return basketID;
    }

    public TransactionStatus getStatus() {
        return status;
    }

    public void setStatus(TransactionStatus status) {
        this.status = status;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void addItemToBasket(String name) {
        products.add(name);
    }

    public List<String> getProducts() {
        return products;
    }

    public void setProducts(List<String> products) {
        this.products = products;
    }

    @Override
    public String toString() {
        return "Basket{" +
                "basketID=" + basketID +
                ", status=" + status +
                ", customer=" + customer +
                '}';
    }
}
