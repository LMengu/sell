package cn.shendu.domain;

import java.util.List;

public class UserInfo {
    private Integer id;
    private String username;
    private String password;
    private String contact;
    private String address;
    private int power;
    private String powerStr;
    private List<Role> roles;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public String getPowerStr() {
        if (power == 0){
            powerStr="未开启";
        }
        else if (power == 1){
            powerStr="开启";
        }
        return powerStr;
    }

    public void setPowerStr(String powerStr) {
        this.powerStr = powerStr;
    }

    public List<Role> getRoles() {
        return roles;
    }

    public void setRoles(List<Role> roles) {
        this.roles = roles;
    }
}
