package com.example.demo.domain;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;

@Entity
public class BangLuong {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id; 
    private String maLuong;
    private int ngay;
    private int thang;
    private int nam;
    private double tienLuong;
    private double phuCap;
    private double ungLuong;
    private double truLuong;
    private double thucLanh;
    private double luongTangCa; 
       @ManyToOne
    @JoinColumn(name = "maNhanVien_id")
    private NhanVien maNhanVien;

      @OneToMany(mappedBy = "maLuong")
    List<PhuCap> maPhuCapBL;
    
    @OneToMany(mappedBy = "maLuong")
    List<UngLuong> maUngLuongBL;
    
    @OneToMany(mappedBy = "maLuong")
    List<TruLuong> maTruLuongBL;


    public BangLuong(){
        
    }


    public BangLuong(long id, String maLuong, int ngay, int thang, int nam, double tienLuong, double phuCap,
            double ungLuong, double truLuong, double thucLanh, double luongTangCa) {
        this.id = id;
        this.maLuong = maLuong;
        this.ngay = ngay;
        this.thang = thang;
        this.nam = nam;
        this.tienLuong = tienLuong;
        this.phuCap = phuCap;
        this.ungLuong = ungLuong;
        this.truLuong = truLuong;
        this.thucLanh = thucLanh;
        this.luongTangCa = luongTangCa;
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


    public double getTienLuong() {
        return tienLuong;
    }


    public void setTienLuong(double tienLuong) {
        this.tienLuong = tienLuong;
    }


    public double getPhuCap() {
        return phuCap;
    }


    public void setPhuCap(double phuCap) {
        this.phuCap = phuCap;
    }


    public double getUngLuong() {
        return ungLuong;
    }


    public void setUngLuong(double ungLuong) {
        this.ungLuong = ungLuong;
    }


    public double getTruLuong() {
        return truLuong;
    }


    public void setTruLuong(double truLuong) {
        this.truLuong = truLuong;
    }


    public double getThucLanh() {
        return thucLanh;
    }


    public void setThucLanh(double thucLanh) {
        this.thucLanh = thucLanh;
    }


    public double getLuongTangCa() {
        return luongTangCa;
    }


    public void setLuongTangCa(double luongTangCa) {
        this.luongTangCa = luongTangCa;
    }


    public NhanVien getMaNhanVien() {
        return maNhanVien;
    }


    public void setMaNhanVien(NhanVien maNhanVien) {
        this.maNhanVien = maNhanVien;
    }


    public List<PhuCap> getMaPhuCapBL() {
        return maPhuCapBL;
    }


    public void setMaPhuCapBL(List<PhuCap> maPhuCapBL) {
        this.maPhuCapBL = maPhuCapBL;
    }


    public List<UngLuong> getMaUngLuongBL() {
        return maUngLuongBL;
    }


    public void setMaUngLuongBL(List<UngLuong> maUngLuongBL) {
        this.maUngLuongBL = maUngLuongBL;
    }


    public List<TruLuong> getMaTruLuongBL() {
        return maTruLuongBL;
    }


    public void setMaTruLuongBL(List<TruLuong> maTruLuongBL) {
        this.maTruLuongBL = maTruLuongBL;
    }


    @Override
    public String toString() {
        return "BangLuong [id=" + id + ", maLuong=" + maLuong + ", ngay=" + ngay + ", thang=" + thang + ", nam=" + nam
                + ", tienLuong=" + tienLuong + ", phuCap=" + phuCap + ", ungLuong=" + ungLuong + ", truLuong="
                + truLuong + ", thucLanh=" + thucLanh + ", luongTangCa=" + luongTangCa + "]";
    }

    
}
