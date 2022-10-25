package com.example.claud_lab.DTO;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor

public class SingerDTO {
    private Integer id;
    private String name;
    private Integer age;
    private Integer countryId;
}
