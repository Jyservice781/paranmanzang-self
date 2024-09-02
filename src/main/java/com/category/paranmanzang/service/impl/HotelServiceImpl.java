package com.category.paranmanzang.service.impl;

import com.category.paranmanzang.model.domain.HotelModel;
import com.category.paranmanzang.model.entity.HotelEntity;
import com.category.paranmanzang.model.repository.HotelRepository;
import com.category.paranmanzang.service.HotelService;
import lombok.Builder;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class HotelServiceImpl implements HotelService {
    private final HotelRepository hotelRepository;

    @Override
    public List<HotelEntity> findAll() {
        return hotelRepository.findAll();
    }

    @Override
    public HotelEntity save(HotelModel hotelModel) {
        HotelEntity hotelEntity = HotelEntity.builder().id(hotelModel.getId()).build();
        return hotelRepository.save(hotelEntity);
    }

    @Override
    public Optional<HotelEntity> findById(Long id) {
        return hotelRepository.findById(id);
    }

    @Override
    public long count() {
        return hotelRepository.count();
    }

    @Override
    public void deleteById(Long id) {
        hotelRepository.deleteById(id);

    }

    @Override
    public boolean existsById(Long id) {
        return hotelRepository.existsById(id);
    }

    @Override
    public HashMap<String, Object> write(HotelEntity build) {
        return null;
    }
}
