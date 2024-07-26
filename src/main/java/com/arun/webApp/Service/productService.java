package com.arun.webApp.Service;

import com.arun.webApp.Model.Product;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class productService {
    List<Product> products = new ArrayList<>(Arrays.asList(
            new Product(101,"Samsung S24 Ultra",80000),
            new Product(102,"Sony alpha 9 M3",500000),
            new Product(103,"canon R8",125000)));

    public List<Product> getProducts() {
        return products;
    }

    public Product getProductById(int prodId) {
        return products.stream()
                .filter(p -> p.getProdId() == prodId)
                .findFirst().get();
    }

    public void addProduct(Product product){
        products.add(product);
    }

    public void updateProduct(Product product) {
        int index = 0;
        for(int i=0;i<products.size();i++){
            if(products.get(i).getProdId() == product.getProdId())
                index = i;
        }
        products.set(index,product);
    }

    public void delProduct(int prodId) {
        int index = 0;
        for(int i=0;i<products.size();i++)
            if(products.get(i).getProdId() == prodId)
                index = i;

        products.remove(index);

    }
}
