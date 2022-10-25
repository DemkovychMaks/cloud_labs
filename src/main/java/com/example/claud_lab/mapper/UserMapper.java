package com.example.claud_lab.mapper;

import com.example.claud_lab.DTO.UserDTO;
import com.example.claud_lab.domain.User;
import org.springframework.stereotype.Component;

@Component
public class UserMapper extends AbstractMapper<User, UserDTO> {
    @Override
    public UserDTO mapObjectToDto (User user) {
        if (user == null) return null;

        UserDTO.UserDTOBuilder userDTOBuilder = UserDTO.builder();
        userDTOBuilder.id(user.getId());
        userDTOBuilder.firstName(user.getFirstName());
        userDTOBuilder.lastName(user.getLastName());
        userDTOBuilder.age(user.getAge());
        userDTOBuilder.birthday(user.getBirthday());
        userDTOBuilder.email(user.getEmail());
        userDTOBuilder.countryId(user.getCountryId());
        userDTOBuilder.libraryId(user.getLibraryId());
        return userDTOBuilder.build();
    }
}