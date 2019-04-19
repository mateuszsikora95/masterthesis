package com.example.masterthesis.entities;

import javax.persistence.*;
import java.sql.Time;
import java.util.List;
import java.util.Objects;

@Entity
public class Orders {
    private int oOrderkey;
    private int oCustkey;
    private String oOrderstatus;
    private long oTotalprice;
    private Time oOrderdate;
    private String oOrderpriority;
    private String oClerk;
    private long oShippriority;
    private String oComment;
    private List<Lineitem> lineitems;

    @Id
    @Column(name = "O_ORDERKEY")
    public int getoOrderkey() {
        return oOrderkey;
    }

    public void setoOrderkey(int oOrderkey) {
        this.oOrderkey = oOrderkey;
    }

    @Column(name = "O_CUSTKEY")
    public int getoCustkey() {
        return oCustkey;
    }

    public void setoCustkey(int oCustkey) {
        this.oCustkey = oCustkey;
    }

    @Basic
    @Column(name = "O_ORDERSTATUS")
    public String getoOrderstatus() {
        return oOrderstatus;
    }

    public void setoOrderstatus(String oOrderstatus) {
        this.oOrderstatus = oOrderstatus;
    }

    @Basic
    @Column(name = "O_TOTALPRICE")
    public long getoTotalprice() {
        return oTotalprice;
    }

    public void setoTotalprice(long oTotalprice) {
        this.oTotalprice = oTotalprice;
    }

    @Basic
    @Column(name = "O_ORDERDATE")
    public Time getoOrderdate() {
        return oOrderdate;
    }

    public void setoOrderdate(Time oOrderdate) {
        this.oOrderdate = oOrderdate;
    }

    @Basic
    @Column(name = "O_ORDERPRIORITY")
    public String getoOrderpriority() {
        return oOrderpriority;
    }

    public void setoOrderpriority(String oOrderpriority) {
        this.oOrderpriority = oOrderpriority;
    }

    @Basic
    @Column(name = "O_CLERK")
    public String getoClerk() {
        return oClerk;
    }

    public void setoClerk(String oClerk) {
        this.oClerk = oClerk;
    }

    @Basic
    @Column(name = "O_SHIPPRIORITY")
    public long getoShippriority() {
        return oShippriority;
    }

    public void setoShippriority(long oShippriority) {
        this.oShippriority = oShippriority;
    }

    @Basic
    @Column(name = "O_COMMENT")
    public String getoComment() {
        return oComment;
    }

    public void setoComment(String oComment) {
        this.oComment = oComment;
    }

    @OneToMany
    @JoinColumn(name = "L_ORDERKEY")
    public List<Lineitem> getLineitems() {
        return lineitems;
    }

    public void setLineitems(List<Lineitem> lineitems) {
        this.lineitems = lineitems;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Orders orders = (Orders) o;
        return oOrderkey == orders.oOrderkey &&
                oTotalprice == orders.oTotalprice &&
                oShippriority == orders.oShippriority &&
                Objects.equals(oOrderstatus, orders.oOrderstatus) &&
                Objects.equals(oOrderdate, orders.oOrderdate) &&
                Objects.equals(oOrderpriority, orders.oOrderpriority) &&
                Objects.equals(oClerk, orders.oClerk) &&
                Objects.equals(oComment, orders.oComment);
    }

    @Override
    public int hashCode() {
        return Objects.hash(oOrderkey, oOrderstatus, oTotalprice, oOrderdate, oOrderpriority, oClerk, oShippriority, oComment);
    }
}
