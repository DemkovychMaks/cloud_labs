package com.example.claud_lab.mapper;

import com.example.claud_lab.DTO.SingerDTO;
import com.example.claud_lab.domain.Singer;
import org.springframework.stereotype.Component;

@Component
public class SingerMapper extends AbstractMapper<Singer, SingerDTO> {
    @Override
    public SingerDTO mapObjectToDto (Singer singer) {
        if (singer == null) return null;

        SingerDTO.SingerDTOBuilder singerDTOBuilder = SingerDTO.builder();
        singerDTOBuilder.id(singer.getId());
        singerDTOBuilder.name(singer.getName());
        singerDTOBuilder.age(singer.getAge());
        singerDTOBuilder.countryId(singer.getCountryId());
        return singerDTOBuilder.build();
    }
}