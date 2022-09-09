package repo.Order;


import java.util.HashMap;
import java.util.Map;


public class OrderRepo {

    private Map<Integer, Order> mapOrders = new HashMap<>();


    public void putOrderInMap(Integer id, Order order) {
        mapOrders.put(id, order);

    }

    public Order getOrderById(Integer id) {
        return mapOrders.get(id);


    }

    public Map<Integer, Order> listAllProducts(){
        return mapOrders ;
    }


    public Map<Integer, Order> getMapOrders() {
        return mapOrders;
    }

    public void setMapOrders(Map<Integer, Order> mapOrders) {
        this.mapOrders = mapOrders;
    }

    @Override
    public String toString() {
        return "OrderRepo{" +
                "mapOrders=" + mapOrders +
                '}';
    }
}

//    public Map<Integer, Product> listAllProducts(){
//        return products ;
