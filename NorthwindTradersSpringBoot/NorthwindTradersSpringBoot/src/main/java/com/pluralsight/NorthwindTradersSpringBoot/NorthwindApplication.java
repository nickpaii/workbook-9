package com.pluralsight.NorthwindTradersSpringBoot;

import com.pluralsight.NorthwindTradersSpringBoot.data.ProductDAO;
import com.pluralsight.NorthwindTradersSpringBoot.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;

import java.util.List;

public class NorthwindApplication implements CommandLineRunner {

    @Autowired
    private ProductDAO productDAO;

    public static void main(String[] args) {
        SpringApplication.run(NorthwindTradersSpringBootApplication.class, args);
    }


    @Override
    public void run(String... args) throws Exception {
        productDAO.add(new Product(0, 2.99, "Coke", "Drinks"));

        List<Product> products = productDAO.getAll();
        System.out.println(products);



    }
}
