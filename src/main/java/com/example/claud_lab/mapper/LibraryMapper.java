package com.example.claud_lab.mapper;

import com.example.claud_lab.DTO.LibraryDTO;
import com.example.claud_lab.domain.Library;
import org.springframework.stereotype.Component;

@Component
public class LibraryMapper extends AbstractMapper<Library, LibraryDTO> {
    @Override
    public LibraryDTO mapObjectToDto (Library library) {
        if (library == null) return null;

        LibraryDTO.LibraryDTOBuilder libraryDTOBuilder = LibraryDTO.builder();
        libraryDTOBuilder.id(library.getId());
        libraryDTOBuilder.amountOfDownloadedSongs(library.getAmountOfDownloadedSongs());
        libraryDTOBuilder.amountOfLikedSongs(library.getAmountOfLikedSongs());
        libraryDTOBuilder.amountOfDownloadedAlbums(library.getAmountOfDownloadedAlbums());
        libraryDTOBuilder.amountOfLikedAlbums(library.getAmountOfLikedAlbums());
        libraryDTOBuilder.amountOfSubscribedSingers(library.getAmountOfSubscribedSingers());
        return libraryDTOBuilder.build();
    }
}