package com.category.paranmanzang.service;

import com.category.paranmanzang.model.domain.CategoryModel;
import com.category.paranmanzang.model.entity.CategoryEntity;

import java.util.List;
import java.util.Optional;

public interface CategoryService{

    List<CategoryEntity> findAll();
    CategoryEntity save(CategoryModel categoryModel);
    List<CategoryEntity> findById(Long id);
    long count();
    void deleteById(Long id);
    boolean existsById(Long id);
}
