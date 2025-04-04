package com.example.demo.domain;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class TruLuong {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String maTruLuong; 
    private LocalDate ngayTruLuong; 
    private double soTien; 
    private String trangThai; 
       @ManyToOne
    @JoinColumn(name = "maLuong_id")
    private BangLuong maLuong;
    
    public TruLuong(){

    }

    public TruLuong(long id, String maTruLuong, LocalDate ngayTruLuong, double soTien, String trangThai) {
        this.id = id;
        this.maTruLuong = maTruLuong;
        this.ngayTruLuong = ngayTruLuong;
        this.soTien = soTien;
        this.trangThai = trangThai;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getMaTruLuong() {
        return maTruLuong;
    }

    public void setMaTruLuong(String maTruLuong) {
        this.maTruLuong = maTruLuong;
    }

    public LocalDate getNgayTruLuong() {
        return ngayTruLuong;
    }

    public void setNgayTruLuong(LocalDate ngayTruLuong) {
        this.ngayTruLuong = ngayTruLuong;
    }

    public double getSoTien() {
        return soTien;
    }

    public void setSoTien(double soTien) {
        this.soTien = soTien;
    }

    public String getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(String trangThai) {
        this.trangThai = trangThai;
    }

    public BangLuong getMaLuong() {
        return maLuong;
    }

    public void setMaLuong(BangLuong maLuong) {
        this.maLuong = maLuong;
    }

    @Override
    public String toString() {
        return "TruLuong [id=" + id + ", maTruLuong=" + maTruLuong + ", ngayTruLuong=" + ngayTruLuong + ", soTien="
                + soTien + ", trangThai=" + trangThai + "]";
    }

    
}
