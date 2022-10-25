package com.example.claud_lab.mapper;

public abstract class  AbstractMapper<T, DTO> {
     public abstract DTO mapObjectToDto(T object);
}
