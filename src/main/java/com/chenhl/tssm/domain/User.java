package com.chenhl.tssm.domain;

/**
 * @description: 测试用类
 * @author: TF019387 chenhonglei
 * @date: 2017/11/19 19:12
 */
public class User {

    private Integer id;

    private String name;

    private Integer age;

    private ContactInfo contactInfo;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public ContactInfo getContactInfo() {
        return contactInfo;
    }

    public void setContactInfo(ContactInfo contactInfo) {
        this.contactInfo = contactInfo;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", contactInfo=" + contactInfo +
                '}';
    }
}
