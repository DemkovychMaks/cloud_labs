package com.example.claud_lab.service;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;

import com.example.claud_lab.domain.Song;
import com.example.claud_lab.repository.SongRepository;

@AllArgsConstructor
@Service
public class SongService extends AbstractService<Song, Integer> {
    public SongRepository songRepository;

    @Override
    protected JpaRepository<Song, Integer> getRepository() {
        return songRepository;
    }
}
