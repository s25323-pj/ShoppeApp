package shopee_s25323.demo.service;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import shopee_s25323.demo.Service.ShopService;
import shopee_s25323.demo.Storage.ShopingStorage;

@ExtendWith(MockitoExtension.class)
public class ShopeeAppTests {
    @Mock
    private ShopingStorage shopingStorage;
    @InjectMocks
    private ShopService shopService;

    @Test


}
