package shopee_s25323.demo.Storage;

import org.springframework.stereotype.Component;
import shopee_s25323.demo.Model.Product;

import java.util.List;

@Component
public class ShopingStorage {
    private final List<Product> productsList = List.of(new Product("Milk", 3), new Product("Beer", 2));

    public Product getProductByName(String name) {
        for (Product product : productsList) {
            if (product.getProduct().equals(name)) {
                return product;
            }
        }
        return null;
    }

    public List<Product> getProductsList() {
        return productsList;
    }
}
