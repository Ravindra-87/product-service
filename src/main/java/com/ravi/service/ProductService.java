package com.ravi.service;

import com.ravi.entity.Product;
import com.ravi.model.ProductRequest;
import org.springframework.stereotype.Service;



public interface ProductService {

 Long addProduct(ProductRequest productRequest);

}
