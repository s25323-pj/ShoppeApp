package shopee_s25323.demo.Service;

import shopee_s25323.demo.Model.Basket;
import shopee_s25323.demo.Model.Product;
import shopee_s25323.demo.Model.TransactionStatus;
import shopee_s25323.demo.Storage.ShopingStorage;

public class ShopService {
    public ShopService(ShopingStorage shopingStorage) {
        this.shopingStorage = shopingStorage;
    }

    private final ShopingStorage shopingStorage;

    public void orderItems(Basket basket) {
        int basketValue = 0;
        for (String productName : basket.getProducts()) {
            basketValue += shopingStorage.getProductByName(productName).getPrice();
        }
        if (basketValue > basket.getCustomer().getBalance()) {
            basket.setStatus(TransactionStatus.DECLINED);

        } else {
            basket.setStatus(TransactionStatus.ACCEPTED);
        }
    }


}
