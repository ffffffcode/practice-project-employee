package ex.aaronfae.entity;

public class Employee {
    private Integer eId;

    private String eName;

    private String eGender;

    private String eEmail;

    private String eTel;

    private Integer dId;

    private String dName;

    public Integer geteId() {
        return eId;
    }

    public void seteId(Integer eId) {
        this.eId = eId;
    }

    public String geteName() {
        return eName;
    }

    public void seteName(String eName) {
        this.eName = eName == null ? null : eName.trim();
    }

    public String geteGender() {
        return eGender;
    }

    public void seteGender(String eGender) {
        this.eGender = eGender == null ? null : eGender.trim();
    }

    public String geteEmail() {
        return eEmail;
    }

    public void seteEmail(String eEmail) {
        this.eEmail = eEmail == null ? null : eEmail.trim();
    }

    public String geteTel() {
        return eTel;
    }

    public void seteTel(String eTel) {
        this.eTel = eTel == null ? null : eTel.trim();
    }

    public Integer getdId() {
        return dId;
    }

    public void setdId(Integer dId) {
        this.dId = dId;
    }

    public String getdName() {
        return dName;
    }

    public void setdName(String dName) {
        this.dName = dName == null ? null : dName.trim();
    }
}