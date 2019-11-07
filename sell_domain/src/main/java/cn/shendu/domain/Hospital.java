package cn.shendu.domain;

import java.util.List;

public class Hospital {
    private Integer id;
    private String hospitalName;
    private String hospitalAddress;
    private String contaceinFormation;
    private List<SalesPerson> salesPerson;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getHospitalName() {
        return hospitalName;
    }

    public void setHospitalName(String hospitalName) {
        this.hospitalName = hospitalName;
    }

    public String getHospitalAddress() {
        return hospitalAddress;
    }

    public void setHospitalAddress(String hospitalAddress) {
        this.hospitalAddress = hospitalAddress;
    }

    public String getContaceinFormation() {
        return contaceinFormation;
    }

    public void setContaceinFormation(String contaceinFormation) {
        this.contaceinFormation = contaceinFormation;
    }

    public List<SalesPerson> getSalesPerson() {
        return salesPerson;
    }

    public void setSalesPerson(List<SalesPerson> salesPerson) {
        this.salesPerson = salesPerson;
    }
}
