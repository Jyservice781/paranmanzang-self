package com.category.paranmanzang.service.impl;

import com.category.paranmanzang.model.domain.ReplyModel;
import com.category.paranmanzang.model.entity.ReplyEntity;
import com.category.paranmanzang.model.repository.ReplyRepository;
import com.category.paranmanzang.service.ReplyService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ReplyServiceImpl implements ReplyService {
    private final ReplyRepository replyRepository;

    @Override
    public List<ReplyEntity> findAll() {
        return replyRepository.findAll();
    }

    @Override
    public ReplyEntity save(ReplyModel replyModel) {
        ReplyEntity entity = ReplyEntity.builder().id(replyModel.getId()).build();
        return replyRepository.save(entity);
    }

    @Override
    public List<ReplyEntity> findById(Long id) {
        return List.of();
    }


    @Override
    public long count() {
        return replyRepository.count();
    }

    @Override
    public void deleteById(Long id) {
        replyRepository.deleteById(id);
    }

    @Override
    public boolean existsById(Long id) {
        return false;
    }
}
