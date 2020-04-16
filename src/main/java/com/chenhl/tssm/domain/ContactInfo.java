package com.chenhl.tssm.domain;

/**
 * @创建人: chenhl
 * @创建时间: 2020/3/12
 * @描述:
 */
public class ContactInfo {

    private String phone;
    private String address;



    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "ContactInfo{" +
                "phone='" + phone + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
