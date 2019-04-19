package com.example.masterthesis.entities;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Objects;

public class PartsuppPK implements Serializable {
    private int psPartkey;
    private int psSuppkey;

    @Column(name = "PS_PARTKEY")
    @Id
    public int getPsPartkey() {
        return psPartkey;
    }

    public void setPsPartkey(int psPartkey) {
        this.psPartkey = psPartkey;
    }

    @Column(name = "PS_SUPPKEY")
    @Id
    public int getPsSuppkey() {
        return psSuppkey;
    }

    public void setPsSuppkey(int psSuppkey) {
        this.psSuppkey = psSuppkey;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PartsuppPK that = (PartsuppPK) o;
        return psPartkey == that.psPartkey &&
                psSuppkey == that.psSuppkey;
    }

    @Override
    public int hashCode() {
        return Objects.hash(psPartkey, psSuppkey);
    }
}
