package cn.shendu.domain;

import java.util.List;

public class HospitalMedinventory {
    private Integer id;
    private List<MedPrice> medPrice;
    private String mediNventory;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public List<MedPrice> getMedPrice() {
        return medPrice;
    }

    public void setMedPrice(List<MedPrice> medPrice) {
        this.medPrice = medPrice;
    }

    public String getMediNventory() {
        return mediNventory;
    }

    public void setMediNventory(String mediNventory) {
        this.mediNventory = mediNventory;
    }
}
