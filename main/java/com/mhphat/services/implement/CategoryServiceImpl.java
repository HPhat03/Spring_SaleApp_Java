/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mhphat.services.implement;

import com.mhphat.pojo.Category;
import com.mhphat.repositories.CategoryRepository;
import com.mhphat.services.CategoryService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author admin
 */
@Service
public class CategoryServiceImpl implements CategoryService{
    
    @Autowired
    private CategoryRepository cateRepo;
    @Override
    public List<Category> getCates() {
        System.out.println(this.cateRepo.getCates());
        return this.cateRepo.getCates();
    }
    
}
