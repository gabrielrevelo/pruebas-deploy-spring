package com.pragma.powerup.usermicroservice.adapters.driving.http.mapper;

import com.pragma.powerup.usermicroservice.adapters.driving.http.dto.request.UserRequestDto;
import com.pragma.powerup.usermicroservice.domain.model.User;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-06-27T11:56:18-0500",
    comments = "version: 1.5.3.Final, compiler: IncrementalProcessingEnvironment from gradle-language-java-7.6.1.jar, environment: Java 18.0.1.1 (Oracle Corporation)"
)
@Component
public class IUserRequestMapperImpl implements IUserRequestMapper {

    @Override
    public User toUser(UserRequestDto personRequestDto) {
        if ( personRequestDto == null ) {
            return null;
        }

        String name = null;
        String surname = null;
        String mail = null;
        String phone = null;
        String address = null;
        String idDniType = null;
        String dniNumber = null;
        String idPersonType = null;
        String password = null;

        name = personRequestDto.getName();
        surname = personRequestDto.getSurname();
        mail = personRequestDto.getMail();
        phone = personRequestDto.getPhone();
        address = personRequestDto.getAddress();
        idDniType = personRequestDto.getIdDniType();
        dniNumber = personRequestDto.getDniNumber();
        idPersonType = personRequestDto.getIdPersonType();
        password = personRequestDto.getPassword();

        Long id = null;

        User user = new User( id, name, surname, mail, phone, address, idDniType, dniNumber, idPersonType, password );

        return user;
    }
}
