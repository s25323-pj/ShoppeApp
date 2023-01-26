package shopee_s25323.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import shopee_s25323.demo.Model.Basket;
import shopee_s25323.demo.Model.Customer;
import shopee_s25323.demo.Model.TransactionStatus;
import shopee_s25323.demo.Service.ShopService;

@SpringBootApplication
public class ShopeeAppApplication {


    public ShopeeAppApplication(ShopService shopService){
        Customer customer = new Customer(1,"Marek",  150);
        Basket basket = new Basket(1, customer);
        basket.addItemToBasket("Milk");
        basket.addItemToBasket("Milk");
        basket.addItemToBasket("Beer");
        shopService.orderItems(basket);
    }
    public static void main(String[] args) {
        SpringApplication.run(ShopeeAppApplication.class, args);
    }

}
