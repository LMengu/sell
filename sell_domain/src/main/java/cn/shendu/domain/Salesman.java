package cn.shendu.domain;

import java.util.List;

public class Salesman {
    private Integer id;//销售员ID
    private String salesmanName;//销售员姓名
    private String salesmanSex;//销售员性别
    private Integer salesmanAge;//销售员年龄
    private String salesmanAddress;//销售员地址
    private String salesmanPhone;//销售员电话
    private List<Hospital> hospitals;
<<<<<<< HEAD
=======

>>>>>>> 46c843e170971c5bbeb02b2b8de39a2c20937eeb
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSalesmanName() {
        return salesmanName;
    }

    public void setSalesmanName(String salesmanName) {
        this.salesmanName = salesmanName;
    }

    public String getSalesmanSex() {
        return salesmanSex;
    }

    public void setSalesmanSex(String salesmanSex) {
        this.salesmanSex = salesmanSex;
    }

    public Integer getSalesmanAge() {
        return salesmanAge;
    }

    public void setSalesmanAge(Integer salesmanAge) {
        this.salesmanAge = salesmanAge;
    }

    public String getSalesmanAddress() {
        return salesmanAddress;
    }

    public void setSalesmanAddress(String salesmanAddress) {
        this.salesmanAddress = salesmanAddress;
    }

    public String getSalesmanPhone() {
        return salesmanPhone;
    }

    public void setSalesmanPhone(String salesmanPhone) {
        this.salesmanPhone = salesmanPhone;
    }

    public List<Hospital> getHospitals() {
        return hospitals;
    }

    public void setHospitals(List<Hospital> hospitals) {
        this.hospitals = hospitals;
    }
}
