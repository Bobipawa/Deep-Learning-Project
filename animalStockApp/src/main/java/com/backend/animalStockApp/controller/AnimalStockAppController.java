package com.backend.animalStockApp.controller;

import com.backend.animalStockApp.entity.Product;
import com.backend.animalStockApp.service.AnimalStockAppService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class AnimalStockAppController {

    @Autowired
    private AnimalStockAppService animalStockAppService;

    @RequestMapping("/products")
    public List<Product> getProducts(){
        return animalStockAppService.getProducts();
    }

    @RequestMapping("/products/{id}")
    public Product getProduct(@PathVariable long id){
        return animalStockAppService.getProduct(id);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/products/{id}")
    public void deleteProduct(@PathVariable long id){
        animalStockAppService.deleteProduct(id);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/products/add")
    public void addProduct(@RequestBody Product product){
        animalStockAppService.addProduct(product);
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/products/{id}")
    public void updateProduct(@RequestBody Product product, @PathVariable long id){
        animalStockAppService.updateProduct(product, id);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/products/animals/{animal}")
    public List<Product> getAnimalProducts(@PathVariable String animal){
        return animalStockAppService.getAnimalProducts(animal);
    }

}
