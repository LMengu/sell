package cn.shendu.domain;

import java.util.List;

public class Medprice {
    private Integer id;
    private List<Hospital> hospital;
    private List<MedInformation> medInformation;
    private Integer medprice;

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

    public List<MedInformation> getMedInformation() {
        return medInformation;
    }

    public void setMedInformation(List<MedInformation> medInformation) {
        this.medInformation = medInformation;
    }

    public Integer getMedprice() {
        return medprice;
    }

    public void setMedprice(Integer medprice) {
        this.medprice = medprice;
    }
}
