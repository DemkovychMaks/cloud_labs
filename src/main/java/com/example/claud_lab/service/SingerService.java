package com.example.claud_lab.service;

import com.example.claud_lab.repository.SingerRepository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;

import com.example.claud_lab.domain.Singer;

@AllArgsConstructor
@Service
public class SingerService extends AbstractService<Singer, Integer> {
    public SingerRepository singerRepository;

    @Override
    protected JpaRepository<Singer, Integer> getRepository() {
        return singerRepository;
    }
}