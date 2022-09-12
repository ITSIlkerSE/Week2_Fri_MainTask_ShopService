package repo.Order;

import org.junit.jupiter.api.Test;
import repo.Product.Product;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class OrderRepoTest {

    @Test
    void shouldReturnOrderWhenIdIsPresent() {

        //Given

        Product product = new Product(1, "Maximenu");

        Map<Integer, Product> mapProducts = new HashMap<>();

        Order order = new Order(1, product);

        OrderRepo orderRepo = new OrderRepo();

        orderRepo.putOrderInMap(5, order);


        //When


        Order actual = orderRepo.getOrderById(5);


        //Then

        assertEquals(order, actual);


    }

}