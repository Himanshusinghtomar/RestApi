package com.example.restapi;

import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@RestController
public class ProductRestController {

    @PostMapping("/product")
    public String saveProduct(@RequestBody Product p)
    {
        System.out.println(p);
        return "Product Save";
    }

    @GetMapping("/product/{pid}")
    public Product getProduct(@PathVariable Integer pid)
    {
        Product p = null;
        if(pid == 100)
        {
             p = new Product(100,"Mouse",500.00);
        } else if (pid == 101) {

           p = new Product(101,"HD",6500.00);

        }

        return p;
    }

    @GetMapping("/products")
    public List<Product> getProducts()
    {
        Product p1 = new Product(100,"Mouse",500.00);
        Product p2 = new Product(100,"HD",6500.00);

        List<Product> products =  Arrays.asList(p1,p2);

        return products;

    }



}
