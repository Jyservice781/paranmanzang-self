package com.category.paranmanzang.controller;

import com.category.paranmanzang.model.entity.UserEntity;
import com.category.paranmanzang.model.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.HashMap;
import java.util.Map;

// rest 를 붙이면 스프링 밖에서 처리할 수 있도록 함.
@RestController
@RequiredArgsConstructor
@RequestMapping("users")
public class UserController {
    private final UserRepository userRepository;

    @PostMapping("/join")
    public Object join(@RequestBody UserEntity entity) {

         return userRepository.save(UserEntity.builder()
                .username(entity.getUsername())
                .id(entity.getId())
                .password(entity.getPassword())
                .build());
    }


    @RequestMapping("/authFail")
    public ResponseEntity<Map<String, Object>> authFail() {
        Map<String, Object> resultMap = new HashMap<>();
        resultMap.put("result","fail");

        return ResponseEntity.ok(resultMap);
    }

}
