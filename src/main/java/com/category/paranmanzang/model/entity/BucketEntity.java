package com.category.paranmanzang.model.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.Date;

@Entity
@Getter
@Setter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
@Builder
@Table(name="buckets")
public class BucketEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
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
