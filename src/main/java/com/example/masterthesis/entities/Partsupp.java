package com.example.masterthesis.entities;

import javax.persistence.*;
import java.util.Objects;

@Entity
@IdClass(PartsuppPK.class)
public class Partsupp {
    private int psPartkey;
    private int psSuppkey;
    private long psAvailqty;
    private long psSupplycost;
    private String psComment;

    @Id
    @Column(name = "PS_PARTKEY")
    public int getPsPartkey() {
        return psPartkey;
    }

    public void setPsPartkey(int psPartkey) {
        this.psPartkey = psPartkey;
    }

    @Id
    @Column(name = "PS_SUPPKEY")
    public int getPsSuppkey() {
        return psSuppkey;
    }

    public void setPsSuppkey(int psSuppkey) {
        this.psSuppkey = psSuppkey;
    }

    @Basic
    @Column(name = "PS_AVAILQTY")
    public long getPsAvailqty() {
        return psAvailqty;
    }

    public void setPsAvailqty(long psAvailqty) {
        this.psAvailqty = psAvailqty;
    }

    @Basic
    @Column(name = "PS_SUPPLYCOST")
    public long getPsSupplycost() {
        return psSupplycost;
    }

    public void setPsSupplycost(long psSupplycost) {
        this.psSupplycost = psSupplycost;
    }

    @Basic
    @Column(name = "PS_COMMENT")
    public String getPsComment() {
        return psComment;
    }

    public void setPsComment(String psComment) {
        this.psComment = psComment;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Partsupp partsupp = (Partsupp) o;
        return psPartkey == partsupp.psPartkey &&
                psSuppkey == partsupp.psSuppkey &&
                psAvailqty == partsupp.psAvailqty &&
                psSupplycost == partsupp.psSupplycost &&
                Objects.equals(psComment, partsupp.psComment);
    }

    @Override
    public int hashCode() {
        return Objects.hash(psPartkey, psSuppkey, psAvailqty, psSupplycost, psComment);
    }
}
