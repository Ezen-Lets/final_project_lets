package com.vj.lets.domain.room.dto;

import lombok.*;

/**
 * Room dto
 *
 * @author 강소영
 * @version 1.0
 * @since 2023-09-08 (금)
 */
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@ToString
@Builder
public class Room {
    private int id;
    private String name;
    private String description;
    private String imagePath;
    private int headCount;
    private int price;
    private int cafeId;
}
