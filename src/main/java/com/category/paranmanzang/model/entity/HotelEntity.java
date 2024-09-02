package com.category.paranmanzang.model.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Getter
@Setter
@Builder
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
@Table(name = "hotels")
public class HotelEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long id;
    public String name;

    // oneToMany 는 인스턴스 이름이어야 함.
    // 단수 이름이어야 함
    @OneToMany
    private List<ReplyEntity> reviews;

    @OneToMany
    private List<BucketEntity> buckets;
}
