package cn.shendu.domain;

public class PatientInformation {
    private Integer id;
    private String patientName;
    private String patientSex;
    private Integer patientAge;
    private String patientcontactInformation;
    private String patientilLness;
    private String buymedInformation;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public String getPatientSex() {
        return patientSex;
    }

    public void setPatientSex(String patientSex) {
        this.patientSex = patientSex;
    }

    public Integer getPatientAge() {
        return patientAge;
    }

    public void setPatientAge(Integer patientAge) {
        this.patientAge = patientAge;
    }

    public String getPatientcontactInformation() {
        return patientcontactInformation;
    }

    public void setPatientcontactInformation(String patientcontactInformation) {
        this.patientcontactInformation = patientcontactInformation;
    }

    public String getPatientilLness() {
        return patientilLness;
    }

    public void setPatientilLness(String patientilLness) {
        this.patientilLness = patientilLness;
    }

    public String getBuymedInformation() {
        return buymedInformation;
    }

    public void setBuymedInformation(String buymedInformation) {
        this.buymedInformation = buymedInformation;
    }
}
