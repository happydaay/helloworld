package newestaccount.domain;

import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;

@Entity
@Table(name = "AppliedResultR_table")
@Data
public class AppliedResultR {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String custNo;
    private String appliedStatus;
    
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getCustNo() {
        return custNo;
    }
    public void setCustNo(String custNo) {
        this.custNo = custNo;
    }
    public String getAppliedStatus() {
        return appliedStatus;
    }
    public void setAppliedStatus(String appliedStatus) {
        this.appliedStatus = appliedStatus;
    }
    
}
