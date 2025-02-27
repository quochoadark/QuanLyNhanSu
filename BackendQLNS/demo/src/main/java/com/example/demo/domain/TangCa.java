package com.example.demo.domain;

import java.sql.Date;

public class TangCa {
    private String maTangCa; 
    private Date ngayTangCa;
    private int soGioTangCa; 
    private float heSoTangCa; 
    private BangLuong maLuong; 

    public TangCa(float heSoTangCa, BangLuong maLuong, String maTangCa, Date ngayTangCa, int soGioTangCa) {
        this.heSoTangCa = heSoTangCa;
        this.maLuong = maLuong;
        this.maTangCa = maTangCa;
        this.ngayTangCa = ngayTangCa;
        this.soGioTangCa = soGioTangCa;
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
        return "TangCa [maTangCa=" + maTangCa + ", ngayTangCa=" + ngayTangCa + ", soGioTangCa=" + soGioTangCa
                + ", heSoTangCa=" + heSoTangCa + ", maLuong=" + maLuong + "]";
    }

        
}
