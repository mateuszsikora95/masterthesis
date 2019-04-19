package com.example.masterthesis.entities;

import javax.persistence.*;
import java.sql.Time;
import java.util.Objects;

@Entity
public class Lineitem {

    private LineitemPK lineitemPK;
    private long lQuantity;
    private long lExtendedprice;
    private long lDiscount;
    private long lTax;
    private String lReturnflag;
    private String lLinestatus;
    private Time lShipdate;
    private Time lCommitdate;
    private Time lReceiptdate;
    private String lShipinstruct;
    private String lShipmode;
    private String lComment;

    @EmbeddedId
    public LineitemPK getLineitemPK() {
        return lineitemPK;
    }

    public void setLineitemPK(LineitemPK lineitemPK) {
        this.lineitemPK = lineitemPK;
    }

    @Basic
    @Column(name = "L_QUANTITY")
    public long getlQuantity() {
        return lQuantity;
    }

    public void setlQuantity(long lQuantity) {
        this.lQuantity = lQuantity;
    }

    @Basic
    @Column(name = "L_EXTENDEDPRICE")
    public long getlExtendedprice() {
        return lExtendedprice;
    }

    public void setlExtendedprice(long lExtendedprice) {
        this.lExtendedprice = lExtendedprice;
    }

    @Basic
    @Column(name = "L_DISCOUNT")
    public long getlDiscount() {
        return lDiscount;
    }

    public void setlDiscount(long lDiscount) {
        this.lDiscount = lDiscount;
    }

    @Basic
    @Column(name = "L_TAX")
    public long getlTax() {
        return lTax;
    }

    public void setlTax(long lTax) {
        this.lTax = lTax;
    }

    @Basic
    @Column(name = "L_RETURNFLAG")
    public String getlReturnflag() {
        return lReturnflag;
    }

    public void setlReturnflag(String lReturnflag) {
        this.lReturnflag = lReturnflag;
    }

    @Basic
    @Column(name = "L_LINESTATUS")
    public String getlLinestatus() {
        return lLinestatus;
    }

    public void setlLinestatus(String lLinestatus) {
        this.lLinestatus = lLinestatus;
    }

    @Basic
    @Column(name = "L_SHIPDATE")
    public Time getlShipdate() {
        return lShipdate;
    }

    public void setlShipdate(Time lShipdate) {
        this.lShipdate = lShipdate;
    }

    @Basic
    @Column(name = "L_COMMITDATE")
    public Time getlCommitdate() {
        return lCommitdate;
    }

    public void setlCommitdate(Time lCommitdate) {
        this.lCommitdate = lCommitdate;
    }

    @Basic
    @Column(name = "L_RECEIPTDATE")
    public Time getlReceiptdate() {
        return lReceiptdate;
    }

    public void setlReceiptdate(Time lReceiptdate) {
        this.lReceiptdate = lReceiptdate;
    }

    @Basic
    @Column(name = "L_SHIPINSTRUCT")
    public String getlShipinstruct() {
        return lShipinstruct;
    }

    public void setlShipinstruct(String lShipinstruct) {
        this.lShipinstruct = lShipinstruct;
    }

    @Basic
    @Column(name = "L_SHIPMODE")
    public String getlShipmode() {
        return lShipmode;
    }

    public void setlShipmode(String lShipmode) {
        this.lShipmode = lShipmode;
    }

    @Basic
    @Column(name = "L_COMMENT")
    public String getlComment() {
        return lComment;
    }

    public void setlComment(String lComment) {
        this.lComment = lComment;
    }

}
