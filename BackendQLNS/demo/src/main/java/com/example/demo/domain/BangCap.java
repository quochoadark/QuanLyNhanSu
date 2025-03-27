package com.example.demo.domain;

import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class BangCap {
    @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id; 
    private String maBangCap; 
    private String tenBangCap;
    private String moTa; 
    private String nguoiTao;  
    private Date ngayTao;
    public BangCap(long id, String maBangCap, String tenBangCap, String moTa, String nguoiTao, Date ngayTao) {
        this.id = id;
        this.maBangCap = maBangCap;
        this.tenBangCap = tenBangCap;
        this.moTa = moTa;
        this.nguoiTao = nguoiTao;
        this.ngayTao = ngayTao;
    }
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
    public String getMaBangCap() {
        return maBangCap;
    }
    public void setMaBangCap(String maBangCap) {
        this.maBangCap = maBangCap;
    }
    public String getTenBangCap() {
        return tenBangCap;
    }
    public void setTenBangCap(String tenBangCap) {
        this.tenBangCap = tenBangCap;
    }
    public String getMoTa() {
        return moTa;
    }
    public void setMoTa(String moTa) {
        this.moTa = moTa;
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
    
}
