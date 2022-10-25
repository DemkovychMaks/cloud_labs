package com.example.claud_lab.controller;

import com.example.claud_lab.DTO.CountryDTO;
import com.example.claud_lab.domain.Country;
import com.example.claud_lab.service.AbstractService;
import com.example.claud_lab.service.CountryService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.claud_lab.mapper.AbstractMapper;
import com.example.claud_lab.mapper.CountryMapper;

@RequestMapping(value = "/country")
@RestController
@AllArgsConstructor
public class CountryController extends AbstractController<Country, CountryDTO, Integer> {
    private final CountryService countryService;
    private final CountryMapper countryMapper;

    @Override
    public AbstractService<Country, Integer> getService() {
        return countryService;
    }

    @Override
    public AbstractMapper<Country, CountryDTO> getMapper() {
        return countryMapper;
    }
}
