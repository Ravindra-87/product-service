package com.ravi.controller;

import com.ravi.entity.Product;
import com.ravi.model.ProductRequest;
import com.ravi.service.ProductService;
import jakarta.websocket.server.PathParam;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

@Slf4j
@RestController
@RequestMapping("/products")
public class ProductController {


    @Autowired
    ProductService productService;

    @PostMapping("/addProduct")
    public ResponseEntity<Long>  addProduct(@RequestBody ProductRequest productRequest) {


        log.info("Add product request: {}", productRequest.toString());
        Long productId=productService.addProduct(productRequest);
        return new ResponseEntity<>(productId, HttpStatus.CREATED) ;
    }

    @GetMapping("/fetchProduct/{productId}")
    public ResponseEntity<Product>  fetchProduct(@PathVariable Long productId) {

        log.info("Fetch product request: {}",productId);
        Product product=productService.fecthProduct(productId);
        return new ResponseEntity<>(product, HttpStatus.CREATED) ;
    }

    @GetMapping("/fetchAll")
    public ResponseEntity<List<Product>>  fetchAllProducts() {

        log.info("fetch All Products{}");

        return Optional.ofNullable(productService.getProducts())
                .map(products -> new ResponseEntity<>(products, HttpStatus.CREATED))
                .orElseGet(() -> new ResponseEntity<>(Collections.emptyList(), HttpStatus.NO_CONTENT));
    }
}
