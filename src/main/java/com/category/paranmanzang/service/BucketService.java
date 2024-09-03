package com.category.paranmanzang.service;

import com.category.paranmanzang.model.domain.BucketModel;
import com.category.paranmanzang.model.entity.BucketEntity;

import java.util.List;
import java.util.Optional;

public interface BucketService {
    List<BucketEntity> findAll();
    BucketEntity save(BucketModel bucketModel);
    List<BucketEntity> findById(Long id);
    long count();
    void deleteById(Long id);
    boolean existsById(Long id);
}
