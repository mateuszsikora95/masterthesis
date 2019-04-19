package com.example.masterthesis.entities;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Objects;

@Entity
public class Part {
    private int pPartkey;
    private String pName;
    private String pMfgr;
    private String pBrand;
    private String pType;
    private long pSize;
    private String pContainer;
    private long pRetailprice;
    private String pComment;

    @Id
    @Column(name = "P_PARTKEY")
    public int getpPartkey() {
        return pPartkey;
    }

    public void setpPartkey(int pPartkey) {
        this.pPartkey = pPartkey;
    }

    @Basic
    @Column(name = "P_NAME")
    public String getpName() {
        return pName;
    }

    public void setpName(String pName) {
        this.pName = pName;
    }

    @Basic
    @Column(name = "P_MFGR")
    public String getpMfgr() {
        return pMfgr;
    }

    public void setpMfgr(String pMfgr) {
        this.pMfgr = pMfgr;
    }

    @Basic
    @Column(name = "P_BRAND")
    public String getpBrand() {
        return pBrand;
    }

    public void setpBrand(String pBrand) {
        this.pBrand = pBrand;
    }

    @Basic
    @Column(name = "P_TYPE")
    public String getpType() {
        return pType;
    }

    public void setpType(String pType) {
        this.pType = pType;
    }

    @Basic
    @Column(name = "P_SIZE")
    public long getpSize() {
        return pSize;
    }

    public void setpSize(long pSize) {
        this.pSize = pSize;
    }

    @Basic
    @Column(name = "P_CONTAINER")
    public String getpContainer() {
        return pContainer;
    }

    public void setpContainer(String pContainer) {
        this.pContainer = pContainer;
    }

    @Basic
    @Column(name = "P_RETAILPRICE")
    public long getpRetailprice() {
        return pRetailprice;
    }

    public void setpRetailprice(long pRetailprice) {
        this.pRetailprice = pRetailprice;
    }

    @Basic
    @Column(name = "P_COMMENT")
    public String getpComment() {
        return pComment;
    }

    public void setpComment(String pComment) {
        this.pComment = pComment;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Part part = (Part) o;
        return pPartkey == part.pPartkey &&
                pSize == part.pSize &&
                pRetailprice == part.pRetailprice &&
                Objects.equals(pName, part.pName) &&
                Objects.equals(pMfgr, part.pMfgr) &&
                Objects.equals(pBrand, part.pBrand) &&
                Objects.equals(pType, part.pType) &&
                Objects.equals(pContainer, part.pContainer) &&
                Objects.equals(pComment, part.pComment);
    }

    @Override
    public int hashCode() {
        return Objects.hash(pPartkey, pName, pMfgr, pBrand, pType, pSize, pContainer, pRetailprice, pComment);
    }
}
