package com.barath.ecom.Repo;

import com.barath.ecom.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface ProductRepo extends JpaRepository<Product,Integer> {

    @Query("SELECT p FROM Product p WHERE " +
            "LOWER(p.name) LIKE LOWER(CONCAT('%',:keyword,'%')) OR "+
            "LOWER(p.brand) LIKE LOWER(CONCAT('%',:keyword,'%')) OR "+
            "LOWER(p.desc) LIKE LOWER(CONCAT('%',:keyword,'%')) ")
    List<Product> searchProducts(String keyword);
}
