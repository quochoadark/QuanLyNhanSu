package com.example.demo.domain;

import java.sql.Date;

public class ChucVu {
    private String maChucVu;
    private String tenChucVu; 
    private String moTa;
    private String nguoiTao; 
    private Date ngayTao;
    public ChucVu(String maChucVu, String tenChucVu, String moTa, String nguoiTao, Date ngayTao) {
        this.maChucVu = maChucVu;
        this.tenChucVu = tenChucVu;
        this.moTa = moTa;
        this.nguoiTao = nguoiTao;
        this.ngayTao = ngayTao;
    } 

    public String getMaChucVu() {
        return maChucVu;
    }

    public void setMaChucVu(String maChucVu) {
        this.maChucVu = maChucVu;
    }

    public String getTenChucVu() {
        return tenChucVu;
    }

    public void setTenChucVu(String tenChucVu) {
        this.tenChucVu = tenChucVu;
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

    @Override
    public String toString() {
        return "ChucVu [maChucVu=" + maChucVu + ", tenChucVu=" + tenChucVu + ", moTa=" + moTa + ", nguoiTao=" + nguoiTao
                + ", ngayTao=" + ngayTao + "]";
    }

   
}
