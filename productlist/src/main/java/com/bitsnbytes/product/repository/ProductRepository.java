package com.bitsnbytes.product.repository;

import com.bitsnbytes.product.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/* NOTES :
Repository mein database se jo entity hai usko hm connect krte hain
Aur iske liye hm JPA repository use krenge
 */
@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {

}
