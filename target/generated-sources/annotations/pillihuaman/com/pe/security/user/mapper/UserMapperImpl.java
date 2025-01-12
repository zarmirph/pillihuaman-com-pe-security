package pillihuaman.com.pe.security.user.mapper;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import pillihuaman.com.pe.basebd.user.User;
import pillihuaman.com.pe.lib.response.RespUser;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-01-11T21:16:55-0500",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 17.0.12 (Oracle Corporation)"
)
public class UserMapperImpl implements UserMapper {

    @Override
    public RespUser toRespUser(User user) {
        if ( user == null ) {
            return null;
        }

        RespUser.RespUserBuilder respUser = RespUser.builder();

        respUser.idUser( UserMapper.objectIdToString( user.getId() ) );
        respUser.alias( user.getAlias() );
        respUser.mail( user.getEmail() );
        respUser.userName( user.getUsername() );
        respUser.enabled( user.isEnabled() );
        respUser.mobilPhone( user.getMobilPhone() );

        return respUser.build();
    }

    @Override
    public List<RespUser> usersToRespUsers(List<User> users) {
        if ( users == null ) {
            return null;
        }

        List<RespUser> list = new ArrayList<RespUser>( users.size() );
        for ( User user : users ) {
            list.add( toRespUser( user ) );
        }

        return list;
    }
}
