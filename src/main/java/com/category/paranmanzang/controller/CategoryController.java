package com.category.paranmanzang.controller;
import com.category.paranmanzang.model.domain.CategoryModel;
import com.category.paranmanzang.model.entity.CategoryEntity;
import com.category.paranmanzang.service.CategoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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
    public ResponseEntity<List<CategoryEntity>> findAll() {
        return ResponseEntity.ok(categoryService.findAll());
    }

    @PostMapping("save")
    public ResponseEntity<?> save(CategoryModel id) {
        return ResponseEntity.ok(categoryService.save(id));
    }

    @GetMapping("findById")
    public List<CategoryEntity> findById(CategoryModel id) {
        return List.of();
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