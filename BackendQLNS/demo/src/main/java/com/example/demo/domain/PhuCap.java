package com.example.demo.domain;

import java.sql.Date;

public class PhuCap {
    private String maPhuCap;
    private String tenPhuCap; 
    private float soTien;
    private String hinhThuc; 
    private String trangThai; 
    private Date ngayPhuCap; 
    private BangLuong maLuong;
    public PhuCap(String maPhuCap, String tenPhuCap, float soTien, String hinhThuc, String trangThai, Date ngayPhuCap,
            BangLuong maLuong) {
        this.maPhuCap = maPhuCap;
        this.tenPhuCap = tenPhuCap;
        this.soTien = soTien;
        this.hinhThuc = hinhThuc;
        this.trangThai = trangThai;
        this.ngayPhuCap = ngayPhuCap;
        this.maLuong = maLuong;
    }
    public String getMaPhuCap() {
        return maPhuCap;
    }
    public void setMaPhuCap(String maPhuCap) {
        this.maPhuCap = maPhuCap;
    }
    public String getTenPhuCap() {
        return tenPhuCap;
    }
    public void setTenPhuCap(String tenPhuCap) {
        this.tenPhuCap = tenPhuCap;
    }
    public float getSoTien() {
        return soTien;
    }
    public void setSoTien(float soTien) {
        this.soTien = soTien;
    }
    public String getHinhThuc() {
        return hinhThuc;
    }
    public void setHinhThuc(String hinhThuc) {
        this.hinhThuc = hinhThuc;
    }
    public String getTrangThai() {
        return trangThai;
    }
    public void setTrangThai(String trangThai) {
        this.trangThai = trangThai;
    }
    public Date getNgayPhuCap() {
        return ngayPhuCap;
    }
    public void setNgayPhuCap(Date ngayPhuCap) {
        this.ngayPhuCap = ngayPhuCap;
    }
    public BangLuong getMaLuong() {
        return maLuong;
    }
    public void setMaLuong(BangLuong maLuong) {
        this.maLuong = maLuong;
    }
    @Override
    public String toString() {
        return "PhuCap [maPhuCap=" + maPhuCap + ", tenPhuCap=" + tenPhuCap + ", soTien=" + soTien + ", hinhThuc="
                + hinhThuc + ", trangThai=" + trangThai + ", ngayPhuCap=" + ngayPhuCap + ", maLuong=" + maLuong + "]";
    } 
    
    
}