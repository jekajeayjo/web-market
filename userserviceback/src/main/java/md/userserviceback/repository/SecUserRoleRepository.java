package md.userserviceback.repository;

import md.userserviceback.entity.SecUserRole;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SecUserRoleRepository extends JpaRepository<SecUserRole, Long> {
}