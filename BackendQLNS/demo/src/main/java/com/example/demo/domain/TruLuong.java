package com.example.demo.domain;

import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class TruLuong {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String maTruLuong; 
    private Date ngayTruLuong; 
    private float soTien; 
    private String trangThai; 
    private BangLuong maLuong;
    
    public TruLuong(){

    }

    public TruLuong(long id, String maTruLuong, Date ngayTruLuong, float soTien, String trangThai, BangLuong maLuong) {
        this.id = id;
        this.maTruLuong = maTruLuong;
        this.ngayTruLuong = ngayTruLuong;
        this.soTien = soTien;
        this.trangThai = trangThai;
        this.maLuong = maLuong;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getMaTruLuong() {
        return maTruLuong;
    }

    public void setMaTruLuong(String maTruLuong) {
        this.maTruLuong = maTruLuong;
    }

    public Date getNgayTruLuong() {
        return ngayTruLuong;
    }

    public void setNgayTruLuong(Date ngayTruLuong) {
        this.ngayTruLuong = ngayTruLuong;
    }

    public float getSoTien() {
        return soTien;
    }

    public void setSoTien(float soTien) {
        this.soTien = soTien;
    }

    public String getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(String trangThai) {
        this.trangThai = trangThai;
    }

    public BangLuong getMaLuong() {
        return maLuong;
    }

    public void setMaLuong(BangLuong maLuong) {
        this.maLuong = maLuong;
    }

    @Override
    public String toString() {
        return "TruLuong [id=" + id + ", maTruLuong=" + maTruLuong + ", ngayTruLuong=" + ngayTruLuong + ", soTien="
                + soTien + ", trangThai=" + trangThai + ", maLuong=" + maLuong + "]";
    }
    
    
}
