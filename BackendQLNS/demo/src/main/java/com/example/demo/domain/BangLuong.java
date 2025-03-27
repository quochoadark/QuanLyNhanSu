package com.example.demo.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class BangLuong {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id; 
    private String maLuong;
    private int ngay;
    private int thang;
    private int nam;
    private float luongCoban;
    private float chamCong;
    private float phuCap;
    private float ungLuong;
    private float truLuong;
    private float thucLanh;
    private float luongTangCa; 
    private NhanVien maNhanVien;

    public BangLuong(){
        
    }
    public BangLuong(long id, String maLuong, int ngay, int thang, int nam, float luongCoban, float chamCong,
            float phuCap, float ungLuong, float truLuong, float thucLanh, float luongTangCa, NhanVien maNhanVien) {
        this.id = id;
        this.maLuong = maLuong;
        this.ngay = ngay;
        this.thang = thang;
        this.nam = nam;
        this.luongCoban = luongCoban;
        this.chamCong = chamCong;
        this.phuCap = phuCap;
        this.ungLuong = ungLuong;
        this.truLuong = truLuong;
        this.thucLanh = thucLanh;
        this.luongTangCa = luongTangCa;
        this.maNhanVien = maNhanVien;
    }
    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public String getMaLuong() {
        return maLuong;
    }
    public void setMaLuong(String maLuong) {
        this.maLuong = maLuong;
    }
    public int getNgay() {
        return ngay;
    }
    public void setNgay(int ngay) {
        this.ngay = ngay;
    }
    public int getThang() {
        return thang;
    }
    public void setThang(int thang) {
        this.thang = thang;
    }
    public int getNam() {
        return nam;
    }
    public void setNam(int nam) {
        this.nam = nam;
    }
    public float getLuongCoban() {
        return luongCoban;
    }
    public void setLuongCoban(float luongCoban) {
        this.luongCoban = luongCoban;
    }
    public float getChamCong() {
        return chamCong;
    }
    public void setChamCong(float chamCong) {
        this.chamCong = chamCong;
    }
    public float getPhuCap() {
        return phuCap;
    }
    public void setPhuCap(float phuCap) {
        this.phuCap = phuCap;
    }
    public float getUngLuong() {
        return ungLuong;
    }
    public void setUngLuong(float ungLuong) {
        this.ungLuong = ungLuong;
    }
    public float getTruLuong() {
        return truLuong;
    }
    public void setTruLuong(float truLuong) {
        this.truLuong = truLuong;
    }
    public float getThucLanh() {
        return thucLanh;
    }
    public void setThucLanh(float thucLanh) {
        this.thucLanh = thucLanh;
    }
    public float getLuongTangCa() {
        return luongTangCa;
    }
    public void setLuongTangCa(float luongTangCa) {
        this.luongTangCa = luongTangCa;
    }
    public NhanVien getMaNhanVien() {
        return maNhanVien;
    }
    public void setMaNhanVien(NhanVien maNhanVien) {
        this.maNhanVien = maNhanVien;
    }
    @Override
    public String toString() {
        return "BangLuong [id=" + id + ", maLuong=" + maLuong + ", ngay=" + ngay + ", thang=" + thang + ", nam=" + nam
                + ", luongCoban=" + luongCoban + ", chamCong=" + chamCong + ", phuCap=" + phuCap + ", ungLuong="
                + ungLuong + ", truLuong=" + truLuong + ", thucLanh=" + thucLanh + ", luongTangCa=" + luongTangCa
                + ", maNhanVien=" + maNhanVien + "]";
    }

    
}
