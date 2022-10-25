package com.example.claud_lab.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Setter
@Getter
@NoArgsConstructor

@Table(name = "user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "age")
    private Integer age;

    @Column(name = "birthday")
    private String birthday;

    @Column(name = "email")
    private String email;

    @Column(name = "country_id")
    private Integer countryId;

    @Column(name = "library_id")
    private Integer libraryId;

    public User(Integer id, String firstName, String lastName, Integer age, String birthday, String email, Integer countryId,  Integer libraryId) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.birthday = birthday;
        this.email = email;
        this.countryId = countryId;
        this.libraryId = libraryId;
    }

    public User(String firstName, String lastName, Integer age, String birthday, String email, Integer countryId,  Integer libraryId) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.birthday = birthday;
        this.email = email;
        this.countryId = countryId;
        this.libraryId = libraryId;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", firstName='" + firstName +
                ", lastName='" + lastName +
                ", age=" + age +
                ", birthday='" + birthday +
                ", email='" + email +
                ", countryId=" + countryId +
                ", libraryId=" + libraryId +
                '}';
    }
}