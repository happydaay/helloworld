package newestaccount.domain;

import java.util.Date;
import lombok.Data;
import newestaccount.infra.AbstractEvent;

@Data
public class PreAppliedE extends AbstractEvent {

    private Long id;
    private String realResNo;
    private String custNm;
    private String phoneNo;
    private String appliedStatus;
    
    public String getAppliedStatus() {
        return appliedStatus;
    }
    public void setAppliedStatus(String appliedStatus) {
        this.appliedStatus = appliedStatus;
    }
    private String custNo;

    public String getCustNo() {
        return custNo;
    }
    public void setCustNo(String custNo) {
        this.custNo = custNo;
    }

    
}
