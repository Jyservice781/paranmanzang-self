package com.category.paranmanzang.model.domain;

import lombok.Data;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
@Data
public class BucketModel {
    private int id;
    private int customerID;
    private boolean payment;
    private int hotelId;
    private String hotelName;
    private Date startEntry;
    private Date endEntry;
    private Double price;
    private boolean booked;
}
