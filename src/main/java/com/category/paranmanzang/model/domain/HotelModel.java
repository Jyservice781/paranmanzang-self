package com.category.paranmanzang.model.domain;

import lombok.Builder;
import lombok.Data;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
@Data
public class HotelModel {
    public Long id;
    public String name;
    public String address;
    public Date startEntry;
    public Date endEntry;
    public boolean booked;
    public double price;
    public int sellerId;
    public String content;
    public String shortContent;
    public int roomNumber;
    public int roomType;
    public int roomMember;
    public String nickname;

}
