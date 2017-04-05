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
    //@GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="id", nullable = false)
    private int id;

    @Column(name="TIME", nullable = false)
    private Timestamp TIME;
    @Column(name="random30", nullable=false)
    private float random30;
    @Column(name="random32", nullable=false)
    private float random32;
    @Column(name="random33", nullable=false)
    private float random33;
    @Column(name="random34", nullable=false)
    private float random34;
    @Column(name="random35", nullable=false)
    private float random35;
    @Column(name="random40", nullable=false)
    private float random40;
}
