package cn.shendu.domain;

import java.util.List;

public class HospitalMedinventory {
    private Integer id;
    private List<Medprice> medprice;
    private String medinventory;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public List<Medprice> getMedprice() {
        return medprice;
    }

    public void setMedprice(List<Medprice> medprice) {
        this.medprice = medprice;
    }

    public String getMedinventory() {
        return medinventory;
    }

    public void setMedinventory(String medinventory) {
        this.medinventory = medinventory;
    }
}
