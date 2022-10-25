package com.example.claud_lab.controller;

import com.example.claud_lab.domain.Library;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.claud_lab.DTO.LibraryDTO;

import com.example.claud_lab.mapper.AbstractMapper;
import com.example.claud_lab.mapper.LibraryMapper;

import com.example.claud_lab.service.AbstractService;
import com.example.claud_lab.service.LibraryService;

@RequestMapping(value = "/library")
@RestController
@AllArgsConstructor
public class LibraryController extends AbstractController<Library, LibraryDTO, Integer> {
    private final LibraryService libraryService;
    private final LibraryMapper libraryMapper;

    @Override
    public AbstractService<Library, Integer> getService() {
        return libraryService;
    }

    @Override
    public AbstractMapper<Library, LibraryDTO> getMapper() {
        return libraryMapper;
    }
}
