package cn.shendu.domain;

import java.util.List;

public class MedPrice {
    private Integer id;
    private List<Hospital> hospital;
    private List<MedInformation> medInformation;
    private Integer medPrice;

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

    public Integer getMedPrice() {
        return medPrice;
    }

    public void setMedPrice(Integer medPrice) {
        this.medPrice = medPrice;
    }
}
