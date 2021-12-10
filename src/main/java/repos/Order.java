package repos;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

public class Order {

    /*
    should contain: id, products
     */

    private final int id;

    private Map<Integer, Product> products = new HashMap<>();

    public Order (int id, HashMap<Integer, Product> products) {

        this.id = id;
        this.products = products;
    }


    public Map<Integer, Product> getProducts(){
        return products;
    }

    public void addProduct (Product product){
        products.put(product.getId(), product);
    }

    public int getId(){
        return id;
    }

    @Override
    public String toString() {
        return "Bestellnummer=" + id +
                ", Produkte=" + products;
    }
}
