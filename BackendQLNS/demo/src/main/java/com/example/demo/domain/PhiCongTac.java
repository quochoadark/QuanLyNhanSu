package com.example.demo.domain;

public class PhiCongTac {
    private String maPhiCongTac;
    private String loaiPhi; 
    private float soTien; 
    private BangCongTac maCongTac;
    public PhiCongTac(String maPhiCongTac, String loaiPhi, float soTien, BangCongTac maCongTac) {
        this.maPhiCongTac = maPhiCongTac;
        this.loaiPhi = loaiPhi;
        this.soTien = soTien;
        this.maCongTac = maCongTac;
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
        return "PhiCongTac [maPhiCongTac=" + maPhiCongTac + ", loaiPhi=" + loaiPhi + ", soTien=" + soTien
                + ", maCongTac=" + maCongTac + "]";
    }

    
    
}
