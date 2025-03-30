package com.example.demo.domain;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class ChamCong {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id; 
    private String maChamCong; 
    private LocalDate ngayCong; 
    private LoaiCong maLoaiCong; 
    private BangLuong maLuong;
    
    public ChamCong(){

    }

    public ChamCong(long id, String maChamCong, LocalDate ngayCong, LoaiCong maLoaiCong, BangLuong maLuong) {
        this.id = id;
        this.maChamCong = maChamCong;
        this.ngayCong = ngayCong;
        this.maLoaiCong = maLoaiCong;
        this.maLuong = maLuong;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getMaChamCong() {
        return maChamCong;
    }

    public void setMaChamCong(String maChamCong) {
        this.maChamCong = maChamCong;
    }

    public LocalDate getNgayCong() {
        return ngayCong;
    }

    public void setNgayCong(LocalDate ngayCong) {
        this.ngayCong = ngayCong;
    }

    public LoaiCong getMaLoaiCong() {
        return maLoaiCong;
    }

    public void setMaLoaiCong(LoaiCong maLoaiCong) {
        this.maLoaiCong = maLoaiCong;
    }

    public BangLuong getMaLuong() {
        return maLuong;
    }

    public void setMaLuong(BangLuong maLuong) {
        this.maLuong = maLuong;
    }

    @Override
    public String toString() {
        return "ChamCong [id=" + id + ", maChamCong=" + maChamCong + ", ngayCong=" + ngayCong + ", maLoaiCong="
                + maLoaiCong + ", maLuong=" + maLuong + "]";
    }
    
    
}
