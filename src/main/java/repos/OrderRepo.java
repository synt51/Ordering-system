package repos;

import java.security.Key;
import java.util.HashMap;
import java.util.Map;

public class OrderRepo {
    /*
    should contain: orders  !
                    list()  !
                    get()   !
                    add()   !
     */

    private int idOrder = 0;

    private final Map<Integer, Order> orders = new HashMap<>();

    public Map<Integer, Order> listOrder(){
        return this.orders;
    }

    public Order getOrder(int id){
        return this.orders.get(id);
    }

    public Order addOrder(){
        idOrder++;
        Order order = new Order(idOrder, new HashMap<>());
        this.orders.put(order.getId(), order);
        return order;
    }
}
