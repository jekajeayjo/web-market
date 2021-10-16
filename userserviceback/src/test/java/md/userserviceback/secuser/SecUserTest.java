package md.userserviceback.secuser;
import md.userserviceback.entity.SecUser;
import md.userserviceback.service.SecUserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.TestPropertySource;
import org.springframework.transaction.annotation.Transactional;
@SpringBootTest
@Transactional
@Rollback(true)
//@ActiveProfiles("test")
@TestPropertySource(properties = {
        "spring.mvc.locale = md",
        "spring.mvc.locale-resolver = fixed",
})
public class SecUserTest {
    @Autowired
    private SecUserServiceHelper  secUserServiceHelper;

    @Autowired
    private SecUserService secUserService;
    @Test
    public void createSecUser()
    {
        SecUser secUser=secUserServiceHelper.createSecUser();
        System.out.println();
    }
    @Test
    public void getExistSecUser()
    {
        SecUser secUser=secUserService.getOne(1L);
        System.out.println(secUser.getFam());
    }
}