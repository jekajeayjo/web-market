package md.userserviceback.entity.embedable;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Transient;

@Embeddable
public class EmbdedVal {
    @Column(name = "VAL_RU")
    private String ruVal;
    @Transient
    private String val;

    public String getRuVal() {
        return ruVal;
    }

    public void setRuVal(String ruVal) {
        this.ruVal = ruVal;
    }

    public String getVal() {
        return val;
    }

    public void setVal(String val) {
        this.val = val;
    }
}
