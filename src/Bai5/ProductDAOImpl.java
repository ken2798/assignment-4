/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai5;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author tiencong
 */
public class ProductDAOImpl implements ProductDAO {
    
    private List<Product> products = new ArrayList<>();
    
    public ProductDAOImpl() {
        products.add(new Product(1, "Dell Screen", 200.0, "Screen"));
        products.add(new Product(2, "Logitech Master 2S", 100.0, "Mouse"));
        products.add(new Product(3, "Razer Basilik", 75.0, "Mouse"));
    }
    

    @Override
    public List<Product> getAll() {
        return products;
    }

    @Override
    public Product findById(int id) {
        for(Product p : products) {
            if (p.getId() == id) {
                return p;
            }
        }
        
        return null;
    }

    @Override
    public List<Product> findByCategory(String category) {
        List<Product> listProducts = new ArrayList<>();
        for(Product p : products) {
            if (p.getCategory().equalsIgnoreCase(category)) {
                listProducts.add(p);
            }
        }
        
        return listProducts;
    }
}

