package com.ravi.service;

import com.ravi.entity.Product;
import com.ravi.model.ProductRequest;
import org.springframework.stereotype.Service;

import java.util.List;


public interface ProductService {

 Long addProduct(ProductRequest productRequest);

 Product fecthProduct(Long productId);

 List<Product> getProducts();

}
