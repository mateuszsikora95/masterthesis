package com.example.masterthesis.entities;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Objects;

@Entity
public class Supplier {
    private int sSuppkey;
    private String sName;
    private String sAddress;
    private String sPhone;
    private long sAcctbal;
    private String sComment;

    @Id
    @Column(name = "S_SUPPKEY")
    public int getsSuppkey() {
        return sSuppkey;
    }

    public void setsSuppkey(int sSuppkey) {
        this.sSuppkey = sSuppkey;
    }

    @Basic
    @Column(name = "S_NAME")
    public String getsName() {
        return sName;
    }

    public void setsName(String sName) {
        this.sName = sName;
    }

    @Basic
    @Column(name = "S_ADDRESS")
    public String getsAddress() {
        return sAddress;
    }

    public void setsAddress(String sAddress) {
        this.sAddress = sAddress;
    }

    @Basic
    @Column(name = "S_PHONE")
    public String getsPhone() {
        return sPhone;
    }

    public void setsPhone(String sPhone) {
        this.sPhone = sPhone;
    }

    @Basic
    @Column(name = "S_ACCTBAL")
    public long getsAcctbal() {
        return sAcctbal;
    }

    public void setsAcctbal(long sAcctbal) {
        this.sAcctbal = sAcctbal;
    }

    @Basic
    @Column(name = "S_COMMENT")
    public String getsComment() {
        return sComment;
    }

    public void setsComment(String sComment) {
        this.sComment = sComment;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Supplier supplier = (Supplier) o;
        return sSuppkey == supplier.sSuppkey &&
                sAcctbal == supplier.sAcctbal &&
                Objects.equals(sName, supplier.sName) &&
                Objects.equals(sAddress, supplier.sAddress) &&
                Objects.equals(sPhone, supplier.sPhone) &&
                Objects.equals(sComment, supplier.sComment);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sSuppkey, sName, sAddress, sPhone, sAcctbal, sComment);
    }
}
