package repos;

import java.util.HashMap;
import java.util.Map;

public class ProductRepo {


    /*
    should contain: products  !
                    list()    !
                    get()
     */


    private Map<Integer, Product> products = new HashMap<>();
    private int IdProduct = 0;

    public Product getProduct(int key){
        return products.get(key);
    }


    public boolean addProduct(String name, float price){
        for (Product product : products.values()){
            if (product.getName().equalsIgnoreCase(name)){
                return false;
            }
        }
        IdProduct++;

        Product product = new Product(IdProduct, name);
        products.put(product.getId(), product);
        return true;
    }

    public Map<Integer, Product> listProduct() {
        return products;
    }
}
