package com.category.paranmanzang.controller;

import com.category.paranmanzang.model.domain.ReplyModel;
import com.category.paranmanzang.model.entity.ReplyEntity;
import com.category.paranmanzang.model.repository.ReplyRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

@RestController
@CrossOrigin(origins = "http://localhost:3000/")
@RequestMapping("/api/replies/")
@RequiredArgsConstructor
public class ReplyController {
    private final ReplyRepository replyRepository;

    @GetMapping("selectList")
    public ResponseEntity<List<ReplyEntity>> showList() {
        return ResponseEntity.ok(replyRepository.findAll());
    }

    @GetMapping("selectOne")
    public ResponseEntity<?> showOne(Long id) {
        return ResponseEntity.ok(replyRepository.findById(id));
    }

    @PostMapping("write")
    public ResponseEntity<?> write(ReplyModel replyModel) {
        return ResponseEntity.ok(replyRepository.save(ReplyEntity.builder().build()));
    }

    @PutMapping("update")
    public ResponseEntity<?> update(ReplyModel replyModel) {
        return ResponseEntity.ok(replyRepository.save(ReplyEntity.builder().build()));
    }

    @GetMapping("delete")
    public ResponseEntity<Void> delete() {
        return ResponseEntity.ok().build();
    }
}