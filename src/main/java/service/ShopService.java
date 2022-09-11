package service;

import repo.Order.Order;
import repo.Order.OrderRepo;
import repo.Product.Product;
import repo.Product.ProductRepo;

import java.io.IOException;
import java.util.Scanner;

public class ShopService {

    public static void main(String[] args) throws IOException {

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
        Order order3 = new Order(3, product3);


        orderSystem.putOrderInMap(1, order1);
        orderSystem.putOrderInMap(2, order2);
        orderSystem.putOrderInMap(3, order3);


        System.out.println(orderSystem.getOrderById(2));
        System.out.println(orderSystem.getMapOrders());

        Scanner myScannerShopService = new Scanner(System.in);
        System.out.println("Retrieve order or product?");
        String scanProductOne = myScannerShopService.nextLine();
        if ("product".equals(scanProductOne)) {
            System.out.println("Products : " + productRepo.listAllProducts());
            System.out.println("Put in id to retrieve specific product ");
            Scanner myScannerProduct = new Scanner(System.in);
            String productId = myScannerProduct.nextLine();
            System.out.println("Products by Id : " + productRepo.getProductById(Integer.parseInt(productId)));

        } else if (scanProductOne.equals("order")) {
            System.out.println("Orders : " + orderSystem.getMapOrders());
            System.out.println("Put in id to retrieve specific order ");
            Scanner myScannerOrder = new Scanner(System.in);
            int orderId = Integer.parseInt(myScannerOrder.nextLine());
            System.out.println("Orders by Id : " + orderSystem.getOrderById(orderId));


        } else {
            System.out.println("Please pick either products or orders");
        }


    }


}

