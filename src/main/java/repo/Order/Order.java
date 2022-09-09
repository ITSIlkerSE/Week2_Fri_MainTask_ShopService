package repo.Order;

import repo.Product.Product;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Order {

    private int id;


    private Map<Integer, Product> products = new HashMap<>();

    public Order(int id, Product product) {
        this.id = id;
        products.put(product.getId(), product);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Map<Integer, Product> getProducts() {
        return products;
    }

    public void setProducts(Map<Integer, Product> products) {
        this.products = products;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", mapProducts=" + products +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Order order = (Order) o;

        if (id != order.id) return false;
        return Objects.equals(products, order.products);
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (products != null ? products.hashCode() : 0);
        return result;
    }
}

