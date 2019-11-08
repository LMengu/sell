package cn.shendu.domain;

public class Order {
    private Integer id;//订单Id
    private String drugsName;//订单名称
    private String drugsSpeciality;//订单药效
    private Double drugsPrice;//订单价格
    private Integer drugsNumber;//购买数量

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDrugsName() {
        return drugsName;
    }

    public void setDrugsName(String drugsName) {
        this.drugsName = drugsName;
    }

    public String getDrugsSpeciality() {
        return drugsSpeciality;
    }

    public void setDrugsSpeciality(String drugsSpeciality) {
        this.drugsSpeciality = drugsSpeciality;
    }

    public Double getDrugsPrice() {
        return drugsPrice;
    }

    public void setDrugsPrice(Double drugsPrice) {
        this.drugsPrice = drugsPrice;
    }

    public Integer getDrugsNumber() {
        return drugsNumber;
    }

    public void setDrugsNumber(Integer drugsNumber) {
        this.drugsNumber = drugsNumber;
    }
}
