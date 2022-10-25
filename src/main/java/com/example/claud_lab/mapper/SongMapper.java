package com.example.claud_lab.mapper;

import com.example.claud_lab.domain.Song;
import com.example.claud_lab.DTO.SongDTO;
import org.springframework.stereotype.Component;

@Component
public class SongMapper extends AbstractMapper<Song, SongDTO> {
    @Override
    public SongDTO mapObjectToDto (Song song) {
        if (song == null) return null;

        SongDTO.SongDTOBuilder songDTOBuilder = SongDTO.builder();
        songDTOBuilder.id(song.getId());
        songDTOBuilder.title(song.getTitle());
        songDTOBuilder.amountOfLikes(song.getAmountOfLikes());
        songDTOBuilder.amountOfDownloads(song.getAmountOfDownloads());
        songDTOBuilder.streams(song.getStreams());
        songDTOBuilder.singerId(song.getSingerId());
        return songDTOBuilder.build();
    }
}