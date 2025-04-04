package com.example.demo.domain;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class UngLuong {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id; 
    private String maUngLuong; 
    private double soTien; 
    private LocalDate ngayUngLuong; 
    private String trangThai;
    private String hinhThuc; 

       @ManyToOne
    @JoinColumn(name = "maLuong_id")
    private BangLuong maLuong;

    public UngLuong(){

    }

    public UngLuong(long id, String maUngLuong, double soTien, LocalDate ngayUngLuong, String trangThai,
            String hinhThuc) {
        this.id = id;
        this.maUngLuong = maUngLuong;
        this.soTien = soTien;
        this.ngayUngLuong = ngayUngLuong;
        this.trangThai = trangThai;
        this.hinhThuc = hinhThuc;
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

    public double getSoTien() {
        return soTien;
    }

    public void setSoTien(double soTien) {
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
                + ngayUngLuong + ", trangThai=" + trangThai + ", hinhThuc=" + hinhThuc + "]";
    }

    
}
