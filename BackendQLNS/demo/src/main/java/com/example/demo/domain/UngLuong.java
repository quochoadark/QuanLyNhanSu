package com.example.demo.domain;

import java.sql.Date;

public class UngLuong {
    private String maUngLuong; 
    private float soTien; 
    private Date ngayUngLuong; 
    private String trangThai;
    private String hinhThuc; 
    private BangLuong maLuong;
    public UngLuong(String maUngLuong, float soTien, Date ngayUngLuong, String trangThai, String hinhThuc,
            BangLuong maLuong) {
        this.maUngLuong = maUngLuong;
        this.soTien = soTien;
        this.ngayUngLuong = ngayUngLuong;
        this.trangThai = trangThai;
        this.hinhThuc = hinhThuc;
        this.maLuong = maLuong;
    }
    public String getMaUngLuong() {
        return maUngLuong;
    }
    public void setMaUngLuong(String maUngLuong) {
        this.maUngLuong = maUngLuong;
    }
    public float getSoTien() {
        return soTien;
    }
    public void setSoTien(float soTien) {
        this.soTien = soTien;
    }
    public Date getNgayUngLuong() {
        return ngayUngLuong;
    }
    public void setNgayUngLuong(Date ngayUngLuong) {
        this.ngayUngLuong = ngayUngLuong;
    }
    public String getTrangThai() {
        return trangThai;
    }
    public void setTrangThai(String trangThai) {
        this.trangThai = trangThai;
    }
    public String getHinhThuc() {
        return hinhThuc;
    }
    public void setHinhThuc(String hinhThuc) {
        this.hinhThuc = hinhThuc;
    }
    public BangLuong getMaLuong() {
        return maLuong;
    }
    public void setMaLuong(BangLuong maLuong) {
        this.maLuong = maLuong;
    }
    @Override
    public String toString() {
        return "UngLuong [maUngLuong=" + maUngLuong + ", soTien=" + soTien + ", ngayUngLuong=" + ngayUngLuong
                + ", trangThai=" + trangThai + ", hinhThuc=" + hinhThuc + ", maLuong=" + maLuong + "]";
    } 
}
