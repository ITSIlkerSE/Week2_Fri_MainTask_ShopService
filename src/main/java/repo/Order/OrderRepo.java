package repo.Order;


import java.util.HashMap;
import java.util.Map;


public class OrderRepo {

    private Map<Integer, Order> mapOrders = new HashMap<>(1);


    public void putOrderInMap(Integer id, Order order) {
        mapOrders.put(id, order);

    }

    public Order getOrderById(Integer id) {
        if (mapOrders.get(id) == null) throw new RuntimeException("Cant order a non present product");
        return mapOrders.get(id);


    }


    public Map<Integer, Order> getMapOrders() {
        return mapOrders;
    }

    @Override
    public String toString() {
        return "OrderRepo{" +
                "mapOrders=" + mapOrders +
                '}';
    }
}
