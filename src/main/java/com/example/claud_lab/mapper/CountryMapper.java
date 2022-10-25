package com.example.claud_lab.mapper;

import com.example.claud_lab.DTO.CountryDTO;
import com.example.claud_lab.domain.Country;
import org.springframework.stereotype.Component;

@Component
public class CountryMapper extends AbstractMapper<Country, CountryDTO> {
    @Override
    public CountryDTO mapObjectToDto (Country country) {
        if (country == null) return null;

        CountryDTO.CountryDTOBuilder countryDTOBuilder = CountryDTO.builder();
        countryDTOBuilder.id(country.getId());
        countryDTOBuilder.name(country.getName());
        countryDTOBuilder.population(country.getPopulation());
        return countryDTOBuilder.build();
    }
}