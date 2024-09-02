package com.category.paranmanzang.model.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Builder
@Getter
@Setter
// context 에 대한 미세 조정
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
@Table(name="categories")
public class CategoryEntity {

    // strategy -> 전략 패턴
    // 전략패턴은 enum 울 사용한거다
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long id;
    public String name;

}
