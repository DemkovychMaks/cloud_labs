package com.example.claud_lab.service;

import com.example.claud_lab.domain.Library;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;

import com.example.claud_lab.repository.LibraryRepository;

@AllArgsConstructor
@Service
public class LibraryService extends AbstractService<Library, Integer> {
    public LibraryRepository libraryRepository;

    @Override
    protected JpaRepository<Library, Integer> getRepository() {
        return libraryRepository;
    }
}