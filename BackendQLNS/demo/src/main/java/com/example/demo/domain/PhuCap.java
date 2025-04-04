package com.example.demo.domain;


import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class PhuCap {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id; 
    private String maPhuCap;
    private String tenPhuCap; 
    private double soTien;
    private String hinhThuc; 
    private String trangThai; 
    private LocalDate ngayPhuCap; 
    
     @ManyToOne
    @JoinColumn(name = "maLuong_id")
    private BangLuong maLuong;
    
    public PhuCap(){

    }

    public PhuCap(long id, String maPhuCap, String tenPhuCap, double soTien, String hinhThuc, String trangThai,
            LocalDate ngayPhuCap) {
        this.id = id;
        this.maPhuCap = maPhuCap;
        this.tenPhuCap = tenPhuCap;
        this.soTien = soTien;
        this.hinhThuc = hinhThuc;
        this.trangThai = trangThai;
        this.ngayPhuCap = ngayPhuCap;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
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

    public double getSoTien() {
        return soTien;
    }

    public void setSoTien(double soTien) {
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

    public LocalDate getNgayPhuCap() {
        return ngayPhuCap;
    }

    public void setNgayPhuCap(LocalDate ngayPhuCap) {
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
        return "PhuCap [id=" + id + ", maPhuCap=" + maPhuCap + ", tenPhuCap=" + tenPhuCap + ", soTien=" + soTien
                + ", hinhThuc=" + hinhThuc + ", trangThai=" + trangThai + ", ngayPhuCap=" + ngayPhuCap + "]";
    }

    
}