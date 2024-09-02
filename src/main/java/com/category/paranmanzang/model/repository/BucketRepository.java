package com.category.paranmanzang.model.repository;

import com.category.paranmanzang.model.entity.BucketEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BucketRepository extends JpaRepository<BucketEntity, Long> {

}
