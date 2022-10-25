package com.example.claud_lab.DTO;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor

public class LibraryDTO {
    private Integer id;
    private Integer amountOfDownloadedSongs;
    private Integer amountOfLikedSongs;
    private Integer amountOfDownloadedAlbums;
    private Integer amountOfLikedAlbums;
    private Integer amountOfSubscribedSingers;
}
