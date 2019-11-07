package cn.shendu.domain;

import java.util.List;

public class Hospital {
    private Integer id;//医院ID
    private String hospitalname;//医院名字
    private String hospitaladdress;//医院地址
    private String contaceinformation;//
    private List<Salesperson> salesperson;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getHospitalname() {
        return hospitalname;
    }

    public void setHospitalname(String hospitalname) {
        this.hospitalname = hospitalname;
    }

    public String getHospitaladdress() {
        return hospitaladdress;
    }

    public void setHospitaladdress(String hospitaladdress) {
        this.hospitaladdress = hospitaladdress;
    }

    public String getContaceinformation() {
        return contaceinformation;
    }

    public void setContaceinformation(String contaceinformation) {
        this.contaceinformation = contaceinformation;
    }

    public List<Salesperson> getSalesperson() {
        return salesperson;
    }

    public void setSalesperson(List<Salesperson> salesperson) {
        this.salesperson = salesperson;
    }
}
