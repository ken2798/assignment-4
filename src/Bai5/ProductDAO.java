/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai5;

import java.util.List;

/**
 *
 * @author tiencong
 */
public interface ProductDAO {
    public List<Product> getAll();
    public Product findById(int id);
    public List<Product> findByCategory(String category);
}

