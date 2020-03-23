package com.zhangzemin.bean;

import org.nutz.dao.entity.annotation.Column;
import org.nutz.dao.entity.annotation.Id;
import org.nutz.dao.entity.annotation.Name;
import org.nutz.dao.entity.annotation.Table;

import java.util.Date;

/**
 * 实体类Person
 */

@Table("t_person")
public class Person {
    @Id
    private Integer id;
    @Name
    private String name;
    @Column
    private Integer age;
    @Column
    private String gender;
    @Column
    private String email;
    @Column
    private Date createDate;
    @Column
    private Date updateDate;
    @Column
    private byte[] mb;
    @Column
    private String mbmz;


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

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    public byte[] getMb() {
        return mb;
    }

    public void setMb(byte[] mb) {
        this.mb = mb;
    }

    public String getMbmz() {
        return mbmz;
    }

    public void setMbmz(String mbmz) {
        this.mbmz = mbmz;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", email='" + email + '\'' +
                ", createDate=" + createDate +
                '}';
    }
}
