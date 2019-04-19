package com.example.masterthesis.entities;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Objects;

@Entity
public class Region {
    private int rRegionkey;
    private String rName;
    private String rComment;

    @Id
    @Column(name = "R_REGIONKEY")
    public int getrRegionkey() {
        return rRegionkey;
    }

    public void setrRegionkey(int rRegionkey) {
        this.rRegionkey = rRegionkey;
    }

    @Basic
    @Column(name = "R_NAME")
    public String getrName() {
        return rName;
    }

    public void setrName(String rName) {
        this.rName = rName;
    }

    @Basic
    @Column(name = "R_COMMENT")
    public String getrComment() {
        return rComment;
    }

    public void setrComment(String rComment) {
        this.rComment = rComment;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Region region = (Region) o;
        return rRegionkey == region.rRegionkey &&
                Objects.equals(rName, region.rName) &&
                Objects.equals(rComment, region.rComment);
    }

    @Override
    public int hashCode() {
        return Objects.hash(rRegionkey, rName, rComment);
    }
}
