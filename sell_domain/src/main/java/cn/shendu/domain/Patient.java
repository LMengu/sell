package cn.shendu.domain;

import java.util.List;

public class Patient {
    private Integer id;
    private List<Hospital> hospital;
    private List<PatientInformation> patientInformation;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public List<Hospital> getHospital() {
        return hospital;
    }

    public void setHospital(List<Hospital> hospital) {
        this.hospital = hospital;
    }

    public List<PatientInformation> getPatientInformation() {
        return patientInformation;
    }

    public void setPatientInformation(List<PatientInformation> patientInformation) {
        this.patientInformation = patientInformation;
    }
}
