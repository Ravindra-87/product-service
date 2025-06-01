package com.ravi.repository;

import com.ravi.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long>{


    @Override
    <S extends Product> S save(S entity);

    List<Product> getProductByProductId(Long productId);
}
