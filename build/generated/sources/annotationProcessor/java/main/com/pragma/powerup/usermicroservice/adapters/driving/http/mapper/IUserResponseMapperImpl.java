package com.pragma.powerup.usermicroservice.adapters.driving.http.mapper;

import com.pragma.powerup.usermicroservice.adapters.driving.http.dto.response.UserResponseDto;
import com.pragma.powerup.usermicroservice.domain.model.User;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-06-27T11:56:18-0500",
    comments = "version: 1.5.3.Final, compiler: IncrementalProcessingEnvironment from gradle-language-java-7.6.1.jar, environment: Java 18.0.1.1 (Oracle Corporation)"
)
@Component
public class IUserResponseMapperImpl implements IUserResponseMapper {

    @Override
    public UserResponseDto userToPersonResponse(User user) {
        if ( user == null ) {
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

        name = user.getName();
        surname = user.getSurname();
        mail = user.getMail();
        phone = user.getPhone();
        address = user.getAddress();
        idDniType = user.getIdDniType();
        dniNumber = user.getDniNumber();
        idPersonType = user.getIdPersonType();

        UserResponseDto userResponseDto = new UserResponseDto( name, surname, mail, phone, address, idDniType, dniNumber, idPersonType );

        return userResponseDto;
    }

    @Override
    public List<UserResponseDto> userListToPersonResponseList(List<User> userList) {
        if ( userList == null ) {
            return null;
        }

        List<UserResponseDto> list = new ArrayList<UserResponseDto>( userList.size() );
        for ( User user : userList ) {
            list.add( userToPersonResponse( user ) );
        }

        return list;
    }
}
