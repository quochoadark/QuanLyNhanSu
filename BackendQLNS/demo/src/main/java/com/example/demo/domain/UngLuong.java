package com.example.demo.domain;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class UngLuong {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id; 
    private String maUngLuong; 
    private float soTien; 
    private LocalDate ngayUngLuong; 
    private String trangThai;
    private String hinhThuc; 
    private BangLuong maLuong;

    public UngLuong(){

    }

    public UngLuong(long id, String maUngLuong, float soTien, LocalDate ngayUngLuong, String trangThai, String hinhThuc,
            BangLuong maLuong) {
        this.id = id;
        this.maUngLuong = maUngLuong;
        this.soTien = soTien;
        this.ngayUngLuong = ngayUngLuong;
        this.trangThai = trangThai;
        this.hinhThuc = hinhThuc;
        this.maLuong = maLuong;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
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

    public LocalDate getNgayUngLuong() {
        return ngayUngLuong;
    }

    public void setNgayUngLuong(LocalDate ngayUngLuong) {
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
        return "UngLuong [id=" + id + ", maUngLuong=" + maUngLuong + ", soTien=" + soTien + ", ngayUngLuong="
                + ngayUngLuong + ", trangThai=" + trangThai + ", hinhThuc=" + hinhThuc + ", maLuong=" + maLuong + "]";
    }
    
    
}
