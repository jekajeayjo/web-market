package md.userserviceback.entity;
import md.userserviceback.entity.embedable.EmbdedVal;
import md.userserviceback.entity.embedable.EmbedDesc;

import javax.persistence.*;

@Entity
@Table(name = "ROLE")
public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    @Embedded
    private EmbdedVal embdedVal;
    @Embedded
    private EmbedDesc embedDesc;
    @Column
    @Enumerated(EnumType.STRING)
    private RoleEnum code;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public EmbdedVal getEmbdedVal() {
        return embdedVal;
    }

    public void setEmbdedVal(EmbdedVal embdedVal) {
        this.embdedVal = embdedVal;
    }

    public EmbedDesc getEmbedDesc() {
        return embedDesc;
    }

    public void setEmbedDesc(EmbedDesc embedDesc) {
        this.embedDesc = embedDesc;
    }

    public RoleEnum getCode() {
        return code;
    }

    public void setCode(RoleEnum code) {
        this.code = code;
    }
}
