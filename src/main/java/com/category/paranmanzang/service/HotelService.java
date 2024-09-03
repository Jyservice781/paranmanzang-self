package com.category.paranmanzang.service;

import com.category.paranmanzang.model.domain.HotelModel;
import com.category.paranmanzang.model.entity.HotelEntity;

import java.util.HashMap;
import java.util.List;
import java.util.Optional;

public interface HotelService {
    List<HotelEntity> findAll();
    HotelEntity save(HotelModel hotelModel);
    List<HotelEntity> findById(Long id);
    long count();
    void deleteById(Long id);
    boolean existsById(Long id);

    HashMap<String, Object> write(HotelEntity build);
}
