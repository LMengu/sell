package cn.shendu.domain;

import java.util.List;

public class MedInventory {
    private Integer id;
    private List<MedInformation> medInformation;
    private Integer num;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public List<MedInformation> getMedInformation() {
        return medInformation;
    }

    public void setMedInformation(List<MedInformation> medInformation) {
        this.medInformation = medInformation;
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }
}
