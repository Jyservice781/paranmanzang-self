package com.category.paranmanzang.model.repository;

import com.category.paranmanzang.model.entity.ReplyEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReplyRepository extends JpaRepository<ReplyEntity, Long> {
}
