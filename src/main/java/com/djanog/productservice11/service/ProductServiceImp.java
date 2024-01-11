package com.djanog.productservice11.service;

import com.djanog.productservice11.repository.ProductRepository;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceImp implements ProductService{

    private final ProductRepository productRepository;

    public ProductServiceImp(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public void createProduct(){

    }
}
