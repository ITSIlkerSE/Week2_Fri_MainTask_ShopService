package repo.Product;

import java.util.HashMap;
import java.util.Map;


public class ProductRepo {


    private Map<Integer, Product> products = new HashMap<>();


    public void addProduct(Integer id, Product name){
        products.put(id, name);
    }

    public Map<Integer, Product> listAllProducts(){
        return products ;
    }


    public Map<Integer, Product> getMapOfProducts() {
        return products;
    }

    public void setMapOfProducts(Map<Integer, Product> mapOfProducts) {
        this.products = mapOfProducts;
    }


}
