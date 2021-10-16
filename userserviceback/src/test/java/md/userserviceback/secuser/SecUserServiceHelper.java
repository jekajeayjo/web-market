package md.userserviceback.secuser;

import md.userserviceback.entity.SecUser;
import md.userserviceback.service.SecUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
@Service
public class SecUserServiceHelper {
    @Autowired
    private SecUserService secUserService;
    public SecUser createSecUser()
    {
        SecUser  secUser=  new SecUser();
        secUser.setFam("fam");
        secUser.setIm("im");
        secUser.setOt("ot");
        secUser.setBirthDate(LocalDateTime.now());
        secUser.setEmail("email");
        secUser.setLogin("login");
        secUser.setPhone("as");
        secUser.setPassword("g");
        return  secUserService.save(secUser);
    }
}