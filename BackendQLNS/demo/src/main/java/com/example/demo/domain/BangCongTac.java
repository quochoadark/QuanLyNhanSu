package com.example.demo.domain;

import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class BangCongTac {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id; 
    private String maCongTac; 
    private Date ngayBatDau;
    private Date ngayKetThuc; 
    private String diaDiem; 
    private String mucTieu;
    private String nguoiTao;
    private Date ngayTao;

    public BangCongTac(){
        
    }
    public BangCongTac(long id, String maCongTac, Date ngayBatDau, Date ngayKetThuc, String diaDiem, String mucTieu,
            String nguoiTao, Date ngayTao) {
        this.id = id;
        this.maCongTac = maCongTac;
        this.ngayBatDau = ngayBatDau;
        this.ngayKetThuc = ngayKetThuc;
        this.diaDiem = diaDiem;
        this.mucTieu = mucTieu;
        this.nguoiTao = nguoiTao;
        this.ngayTao = ngayTao;
    }
    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public String getMaCongTac() {
        return maCongTac;
    }
    public void setMaCongTac(String maCongTac) {
        this.maCongTac = maCongTac;
    }
    public Date getNgayBatDau() {
        return ngayBatDau;
    }
    public void setNgayBatDau(Date ngayBatDau) {
        this.ngayBatDau = ngayBatDau;
    }
    public Date getNgayKetThuc() {
        return ngayKetThuc;
    }
    public void setNgayKetThuc(Date ngayKetThuc) {
        this.ngayKetThuc = ngayKetThuc;
    }
    public String getDiaDiem() {
        return diaDiem;
    }
    public void setDiaDiem(String diaDiem) {
        this.diaDiem = diaDiem;
    }
    public String getMucTieu() {
        return mucTieu;
    }
    public void setMucTieu(String mucTieu) {
        this.mucTieu = mucTieu;
    }
    public String getNguoiTao() {
        return nguoiTao;
    }
    public void setNguoiTao(String nguoiTao) {
        this.nguoiTao = nguoiTao;
    }
    public Date getNgayTao() {
        return ngayTao;
    }
    public void setNgayTao(Date ngayTao) {
        this.ngayTao = ngayTao;
    }
    @Override
    public String toString() {
        return "BangCongTac [id=" + id + ", maCongTac=" + maCongTac + ", ngayBatDau=" + ngayBatDau + ", ngayKetThuc="
                + ngayKetThuc + ", diaDiem=" + diaDiem + ", mucTieu=" + mucTieu + ", nguoiTao=" + nguoiTao
                + ", ngayTao=" + ngayTao + "]";
    }

}
