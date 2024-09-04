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
@Table(name = "reply")
public class ReplyEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String content;
    private Date entryDate;
    private Date modifyDate;
    private int score;
    private String nickname;
    private int roomType;
    private Date startEntry;
    private String name;

    // name = alias alias 는 언더스코어를 줌
    @ManyToOne
    @JoinColumn(name = "hotel_id")
    private HotelEntity hotels;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private UserEntity users;
}
