package com.bitsnbytes.product.service;

import com.bitsnbytes.product.dto.CategoryDTO;
import com.bitsnbytes.product.mapper.CategoryMapper;
import com.bitsnbytes.product.repository.CategoryRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import com.bitsnbytes.product.entity.Category;
/*
    Here we write business logic
 */
@Service
@AllArgsConstructor
public class CategoryService {

    private CategoryRepository categoryRepository;
    // Create category -> For this we are trying to create method for the values pass by user in CategoryDTO
    public CategoryDTO createCategory(CategoryDTO categoryDTO){ //We will pick this DTO and convert in entity with the help of mapper
                                                                //and then save it in DB
        Category category = CategoryMapper.toCategoryEntity(categoryDTO);
        category = categoryRepository.save(category);

        return (CategoryDTO) CategoryMapper.toCategoryDTO(category);
    }

    // get all categories
    // get category by id
    // delete category
}
