/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mhphat.controller;

import com.mhphat.services.CategoryService;
import com.mhphat.services.implement.CategoryServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 *
 * @author admin
 */
@Controller

public class HomeController {
    @Autowired
    private CategoryService CateServ;
    @RequestMapping("/")
    public String Home(Model model){
        model.addAttribute("categories", this.CateServ.getCates());
        return "index";
    }
}
