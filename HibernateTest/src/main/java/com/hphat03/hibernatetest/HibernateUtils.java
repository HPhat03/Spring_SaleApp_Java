/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.hphat03.hibernatetest;

import com.hphat03.pojoClass.*;
import com.hphat03.pojoClass2.*;
import java.util.Properties;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;
import org.hibernate.service.ServiceRegistry;


/**
 *
 * @author admin
 */
public class HibernateUtils {
    public static final SessionFactory factory;
    
    static {
        Configuration conf = new Configuration();
        Properties prop = new Properties();
        prop.put(Environment.DRIVER, "com.mysql.cj.jdbc.Driver");
        prop.put(Environment.URL, "jdbc:mysql://localhost:3306/saledb");
        prop.put(Environment.USER, "root");
        prop.put(Environment.PASS, "Admin@123");
        prop.put(Environment.SHOW_SQL, "true");
        
        
        conf.addAnnotatedClass(Category.class);
        conf.addAnnotatedClass(Product.class);
        conf.addAnnotatedClass(Tag.class);
        conf.addAnnotatedClass(Comment.class);
        conf.addAnnotatedClass(OrderDetail.class);
        conf.addAnnotatedClass(ProdTag.class);
        conf.addAnnotatedClass(SaleOrder.class);
        conf.addAnnotatedClass(User.class);
        
        
        conf.setProperties(prop);
        ServiceRegistry reg = new StandardServiceRegistryBuilder().applySettings(conf.getProperties()).build();
        factory = conf.buildSessionFactory(reg);
    }
    
    public static SessionFactory getFactory(){
        return factory;
    }
}
