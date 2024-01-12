package com.djanog.productservice11.dto;

import java.util.List;

public class ProductDto {
    private String name;
    private String description;
    private CategoryDto category;
    private List<ProductTagDto> tags;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public CategoryDto getCategory() {
        return category;
    }

    public void setCategory(CategoryDto category) {
        this.category = category;
    }

    public List<ProductTagDto> getTags() {
        return tags;
    }

    public void setTags(List<ProductTagDto> tags) {
        this.tags = tags;
    }
}
