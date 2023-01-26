package com.backend.animalStockApp.service;

import com.backend.animalStockApp.entity.Product;
import org.springframework.stereotype.Service;

import java.security.DigestException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class AnimalStockAppService {

    static private ArrayList<Product> products = new ArrayList<>(Arrays.asList(
            new Product(1, "Insecticide", "ORO", Product.Color.GREEN, 10, "Dog"),
            new Product(2, "Insecticide", "ORO", Product.Color.YELLOW, 10, "Dog"),
            new Product(3, "Insecticide", "ORO", Product.Color.GRAY, 10, "Horse"),
            new Product(4, "Insecticide", "ORO", Product.Color.RED, 10, "Cat"),
            new Product(5, "Insecticide", "ORO", Product.Color.BROWN, 10, "Dog"),
            new Product(6, "Insecticide", "ORO", Product.Color.PURPLE, 10, "Hen")
    ));

    public List<Product> getProducts(){
        return products;
    }

    public Product getProduct(long id) {
        return products.stream().filter(product -> product.getId() ==  id).findFirst().orElse(null);
    }

    public void deleteProduct(long id) {
        products.removeIf(prod -> prod.getId() == id);
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public void updateProduct(Product product, long id) {
        products.forEach(product1 -> {
            if (product1.getId() == id){
                products.set(products.indexOf(product1), product);
            }
        });
    }

    public List<Product> getAnimalProducts(String animal) {
        return (List<Product>) products.stream().filter(product -> product.getAnimal() == animal).findAny().orElse(null);
    }

}
