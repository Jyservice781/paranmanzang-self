package com.category.paranmanzang.controller;
import com.category.paranmanzang.model.domain.CategoryModel;
import com.category.paranmanzang.model.entity.CategoryEntity;
import com.category.paranmanzang.service.CategoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/categories/")
@CrossOrigin(origins = "http://localhost:3000/")
@RequiredArgsConstructor
// 자연어로 연결해줌 -> 인덱스로 연결(indexing)
public class CategoryController {
    //  반드시 하나만 사용 하면 됨
    private final CategoryService categoryService;

    // findAll, findById는 검색능력이 훨씬 빠름
    // 내부 쿼리는 전부 하나의 테이블만 헨들링 한다.
    // 테이블을 여러개 핸들링 해야한다.
    @GetMapping("findAll")
    public List<CategoryModel> findAll() {
        return List.of();
    }

    @PostMapping("save")
    public CategoryEntity save(CategoryModel id) {
        return null;
    }

    @GetMapping("findById")
    public Optional<CategoryEntity> findById(CategoryModel id) {
        return Optional.empty();
    }

    @GetMapping("count")
    public long count() {
        return 0;
    }

    @GetMapping("deleteById")
    public void deleteById(CategoryModel id) {

    }

    @GetMapping("existsById")
    public boolean existsById(Long id) {
        return false;
    }

}