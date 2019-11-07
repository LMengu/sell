package cn.shendu.domain;

import java.util.List;

public class Hospital {
<<<<<<< HEAD
    private Integer id;//医院ID
    private String hospitalname;//医院名字
    private String hospitaladdress;//医院地址
    private String contaceinformation;//
    private List<Salesperson> salesperson;
=======
    private Integer id;
    private String hospitalName;
    private String hospitalAddress;
    private String contaceinFormation;
    private List<SalesPerson> salesPerson;
>>>>>>> f98a2aec1cce72fe083b4c03821c833551a53df4

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
