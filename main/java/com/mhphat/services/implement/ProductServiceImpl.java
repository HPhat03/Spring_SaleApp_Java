/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mhphat.services.implement;

import com.mhphat.pojo.Product;
import com.mhphat.repositories.ProductRepository;
import com.mhphat.services.ProductServce;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author admin
 */
@Service
public class ProductServiceImpl implements ProductServce{
    
    @Autowired
    private ProductRepository prodRepo;
    @Override
    public List<Product> getProds() {
        return this.prodRepo.getProds();
    }
    
}
