package com.category.paranmanzang.service.impl;

import com.category.paranmanzang.model.domain.UserModel;
import com.category.paranmanzang.model.entity.CategoryEntity;
import com.category.paranmanzang.model.entity.UserEntity;
import com.category.paranmanzang.model.repository.UserRepository;
import com.category.paranmanzang.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.Optional;

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
    public Optional<UserEntity> findById(Long id) {
        return Optional.empty();
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

  /*  @Override
    public Map<?, ?> login(UserModel model) {
        Map<?,?> map = userRepository.login(model);
        return map;
    }*/
}
