package md.userserviceback.service;

import md.userserviceback.dto.SecUserDto;
import md.userserviceback.entity.SecUser;

import java.util.List;

public interface SecUserService {
    List<SecUserDto> getSecUserList();

    SecUser save(SecUser secUser);

    SecUser getOne(Long id);
}
