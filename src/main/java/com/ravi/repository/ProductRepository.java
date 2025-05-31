package com.ravi.repository;

import com.ravi.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long>{


    @Override
    <S extends Product> S save(S entity);
}
