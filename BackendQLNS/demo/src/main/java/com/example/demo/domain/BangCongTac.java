package com.example.demo.domain;

import java.sql.Date;

public class BangCongTac {
    private String maCongTac; 
    private Date ngayBatDau;
    private Date ngayKetThuc; 
    private String diaDiem; 
    private String mucTieu;
    private String nguoiTao;
    private Date ngayTao;
    public BangCongTac(String maCongTac, Date ngayBatDau, Date ngayKetThuc, String diaDiem, String mucTieu,
            String nguoiTao, Date ngayTao) {
        this.maCongTac = maCongTac;
        this.ngayBatDau = ngayBatDau;
        this.ngayKetThuc = ngayKetThuc;
        this.diaDiem = diaDiem;
        this.mucTieu = mucTieu;
        this.nguoiTao = nguoiTao;
        this.ngayTao = ngayTao;
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
        return "BangCongTac [maCongTac=" + maCongTac + ", ngayBatDau=" + ngayBatDau + ", ngayKetThuc=" + ngayKetThuc
                + ", diaDiem=" + diaDiem + ", mucTieu=" + mucTieu + ", nguoiTao=" + nguoiTao + ", ngayTao=" + ngayTao
                + "]";
    } 

    
}
