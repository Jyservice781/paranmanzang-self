package com.category.paranmanzang.service.impl;

import com.category.paranmanzang.model.domain.UserModel;

import com.category.paranmanzang.model.entity.UserEntity;
import com.category.paranmanzang.model.repository.UserRepository;
import com.category.paranmanzang.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {
    private final UserRepository userRepository;

    @Override
    public List<UserEntity> findAll() {
        return userRepository.findAll();
    }

    @Override
    public UserEntity save(UserModel userModel) {
        UserEntity entity = UserEntity.builder().id(userModel.getId()).build();
        return userRepository.save(entity);
    }

    @Override
    public List<UserEntity> findById(Long id) {
        return null;
    }

    @Override
    public long count() {
        return userRepository.count();
    }

    @Override
    public void deleteById(Long id) {
        userRepository.deleteById(id);
    }

    @Override
    public boolean existsById(Long id) {
        return false;
    }
}
