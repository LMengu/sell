package cn.shendu.domain;

import java.util.List;

public class Patient {
    private Integer id;
    private List<Hospital> hospital;
    private List<Patientinformation> patientinformation;

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

    public List<Patientinformation> getPatientinformation() {
        return patientinformation;
    }

    public void setPatientinformation(List<Patientinformation> patientinformation) {
        this.patientinformation = patientinformation;
    }
}
