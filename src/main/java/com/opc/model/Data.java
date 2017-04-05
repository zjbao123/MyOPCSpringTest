package com.opc.model;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by zjbao on 2017/4/5.
 */
@Entity
@Table(name = "Data")
public class Data {

    @Id
    @GeneratedValue
    @Column(name = "id", nullable = false)
    private int id;

    @Column(name = "TIME", nullable = false)
    private Timestamp TIME;
    @Column(name = "random30", nullable = false)
    private float random30;
    @Column(name = "random32", nullable = false)
    private float random32;
    @Column(name = "random33", nullable = false)
    private float random33;
    @Column(name = "random34", nullable = false)
    private float random34;
    @Column(name = "random35", nullable = false)
    private float random35;
    @Column(name = "random40", nullable = false)
    private float random40;

    public Data() {
    }

    public Data(int id, Timestamp TIME, float random30, float random32, float random33, float random34, float random35, float random40) {
        this.id = id;
        this.TIME = TIME;
        this.random30 = random30;
        this.random32 = random32;
        this.random33 = random33;
        this.random34 = random34;
        this.random35 = random35;
        this.random40 = random40;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setTIME(Timestamp TIME) {
        this.TIME = TIME;
    }

    public void setRandom30(float random30) {
        this.random30 = random30;
    }

    public void setRandom32(float random32) {
        this.random32 = random32;
    }

    public void setRandom33(float random33) {
        this.random33 = random33;
    }

    public void setRandom34(float random34) {
        this.random34 = random34;
    }

    public void setRandom35(float random35) {
        this.random35 = random35;
    }

    public void setRandom40(float random40) {
        this.random40 = random40;
    }

    public int getId() {
        return id;
    }

    public Timestamp getTIME() {
        return TIME;
    }

    public float getRandom30() {
        return random30;
    }

    public float getRandom32() {
        return random32;
    }

    public float getRandom33() {
        return random33;
    }

    public float getRandom34() {
        return random34;
    }

    public float getRandom35() {
        return random35;
    }

    public float getRandom40() {
        return random40;
    }
}
