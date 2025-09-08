package com.bitsnbytes.product.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController //This annotation is used for REST API
@RequestMapping("/api/products") // This annotation is used for request mapping. On which URL this
                                    // controller will be called
public class ProductController {
    /*
    -> In this controller we will make
    -> getProduct
    -> createProduct
    -> update product
    -> get product by  id
    -> delete product
     */
}
