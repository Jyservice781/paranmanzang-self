package com.category.paranmanzang.service.impl;

import com.category.paranmanzang.model.domain.BucketModel;
import com.category.paranmanzang.model.entity.BucketEntity;
import com.category.paranmanzang.model.repository.BucketRepository;
import com.category.paranmanzang.service.BucketService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
@RequiredArgsConstructor
public class BucketServiceImpl implements BucketService {
    private final BucketRepository bucketRepository;

    @Override
    public List<BucketEntity> findAll() {
        return bucketRepository.findAll();
    }

    @Override
    public BucketEntity save(BucketModel bucketModel) {
        BucketEntity entity = BucketEntity.builder().id(bucketModel.getId()).build();
        return bucketRepository.save(entity);

    }

    @Override
    public List<BucketEntity> findById(Long id) {
        return List.of();
    }


    @Override
    public long count() {
        return bucketRepository.count();
    }

    @Override
    public void deleteById(Long id) {
        bucketRepository.deleteById(id);
    }

    @Override
    public boolean existsById(Long id) {
        return bucketRepository.existsById(id);
    }
}
