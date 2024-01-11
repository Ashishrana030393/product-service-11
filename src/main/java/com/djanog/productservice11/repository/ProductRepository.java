package com.djanog.productservice11.repository;

import com.djanog.productservice11.entity.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductRepository extends MongoRepository<Product, String> {
}
