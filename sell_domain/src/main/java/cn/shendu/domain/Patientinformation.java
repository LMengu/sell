package cn.shendu.domain;

public class Patientinformation {
    private Integer id;
    private String patientname;
    private String patientsex;
    private Integer patientage;
    private String patientcontactinformation;
    private String patientillness;
    private String buymedinformation;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPatientname() {
        return patientname;
    }

    public void setPatientname(String patientname) {
        this.patientname = patientname;
    }

    public String getPatientsex() {
        return patientsex;
    }

    public void setPatientsex(String patientsex) {
        this.patientsex = patientsex;
    }

    public Integer getPatientage() {
        return patientage;
    }

    public void setPatientage(Integer patientage) {
        this.patientage = patientage;
    }

    public String getPatientcontactinformation() {
        return patientcontactinformation;
    }

    public void setPatientcontactinformation(String patientcontactinformation) {
        this.patientcontactinformation = patientcontactinformation;
    }

    public String getPatientillness() {
        return patientillness;
    }

    public void setPatientillness(String patientillness) {
        this.patientillness = patientillness;
    }

    public String getBuymedinformation() {
        return buymedinformation;
    }

    public void setBuymedinformation(String buymedinformation) {
        this.buymedinformation = buymedinformation;
    }
}
