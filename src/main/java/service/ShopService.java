package service;

import repo.Order.Order;
import repo.Order.OrderRepo;
import repo.Product.Product;
import repo.Product.ProductRepo;

public class ShopService {

    public static void main(String[] args) {

        Product product1 = new Product(41465, "Cheeseburger");
        Product product2 = new Product(44414, "Hamburger");
        Product product3 = new Product(41256, "Pommes");
        Product product4 = new Product(41255, "Wurst");


        ProductRepo productRepo = new ProductRepo();

        productRepo.addProduct(1, product1);
        productRepo.addProduct(2, product2);
        productRepo.addProduct(3, product3);
        productRepo.addProduct(4, product4);

        productRepo.listAllProducts();
        System.out.println(productRepo.listAllProducts());

        System.out.println(product1);

        OrderRepo orderSystem = new OrderRepo();

        Order order1 = new Order(1, product1);
        Order order2 = new Order(2, product2);


        orderSystem.putOrderInMap(1, order1);
        orderSystem.putOrderInMap(2, order2);


        System.out.println(orderSystem.getMapOrders());


    }


}

