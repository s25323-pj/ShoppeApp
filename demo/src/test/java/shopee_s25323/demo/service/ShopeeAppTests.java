package shopee_s25323.demo.service;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import shopee_s25323.demo.Model.Product;
import shopee_s25323.demo.Service.ShopService;
import shopee_s25323.demo.Storage.ShopingStorage;

import java.util.List;


import static org.mockito.Mockito.when;
import static org.assertj.core.api.Assertions.assertThat;


@ExtendWith(MockitoExtension.class)
public class ShopeeAppTests {
    @Mock
    private ShopingStorage shopingStorage;
    @InjectMocks
    private ShopService shopService;

    @Test
    void shouldReturnAllProducts() {
        when(shopingStorage.getProductsList()).thenReturn(List.of(
                new Product("Milk", 10)));

        assertThat(shopService.getAllProducts()).isNotEmpty();
    }

    @Test
    void shouldReturnProductByName() {
        String productName = "Milk";
        Product p = new Product(productName, 50);
        when(shopingStorage.getProductByName(productName)).thenReturn(p);
        assertThat(shopService.getProductByName(productName).getPrice()).isEqualTo(50);
    }

}
