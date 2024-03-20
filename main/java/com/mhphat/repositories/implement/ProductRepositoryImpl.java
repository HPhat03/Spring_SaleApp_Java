/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mhphat.repositories.implement;

import com.mhphat.pojo.Product;
import com.mhphat.repositories.ProductRepository;
import java.util.List;
import javax.persistence.Query;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author admin
 */
@Repository
@Transactional
public class ProductRepositoryImpl implements ProductRepository{
    
    @Autowired
    private LocalSessionFactoryBean f;
    
    @Override
    public List<Product> getProds() {
        Session s = this.f.getObject().getCurrentSession();
        Query q = s.createNamedQuery("Product.findAll");
        return q.getResultList();
    }
    
}
