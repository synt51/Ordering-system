import repos.Order;
import repos.OrderRepo;
import repos.Product;
import repos.ProductRepo;

public class Main {

    public static void main(String[] args) {

        ShopService shopService = new ShopService(new OrderRepo(), new ProductRepo());

        boolean product = shopService.addProduct("Kartoffeln", 2.5f);
        shopService.addProduct("Tomaten", 3.0f);
        shopService.addProduct("RTX 3080", 17000.0f);


        shopService.listProducts();
        System.out.println(shopService.listProducts());
        System.out.println(shopService.getProduct(1));


        Order order = shopService.addOrder();
        shopService.addToOrder(shopService.getOrder(1), shopService.getProduct(3));
        shopService.addToOrder(order, shopService.getProduct(2));
        System.out.println(shopService.getOrder(1));
        shopService.addOrder();
        shopService.addToOrder(shopService.getOrder(2), shopService.getProduct(1));
        shopService.addToOrder(shopService.getOrder(2), shopService.getProduct(2));
        System.out.println(shopService.listOrders());
    }
}