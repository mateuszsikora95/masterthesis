package com.example.masterthesis.entities;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Objects;

@Entity
public class Nation {
    private int nNationkey;
    private String nName;
    private String nComment;

    @Id
    @Column(name = "N_NATIONKEY")
    public int getnNationkey() {
        return nNationkey;
    }

    public void setnNationkey(int nNationkey) {
        this.nNationkey = nNationkey;
    }

    @Basic
    @Column(name = "N_NAME")
    public String getnName() {
        return nName;
    }

    public void setnName(String nName) {
        this.nName = nName;
    }

    @Basic
    @Column(name = "N_COMMENT")
    public String getnComment() {
        return nComment;
    }

    public void setnComment(String nComment) {
        this.nComment = nComment;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Nation nation = (Nation) o;
        return nNationkey == nation.nNationkey &&
                Objects.equals(nName, nation.nName) &&
                Objects.equals(nComment, nation.nComment);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nNationkey, nName, nComment);
    }
}
