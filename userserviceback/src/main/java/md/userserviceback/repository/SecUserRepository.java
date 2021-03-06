package md.userserviceback.repository;

import md.userserviceback.entity.SecUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface SecUserRepository  extends JpaRepository<SecUser,Long>, JpaSpecificationExecutor<SecUser> {
}
