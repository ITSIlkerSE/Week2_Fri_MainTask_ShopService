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

    @Test
    void shouldReturnOrderListWhenAskedFor() {

        //Given

        Product product = new Product(1, "Maxidadanu");
        Product product1 = new Product(2, "Maxdasdasenu");
        Product product2 = new Product(3, "Maxdadamenu");

        Map<Integer, Product> mapProducts = new HashMap<>();

        Order order = new Order(1, product);
        Order order1 = new Order(2, product1);
        Order order2 = new Order(3, product2);

        OrderRepo orderRepo = new OrderRepo();

        orderRepo.putOrderInMap(5, order);
        orderRepo.putOrderInMap(5, order1);
        orderRepo.putOrderInMap(5, order2);

        //When


        //Then


    }
}