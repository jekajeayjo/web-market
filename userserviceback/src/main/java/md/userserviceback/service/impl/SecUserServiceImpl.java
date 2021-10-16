package md.userserviceback.service.impl;

import md.userserviceback.dto.SecUserDto;
import md.userserviceback.entity.SecUser;
import md.userserviceback.mapper.SecUserMapper;
import md.userserviceback.repository.SecUserRepository;
import md.userserviceback.service.SecUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SecUserServiceImpl implements SecUserService {
    @Autowired
    private final SecUserRepository secUserRepository;

    private SecUserMapper secUserMapper;

    @Autowired
    public SecUserServiceImpl(SecUserRepository secUserRepository) {
        this.secUserRepository = secUserRepository;

    }

    @Override
    public List<SecUserDto> getSecUserList() {
        List<SecUserDto> secUserDtoList = secUserMapper.mapListFromSecUser(secUserRepository.findAll());
        return secUserDtoList;
    }

    @Override
    public SecUser save(SecUser secUser) {
        return secUserRepository.save(secUser);
    }

    @Override
    public SecUser getOne(Long id) {
        return secUserRepository.getById(id);
    }
}
