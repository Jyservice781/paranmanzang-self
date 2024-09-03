package com.category.paranmanzang.controller;

import com.category.paranmanzang.model.repository.ReplyRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@CrossOrigin(origins = "http://localhost:3000/")
@RequestMapping("/api/replies/")
@RequiredArgsConstructor
public class ReplyController {
    private final ReplyRepository replyRepository;

    @GetMapping("selectList/{hotelId}")
    public HashMap<String, Object> showList() {
        HashMap<String, Object> result = new HashMap<>();
        return result;
    }

    @GetMapping("selectOne/{id}")
    public HashMap<String, Object> showOne() {
        HashMap<String, Object> result = new HashMap<>();
        return result;
    }

    @PostMapping("write")
    public ResponseEntity<Map<String, Object>> write() {
        Map<String, Object> resultMap = new HashMap<>();
        return ResponseEntity.ok(resultMap);
    }

    @PostMapping("update")
    public Map<String, Object> update() {
        Map<String, Object> resultMap = new HashMap<>();

        return resultMap;
    }

    @GetMapping("delete/{id}")
    public ResponseEntity<Void> delete() {
        return ResponseEntity.ok().build();
    }
}