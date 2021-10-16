package md.userserviceback.entity;



import javax.persistence.*;
import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;


@Entity
@Table(name = "SEC_USER")
public class SecUser {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "GEN")
    @SequenceGenerator(name = "GEN", sequenceName = "SEQ_H", allocationSize = 1)
    private Long id;
    @Column(name = "FAM")
    private String fam;
    @Column(name = "IM")
    private String im;
    @Column(name = "OT")
    private String ot;
    @Column(name = "BIRTH_DATE")
    private LocalDateTime birthDate;
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "secUser", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<SecUserRole> secUserRoles;
    @Column(name = "EMAIL")
    private String email;
    @Column(name = "LOGIN")
    private String login;
    @Column(name = "PASSWORD")
    private String password;
    @Column(name = "PHONE")
    private String phone;




    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFam() {
        return fam;
    }

    public void setFam(String fam) {
        this.fam = fam;
    }

    public String getIm() {
        return im;
    }

    public void setIm(String im) {
        this.im = im;
    }

    public String getOt() {
        return ot;
    }

    public void setOt(String ot) {
        this.ot = ot;
    }

    public LocalDateTime getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDateTime birthDate) {
        this.birthDate = birthDate;
    }

    public List<SecUserRole> getUserRoles() {
        return secUserRoles;
    }

    public void setUserRoles(List<SecUserRole> secUserRoles) {
        this.secUserRoles = secUserRoles;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
