/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.hphat03.hibernatetest;

import com.hphat03.pojoClass.Category;
import com.hphat03.pojoClass.Product;
import java.util.List;
import javax.persistence.Query;
import org.hibernate.Session;

/**
 *
 * @author admin
 */
public class HibernateTest {

    //Nhớ xóa cột trống trong tag, null record trong Product (activ = NULL)
    public static void main(String[] args) {
        System.out.println("Hello World!");
        try (Session s = HibernateUtils.getFactory().openSession()){
            Query q = s.createQuery("FROM Product");
            List<Product> l = q.getResultList();
            l.forEach(i -> System.out.printf("%s - %d - %s\n",i.getName(), i.getPrice(), i.getCategory().getName()));
            System.out.println("================================================");
            Category c = s.get(Category.class, 1);
            c.getProducts().forEach(x -> System.out.println(x.getName()));
            s.close();
        };
                
    }
}
