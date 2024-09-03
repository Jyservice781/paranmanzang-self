package com.category.paranmanzang.controller;

import com.category.paranmanzang.model.domain.BucketModel;
import com.category.paranmanzang.model.entity.BucketEntity;
import com.category.paranmanzang.service.BucketService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin(origins = "http://localhost:3000/")
@RequestMapping("/api/buckets/")
@RequiredArgsConstructor
public class BucketController{
    private final BucketService bucketService;

    @GetMapping("findAll")
    public List<BucketEntity> findAll() {
        return bucketService.findAll();
    }

    @GetMapping("save")
    public BucketEntity save(BucketModel bucketModel) {
        return bucketService.save(bucketModel);
    }

    @GetMapping("findById")
    public List<BucketEntity> findById(Long id) {
        return bucketService.findById(id);
    }

    @GetMapping("count")
    public long count() {
        return bucketService.count();
    }

    @GetMapping("deleteById")
    public void deleteById(Long id) {
        bucketService.deleteById(id);
    }

    @GetMapping("existsById")
    public boolean existsById(Long id) {
        return bucketService.existsById(id);
    }
}
