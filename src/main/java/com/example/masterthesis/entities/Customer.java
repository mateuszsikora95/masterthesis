package com.example.masterthesis.entities;

import javax.persistence.*;
import java.util.List;
import java.util.Objects;

@Entity
public class Customer {
    private int cCustkey;
    private String cName;
    private String cAddress;
    private String cPhone;
    private long cAcctbal;
    private String cMktsegment;
    private String cComment;
    private List<Orders> orders;

    @Id
    @Column(name = "C_CUSTKEY")
    public int getcCustkey() {
        return cCustkey;
    }

    public void setcCustkey(int cCustkey) {
        this.cCustkey = cCustkey;
    }

    @Basic
    @Column(name = "C_NAME")
    public String getcName() {
        return cName;
    }

    public void setcName(String cName) {
        this.cName = cName;
    }

    @Basic
    @Column(name = "C_ADDRESS")
    public String getcAddress() {
        return cAddress;
    }

    public void setcAddress(String cAddress) {
        this.cAddress = cAddress;
    }

    @Basic
    @Column(name = "C_PHONE")
    public String getcPhone() {
        return cPhone;
    }

    public void setcPhone(String cPhone) {
        this.cPhone = cPhone;
    }

    @Basic
    @Column(name = "C_ACCTBAL")
    public long getcAcctbal() {
        return cAcctbal;
    }

    public void setcAcctbal(long cAcctbal) {
        this.cAcctbal = cAcctbal;
    }

    @Basic
    @Column(name = "C_MKTSEGMENT")
    public String getcMktsegment() {
        return cMktsegment;
    }

    public void setcMktsegment(String cMktsegment) {
        this.cMktsegment = cMktsegment;
    }

    @Basic
    @Column(name = "C_COMMENT")
    public String getcComment() {
        return cComment;
    }

    public void setcComment(String cComment) {
        this.cComment = cComment;
    }

    @OneToMany
    @JoinColumn(name = "O_CUSTKEY")
    public List<Orders> getOrders() {
        return orders;
    }

    public void setOrders(List<Orders> orders) {
        this.orders = orders;
    }
}
