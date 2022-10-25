package com.example.claud_lab.controller;


import com.example.claud_lab.domain.Song;
import com.example.claud_lab.mapper.SongMapper;
import com.example.claud_lab.service.AbstractService;
import com.example.claud_lab.service.SongService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.claud_lab.DTO.SongDTO;

import com.example.claud_lab.mapper.AbstractMapper;


@RequestMapping(value = "/song")
@RestController
@AllArgsConstructor
public class SongController extends AbstractController<Song, SongDTO, Integer> {
    private final SongService songService;
    private final SongMapper songMapper;

    @Override
    public AbstractService<Song, Integer> getService() {
        return songService;
    }

    @Override
    public AbstractMapper<Song, SongDTO> getMapper() {
        return songMapper;
    }
}
