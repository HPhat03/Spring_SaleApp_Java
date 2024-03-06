/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.hphat03.pojoClass;

import java.io.Serializable;
import java.util.Set;
import javax.persistence.*;
import lombok.Getter;
import lombok.Setter;



/**
 *
 * @author admin
 */
@Entity
@Table(name="category")
@Setter
@Getter
public class Category implements Serializable{

    @Basic(optional = false)
    @Column(name = "name")
    private String name;
    @Column(name = "description")
    private String description;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private int id;

    @OneToMany(mappedBy = "category",fetch = FetchType.LAZY)
    private Set<Product> products;

    public Category() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    
}
