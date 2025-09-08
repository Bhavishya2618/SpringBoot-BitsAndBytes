package com.bitsnbytes.product.entity;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity //Entity annotation is used. It will automatically create table with the name of the class
@Getter @Setter //To create getter and setter for below variable by annotation
public class Product {

    @Id //Here we are making id variable primary
    @GeneratedValue(strategy = GenerationType.IDENTITY) //making Id variable auto generated
    private Long id;
    private String name;
    private String description;
    private Double price;

    //A product has one or more category so we first create A category Entity and make relation to Category
    @ManyToOne //Here we define the relation of Product to Category
                //A Category may have more the one product and has single category
                // so the relation type should be -> Many-To-One

    @JoinColumn(name = "category_id",nullable = false) //Iss table mein jo column name hoga uska category_id isme store ho jaiyega
                                      // aur usse hm join kar diye
                                      // Also adding condition of false with nullable = false
    private Category category;
}
