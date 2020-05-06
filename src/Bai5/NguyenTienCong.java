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
public class NguyenTienCong {
    private static ProductDAO productDAO;
    
    public static void main(String[] args) {
        productDAO = new ProductDAOImpl();
        
        Product p = productDAO.findById(1);
        System.out.println(p.toString());
        System.out.println("----------------");
        
        List<Product> products = productDAO.findByCategory("Mouse");
        for(Product item: products) {
            System.out.println(item.toString());
        }
    }
}

