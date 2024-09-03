package com.category.paranmanzang.controller;

import com.category.paranmanzang.model.entity.HotelEntity;
import  com.category.paranmanzang.service.HotelService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@CrossOrigin
@RequestMapping("/api/hotels/")
@RequiredArgsConstructor
public class HotelController {

    private final HotelService hotelService;

    @PostMapping("uploads")
    public Map<String, Object> uploadFiles() {
        Map<String, Object> resultMap = new HashMap<>();
        return resultMap;
    }

    @PostMapping("write")
    public HashMap<String, Object> write(HotelEntity hotelEntity) {
        return hotelService.write(HotelEntity.builder()
                .id(hotelEntity.getId())
                .name(hotelEntity.getName())
                .build());
    }

    @PostMapping("update")
    public HashMap<String, Object> update() {
        HashMap<String, Object> resultMap = new HashMap<>();
        return resultMap;
    }

    @DeleteMapping("delete/{id}")
    public ResponseEntity<Void> deleteHotel(Long id) {
        hotelService.deleteById(id);
        return ResponseEntity.ok().build();
    }
}
