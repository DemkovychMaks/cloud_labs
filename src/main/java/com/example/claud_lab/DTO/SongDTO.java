package com.example.claud_lab.DTO;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor

public class SongDTO {
    private Integer id;
    private String title;
    private Integer amountOfLikes;
    private Integer amountOfDownloads;
    private Integer streams;
    private Integer singerId;
}
