package md.userserviceback.mapper;

import md.userserviceback.dto.SecUserDto;
import md.userserviceback.entity.SecUser;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface SecUserMapper {
    SecUserDto map (SecUser secUser);
    SecUser map (SecUserDto secUserDto);
    List<SecUserDto> mapListFromSecUser(List<SecUser> secUserList);
}
