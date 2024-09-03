package com.category.paranmanzang.service;

import com.category.paranmanzang.model.domain.ReplyModel;
import com.category.paranmanzang.model.entity.ReplyEntity;

import java.util.List;
import java.util.Optional;

public interface ReplyService {
    List<ReplyEntity> findAll();
    ReplyEntity save(ReplyModel replyModel);
    List<ReplyEntity> findById(Long id);
    long count();
    void deleteById(Long id);
    boolean existsById(Long id);
}
