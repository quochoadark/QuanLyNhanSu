package com.example.demo.domain;

import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class TangCa {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id; 
    private String maTangCa; 
    private Date ngayTangCa;
    private int soGioTangCa; 
    private float heSoTangCa; 
    private BangLuong maLuong; 

    public TangCa(){

    }

    public TangCa(long id, String maTangCa, Date ngayTangCa, int soGioTangCa, float heSoTangCa, BangLuong maLuong) {
        this.id = id;
        this.maTangCa = maTangCa;
        this.ngayTangCa = ngayTangCa;
        this.soGioTangCa = soGioTangCa;
        this.heSoTangCa = heSoTangCa;
        this.maLuong = maLuong;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getMaTangCa() {
        return maTangCa;
    }

    public void setMaTangCa(String maTangCa) {
        this.maTangCa = maTangCa;
    }

    public Date getNgayTangCa() {
        return ngayTangCa;
    }

    public void setNgayTangCa(Date ngayTangCa) {
        this.ngayTangCa = ngayTangCa;
    }

    public int getSoGioTangCa() {
        return soGioTangCa;
    }

    public void setSoGioTangCa(int soGioTangCa) {
        this.soGioTangCa = soGioTangCa;
    }

    public float getHeSoTangCa() {
        return heSoTangCa;
    }

    public void setHeSoTangCa(float heSoTangCa) {
        this.heSoTangCa = heSoTangCa;
    }

    public BangLuong getMaLuong() {
        return maLuong;
    }

    public void setMaLuong(BangLuong maLuong) {
        this.maLuong = maLuong;
    }

    @Override
    public String toString() {
        return "TangCa [id=" + id + ", maTangCa=" + maTangCa + ", ngayTangCa=" + ngayTangCa + ", soGioTangCa="
                + soGioTangCa + ", heSoTangCa=" + heSoTangCa + ", maLuong=" + maLuong + "]";
    }

    
}
