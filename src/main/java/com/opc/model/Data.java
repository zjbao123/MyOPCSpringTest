package com.opc.model;

import javax.persistence.*;
import java.sql.Date;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;

/**
 * Created by zjbao on 2017/4/5.
 */
@Entity
@Table(name = "data")
public class Data {

    @Id
    @Column(name = "TIME", nullable = false, unique = true)
    private Timestamp TIME;
    @Column(name = "random30", nullable = false)
    private float machineA;
    @Column(name = "random32", nullable = false)
    private float machineB;
    @Column(name = "random33", nullable = false)
    private float machineC;
    @Column(name = "random34", nullable = false)
    private float machineD;
    @Column(name = "random35", nullable = false)
    private float machineE;
    @Column(name = "random40", nullable = false)
    private float machineF;

    public Data() {
    }

    public Data(Timestamp TIME, float machineA, float machineB, float machineC, float machineD, float machineE, float machineF) {
        this.TIME = TIME;
        this.machineA = machineA;
        this.machineB = machineB;
        this.machineC = machineC;
        this.machineD = machineD;
        this.machineE = machineE;
        this.machineF = machineF;
//        this.datestamp= new SimpleDateFormat("yyyy/MM/dd HH:mm:ss").format(TIME);
    }

    public String getTIME() {
        return new SimpleDateFormat("yyyy/MM/dd HH:mm:ss").format(TIME);
    }

    public void setTIME(Timestamp TIME) {
        this.TIME = TIME;
    }

    public float getMachineA() {
        return machineA;
    }

    public void setMachineA(float machineA) {
        this.machineA = machineA;
    }

    public float getMachineB() {
        return machineB;
    }

    public void setMachineB(float machineB) {
        this.machineB = machineB;
    }

    public float getMachineC() {
        return machineC;
    }

    public void setMachineC(float machineC) {
        this.machineC = machineC;
    }

    public float getMachineD() {
        return machineD;
    }

    public void setMachineD(float machineD) {
        this.machineD = machineD;
    }

    public float getMachineE() {
        return machineE;
    }

    public void setMachineE(float machineE) {
        this.machineE = machineE;
    }

    public float getMachineF() {
        return machineF;
    }

    public void setMachineF(float machineF) {
        this.machineF = machineF;
    }

}
