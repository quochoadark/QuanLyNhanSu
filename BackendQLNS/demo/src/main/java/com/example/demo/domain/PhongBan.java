package com.example.demo.domain;

import java.sql.Date;

public class PhongBan {
    private String maPhongBan; 
    private String tenPhongBan;
    private String moTa;
    private String ngươiTao; 
    private Date ngayTao;
    public PhongBan(String maPhongBan, String tenPhongBan, String moTa, String ngươiTao, Date ngayTao) {
        this.maPhongBan = maPhongBan;
        this.tenPhongBan = tenPhongBan;
        this.moTa = moTa;
        this.ngươiTao = ngươiTao;
        this.ngayTao = ngayTao;
    }
    public String getMaPhongBan() {
        return maPhongBan;
    }
    public void setMaPhongBan(String maPhongBan) {
        this.maPhongBan = maPhongBan;
    }
    public String getTenPhongBan() {
        return tenPhongBan;
    }
    public void setTenPhongBan(String tenPhongBan) {
        this.tenPhongBan = tenPhongBan;
    }
    public String getMoTa() {
        return moTa;
    }
    public void setMoTa(String moTa) {
        this.moTa = moTa;
    }
    public String getNgươiTao() {
        return ngươiTao;
    }
    public void setNgươiTao(String ngươiTao) {
        this.ngươiTao = ngươiTao;
    }
    public Date getNgayTao() {
        return ngayTao;
    }
    public void setNgayTao(Date ngayTao) {
        this.ngayTao = ngayTao;
    }
    @Override
    public String toString() {
        return "PhongBan [maPhongBan=" + maPhongBan + ", tenPhongBan=" + tenPhongBan + ", moTa=" + moTa + ", ngươiTao="
                + ngươiTao + ", ngayTao=" + ngayTao + "]";
    } 
    
    
}
