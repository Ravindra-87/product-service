package com.ravi.service;

import com.ravi.entity.Product;
import com.ravi.model.ProductRequest;
import com.ravi.repository.ProductRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
public class ProductServiceImpl implements  ProductService{

    @Autowired
    ProductRepository productRepository;


    @Override
    public Long addProduct(ProductRequest productRequest) {

        Product product = new Product();
        product.setProductName(productRequest.getProductName());
        product.setPrice(productRequest.getProductPrice());

        productRepository.save(product);

        return product.getProductId();
    }

    @Override
    public Product fecthProduct(Long productId) {


        Product product=productRepository.getProductByProductId(productId).get(0);
        return product;
    }

    @Override
    public List<Product> getProducts() {

        return productRepository.findAll();
    }
}
