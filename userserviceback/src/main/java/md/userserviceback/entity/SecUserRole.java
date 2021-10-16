package md.userserviceback.entity;

import javax.persistence.*;

@Entity
@Table(name = "USER_ROLE_MAPPING")
public class SecUserRole {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "GEN")
    @SequenceGenerator(name = "GEN",sequenceName = "SEQ_H",allocationSize = 1)

    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "FK_USER_ID")
    private SecUser secUser;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ROLE_FK")
    private Role role;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public SecUser getSecUser() {
        return secUser;
    }

    public void setSecUser(SecUser secUser) {
        this.secUser = secUser;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }
}
