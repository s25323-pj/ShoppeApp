package shopee_s25323.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import shopee_s25323.demo.Model.Basket;
import shopee_s25323.demo.Model.Customer;
import shopee_s25323.demo.Model.TransactionStatus;

@SpringBootApplication
public class ShopeeAppApplication {

    public static void main(String[] args) {
        SpringApplication.run(ShopeeAppApplication.class, args);
        Customer customer = new Customer(1,"Marek",  150);
        Basket basket = new Basket(1, customer);
        basket.addItemToBasket("Milk");
        basket.addItemToBasket("Milk");
        basket.addItemToBasket("Beer");
    }
)
}
