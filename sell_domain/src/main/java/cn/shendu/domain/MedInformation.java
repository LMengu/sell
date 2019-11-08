package cn.shendu.domain;



import cn.shendu.utils.DateUtils;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

public class MedInformation {
    private Integer id;//药品信息编号
    private String medName;//药品名称
    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm")
    private Date productionDate;//生产日期
    private String productionDateStr;
    private String shelfLife;//保质期
    private String speciality;//药品特性
    private Double price;//价格
    private Integer repertory;//数量

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMedName() {
        return medName;
    }

    public void setMedName(String medName) {
        this.medName = medName;
    }

    public Date getProductionDate() {
        return productionDate;
    }

    public void setProductionDate(Date productionDate) {
        this.productionDate = productionDate;
    }

    public String getProductionDateStr() {
        if (productionDate != null){
            productionDateStr = DateUtils.data2String(productionDate,"yyyy-MM-dd HH:mm");
        }
        return productionDateStr;
    }

    public void setProductionDateStr(String productionDateStr) {
        this.productionDateStr = productionDateStr;
    }

    public String getShelfLife() {
        return shelfLife;
    }

    public void setShelfLife(String shelfLife) {
        this.shelfLife = shelfLife;
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Integer getRepertory() {

        return repertory;
    }

    public void setRepertory(Integer repertory) {
        this.repertory = repertory;
    }
}
