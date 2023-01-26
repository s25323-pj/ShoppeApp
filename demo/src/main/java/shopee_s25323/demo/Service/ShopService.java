package shopee_s25323.demo.Service;

import org.springframework.stereotype.Component;
import shopee_s25323.demo.Model.Basket;
import shopee_s25323.demo.Model.Customer;
import shopee_s25323.demo.Model.Product;
import shopee_s25323.demo.Model.TransactionStatus;
import shopee_s25323.demo.Storage.ShopingStorage;

@Component
public class ShopService {
    public ShopService(ShopingStorage shopingStorage) {
        this.shopingStorage = shopingStorage;
    }

    private final ShopingStorage shopingStorage;

    public TransactionStatus orderItems(Basket basket) {
        int basketValue = 0;
        Customer customer = basket.getCustomer();
        for (String productName : basket.getProducts()) {
            basketValue += shopingStorage.getProductByName(productName).getPrice();
        }
        if (basketValue > customer.getBalance()) {
            return TransactionStatus.DECLINED;
        }
        customer.setBalance(customer.getBalance() - basketValue);
        return TransactionStatus.ACCEPTED;
    }


}
