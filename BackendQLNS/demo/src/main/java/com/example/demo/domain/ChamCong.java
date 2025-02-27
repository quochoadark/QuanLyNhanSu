package com.example.demo.domain;

import java.sql.Date;

public class ChamCong {
    private String maChamCong;
    private Date ngayCham;
    private BangLuong maLuong;
    private LoaiCong maLoaiCong;
    public ChamCong(String maChamCong, Date ngayCham, BangLuong maLuong, LoaiCong maLoaiCong) {
        this.maChamCong = maChamCong;
        this.ngayCham = ngayCham;
        this.maLuong = maLuong;
        this.maLoaiCong = maLoaiCong;
    }
    public String getMaChamCong() {
        return maChamCong;
    }
    public void setMaChamCong(String maChamCong) {
        this.maChamCong = maChamCong;
    }
    public Date getNgayCham() {
        return ngayCham;
    }
    public void setNgayCham(Date ngayCham) {
        this.ngayCham = ngayCham;
    }
    public BangLuong getMaLuong() {
        return maLuong;
    }
    public void setMaLuong(BangLuong maLuong) {
        this.maLuong = maLuong;
    }
    public LoaiCong getMaLoaiCong() {
        return maLoaiCong;
    }
    public void setMaLoaiCong(LoaiCong maLoaiCong) {
        this.maLoaiCong = maLoaiCong;
    }
    @Override
    public String toString() {
        return "ChamCong [maChamCong=" + maChamCong + ", ngayCham=" + ngayCham + ", maLuong=" + maLuong
                + ", maLoaiCong=" + maLoaiCong + "]";
    }

    
}
