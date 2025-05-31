package com.ravi.controller;

import com.ravi.entity.Product;
import com.ravi.model.ProductRequest;
import com.ravi.service.ProductService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/app")
public class ProductController {


    @Autowired
    ProductService productService;

    @PostMapping("/addProduct")
    public ResponseEntity<Long>  addProduct(@RequestBody ProductRequest productRequest) {


        log.info("Add product request: {}", productRequest.toString());
        Long productId=productService.addProduct(productRequest);
        return new ResponseEntity<>(productId, HttpStatus.CREATED) ;
    }

}
