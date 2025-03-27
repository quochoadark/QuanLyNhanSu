package com.example.demo.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class PhiCongTac {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id; 
    private String maPhiCongTac;
    private String loaiPhi; 
    private float soTien; 
    private BangCongTac maCongTac;

    public PhiCongTac(){

    }

    public PhiCongTac(long id, String maPhiCongTac, String loaiPhi, float soTien, BangCongTac maCongTac) {
        this.id = id;
        this.maPhiCongTac = maPhiCongTac;
        this.loaiPhi = loaiPhi;
        this.soTien = soTien;
        this.maCongTac = maCongTac;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getMaPhiCongTac() {
        return maPhiCongTac;
    }

    public void setMaPhiCongTac(String maPhiCongTac) {
        this.maPhiCongTac = maPhiCongTac;
    }

    public String getLoaiPhi() {
        return loaiPhi;
    }

    public void setLoaiPhi(String loaiPhi) {
        this.loaiPhi = loaiPhi;
    }

    public float getSoTien() {
        return soTien;
    }

    public void setSoTien(float soTien) {
        this.soTien = soTien;
    }

    public BangCongTac getMaCongTac() {
        return maCongTac;
    }

    public void setMaCongTac(BangCongTac maCongTac) {
        this.maCongTac = maCongTac;
    }

    @Override
    public String toString() {
        return "PhiCongTac [id=" + id + ", maPhiCongTac=" + maPhiCongTac + ", loaiPhi=" + loaiPhi + ", soTien=" + soTien
                + ", maCongTac=" + maCongTac + "]";
    }
    
    
}
