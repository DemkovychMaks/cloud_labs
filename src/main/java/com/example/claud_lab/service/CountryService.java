package com.example.claud_lab.service;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;

import com.example.claud_lab.domain.Country;
import com.example.claud_lab.repository.CountryRepository;

@AllArgsConstructor
@Service
public class CountryService extends AbstractService<Country, Integer> {
    public CountryRepository countryRepository;

    @Override
    protected JpaRepository<Country, Integer> getRepository() {
        return countryRepository;
    }
}