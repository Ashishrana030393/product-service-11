package com.djanog.productservice11.repository;

import com.djanog.productservice11.entity.ProductTag;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductTagRepository extends MongoRepository<ProductTag, String> {
}
