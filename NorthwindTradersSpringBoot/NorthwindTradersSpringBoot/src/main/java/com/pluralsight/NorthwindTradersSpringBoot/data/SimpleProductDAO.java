package com.pluralsight.NorthwindTradersSpringBoot.data;

import com.pluralsight.NorthwindTradersSpringBoot.model.Product;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class SimpleProductDAO implements ProductDAO {

    private List<Product> products;

    private int nextID = 1;

    public SimpleProductDAO() {

        // create an empty list to hold products
        products = new ArrayList<>();

        products.add(new Product(nextID++, 7.99, "Kellogg's Frosted Flakes", "Cereal"));
        products.add(new Product(nextID++, 5.99, "Cinnamon Toast Crunch", "Cereal"));
        products.add(new Product(nextID++, 3.99, "Bananas", "Produce"));
        products.add(new Product(nextID++, 17.99, "8oz Sirloin", "Meat"));
    }

    @Override
    public void add(Product product) {
        product.setProductID(nextID++);

        products.add(product);
    }

    @Override
    public List<Product> getAll() {
        return products;
    }
}
