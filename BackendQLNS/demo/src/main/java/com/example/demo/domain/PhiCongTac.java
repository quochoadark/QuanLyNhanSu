package com.example.demo.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class PhiCongTac {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id; 
    private String maPhiCongTac;
    private String loaiPhi; 
    private double soTien; 

       @ManyToOne
    @JoinColumn(name = "maCongTac_id")
    private BangCongTac maCongTac;

    public PhiCongTac(){

    }

    public PhiCongTac(long id, String maPhiCongTac, String loaiPhi, double soTien) {
        this.id = id;
        this.maPhiCongTac = maPhiCongTac;
        this.loaiPhi = loaiPhi;
        this.soTien = soTien;
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

    public double getSoTien() {
        return soTien;
    }

    public void setSoTien(double soTien) {
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
                + "]";
    }

    
}
