package com.example.claud_lab.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Setter
@Getter
@NoArgsConstructor

@Table(name = "singer")
public class Singer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "name")
    private String name;

    @Column(name = "age")
    private Integer age;

    @Column(name = "country_id")
    private Integer countryId;

    public Singer(int id, String name, Integer age, Integer countryId) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.countryId = countryId;
    }

    public Singer(String name, Integer age, Integer countryId) {
        this.name = name;
        this.age = age;
        this.countryId = countryId;
    }

    @Override
    public String toString() {
        return "Artist{" +
                "id=" + id +
                ", name='" + name +
                ", age=" + age +
                ", countryId=" + countryId +
                '}';
    }
}