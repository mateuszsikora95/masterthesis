package com.example.masterthesis.entities;

import javax.persistence.*;
import javax.persistence.criteria.Order;
import java.io.Serializable;
import java.util.Objects;
@Embeddable
public class LineitemPK implements Serializable {
    private int lOrderkey;
    private long lLinenumber;

    @Column(name = "L_ORDERKEY")
    public int getlOrderkey() {
        return lOrderkey;
    }

    public void setlOrderkey(int lOrderkey) {
        this.lOrderkey = lOrderkey;
    }

    @Column(name = "L_LINENUMBER")
    public long getlLinenumber() {
        return lLinenumber;
    }

    public void setlLinenumber(long lLinenumber) {
        this.lLinenumber = lLinenumber;
    }

}
