package com.example.claud_lab.controller;

import com.example.claud_lab.DTO.SingerDTO;
import com.example.claud_lab.domain.Singer;
import com.example.claud_lab.mapper.SingerMapper;

import com.example.claud_lab.service.AbstractService;
import com.example.claud_lab.service.SingerService;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.claud_lab.mapper.AbstractMapper;

@RequestMapping(value = "/singer")
@RestController
@AllArgsConstructor
public class SingerController extends AbstractController<Singer, SingerDTO, Integer> {
    private final SingerService singerService;
    private final SingerMapper singerMapper;

    @Override
    public AbstractService<Singer, Integer> getService() {
        return singerService;
    }

    @Override
    public AbstractMapper<Singer, SingerDTO> getMapper() {
        return singerMapper;
    }
}
