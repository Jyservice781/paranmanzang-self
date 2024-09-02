package com.category.paranmanzang.model.domain;

import lombok.Builder;
import lombok.Data;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
@Data
public class ReplyModel {
    private Long id;
    private int customerId;
    private int hotelId;
    private String title;
    private String content;
    private Date entryDate;
    private Date modifyDate;
    private int score;

    private String nickname;
    private int roomType;
    private Date startEntry;
    private String name;
}
