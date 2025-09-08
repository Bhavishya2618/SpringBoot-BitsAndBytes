package com.bitsnbytes.product.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter @Setter
@Entity //Entity annotation is used. It will automatically create table with the name of the class
public class Category {

    @Id //Here we are making id variable primary
    @GeneratedValue(strategy = GenerationType.IDENTITY) //making Id variable auto generated
    private  Long id;
    private String name;

    //Here we make relation of Category with Product and it has one-to-many type of relationship
    @OneToMany(mappedBy = "category", cascade = CascadeType.ALL)
    //Here we mapped one-to-many relation with Category and Cascade means if we delete in category
    // the product should also be deleted
    //and CascadeType.ALL means this operation will be applicable to all.
    private List<Product> products = new ArrayList<>();
}
