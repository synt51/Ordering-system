import org.junit.jupiter.api.Test;
import repos.OrderRepo;
import repos.ProductRepo;

import static org.junit.jupiter.api.Assertions.*;

class ShopServiceTest {

    @Test
    void checkAddProduct(){
        ShopService shopService = new ShopService(new OrderRepo(), new ProductRepo());
        shopService.addProduct("Wurst", 3.0f);
        assertEquals("Wurst", shopService.getProduct(1).getName());
    }

    @Test
    void checkAddProductFalse(){
        ShopService shopService = new ShopService(new OrderRepo(), new ProductRepo());
        shopService.addProduct("Wurst", 3.0f);
        assertNotEquals("Bier", shopService.getProduct(1).getName());
    }

}