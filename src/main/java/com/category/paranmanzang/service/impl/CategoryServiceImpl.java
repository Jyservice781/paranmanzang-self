package com.category.paranmanzang.service.impl;

import com.category.paranmanzang.model.domain.CategoryModel;
import com.category.paranmanzang.model.entity.CategoryEntity;
import com.category.paranmanzang.model.repository.CategoryRepository;
import com.category.paranmanzang.service.CategoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

// 팩토리 패턴 new service 를 못하기 때문임
@Service
@RequiredArgsConstructor
public class CategoryServiceImpl implements CategoryService {

    private final CategoryRepository categoryRepository;

    @Override
    public List<CategoryEntity> findAll() {
        return categoryRepository.findAll();
    }

    @Override
    public CategoryEntity save(CategoryModel categoryModel) {
        CategoryEntity entity = CategoryEntity.builder().id(categoryModel.getId()).build();
        return categoryRepository.save(entity);
    }

    @Override
    public List<CategoryEntity> findById(Long id) {
        return List.of();
    }

    @Override
    public long count() {
        return categoryRepository.count();
    }

    @Override
    public void deleteById(Long id) {
        categoryRepository.deleteById(id);
    }

    @Override
    public boolean existsById(Long id) {
        return categoryRepository.existsById(id);


    }
}