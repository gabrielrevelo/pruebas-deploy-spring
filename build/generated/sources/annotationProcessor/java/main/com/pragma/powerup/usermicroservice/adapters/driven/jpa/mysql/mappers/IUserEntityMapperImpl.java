package com.pragma.powerup.usermicroservice.adapters.driven.jpa.mysql.mappers;

import com.pragma.powerup.usermicroservice.adapters.driven.jpa.mysql.entity.UserEntity;
import com.pragma.powerup.usermicroservice.domain.model.User;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-06-27T11:56:18-0500",
    comments = "version: 1.5.3.Final, compiler: IncrementalProcessingEnvironment from gradle-language-java-7.6.1.jar, environment: Java 18.0.1.1 (Oracle Corporation)"
)
@Component
public class IUserEntityMapperImpl implements IUserEntityMapper {

    @Override
    public UserEntity toEntity(User user) {
        if ( user == null ) {
            return null;
        }

        UserEntity userEntity = new UserEntity();

        userEntity.setId( user.getId() );
        userEntity.setName( user.getName() );
        userEntity.setSurname( user.getSurname() );
        userEntity.setMail( user.getMail() );
        userEntity.setPhone( user.getPhone() );
        userEntity.setAddress( user.getAddress() );
        userEntity.setIdDniType( user.getIdDniType() );
        userEntity.setDniNumber( user.getDniNumber() );
        userEntity.setIdPersonType( user.getIdPersonType() );
        userEntity.setPassword( user.getPassword() );

        return userEntity;
    }
}
