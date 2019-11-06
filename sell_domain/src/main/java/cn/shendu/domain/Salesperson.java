package cn.shendu.domain;

public class Salesperson {
    private Integer id;
    private String salespersonname;
    private String contactinformation;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSalespersonname() {
        return salespersonname;
    }

    public void setSalespersonname(String salespersonname) {
        this.salespersonname = salespersonname;
    }

    public String getContactinformation() {
        return contactinformation;
    }

    public void setContactinformation(String contactinformation) {
        this.contactinformation = contactinformation;
    }
}
