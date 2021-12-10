import repos.Order;
import repos.OrderRepo;
import repos.Product;
import repos.ProductRepo;

import java.util.HashMap;
import java.util.Map;

public class ShopService {

    /*
    should contain: orderRepo, productRepo
                    getProduct()
                    listProduct()
                    addOrder()
                    getOrder()
                    listOrders()
     */

    OrderRepo orderRepo;
    ProductRepo productRepo;


    public ShopService(OrderRepo orderRepo, ProductRepo productRepo) {
        this.orderRepo = orderRepo;
        this.productRepo = productRepo;
    }

    public boolean addProduct(String name, float price) {
        return productRepo.addProduct(name, price);
    }

    public Product getProduct(int id) {
        return productRepo.getProduct(id);
    }

    public String listProducts() {
        StringBuilder sb = new StringBuilder("Unsere Produkte:" + '\n');
        for (Product product : productRepo.listProduct().values()) {
            sb.append(product.toString());
            sb.append("\n");
        }
        return sb.toString();
    }

    public Order addOrder() {
        return orderRepo.addOrder();
    }

    public Order getOrder(int id) {
        return orderRepo.getOrder(id);
    }

    public String listOrders() {
        StringBuilder sb = new StringBuilder("Aktuelle Bestellungen:" + '\n');
        for (Order order : orderRepo.listOrder().values()) {
            sb.append(order.toString());
            sb.append("\n");
        }
        return sb.toString();
    }

    public void addToOrder(Order order, Product product) throws RuntimeException {

        if (product == null) {
            throw new RuntimeException("Diese Produktnummer kenne ich nicht...");
        } else {
            order.addProduct(product);
        }
    }
}
