package com.category.paranmanzang.service;

import com.category.paranmanzang.model.domain.UserModel;
import com.category.paranmanzang.model.entity.UserEntity;

import java.util.List;
import java.util.Map;
import java.util.Optional;

public interface UserService{
    List<UserEntity> findAll();
    UserEntity save(UserModel userModel);
    Optional<UserEntity> findById(Long id);
    long count();
    void deleteById(Long id);
    boolean existsById(Long id);

   // Map<?,?> login(UserModel model);
}
