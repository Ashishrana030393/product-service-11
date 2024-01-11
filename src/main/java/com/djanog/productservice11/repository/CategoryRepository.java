package com.djanog.productservice11.repository;

import com.djanog.productservice11.entity.Category;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CategoryRepository extends MongoRepository<Category, String> {
}
