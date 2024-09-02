package com.category.paranmanzang.model.domain;

import lombok.Data;
import org.springframework.stereotype.Component;

// categoryModel 로 변환을 때려준다.
@Component
@Data
public class UserModel {
    private Long id;
    private String username;
    private String password;
}
