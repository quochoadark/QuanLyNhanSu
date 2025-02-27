package com.example.demo.domain;

import java.sql.Date;

public class BangCap {
    private String maBangCap; 
    private String tenBangCap;
    private String moTa; 
    private String nguoiTao;  
    private Date ngayTao;
    public BangCap(String maBangCap, String tenBangCap, String moTa, String nguoiTao, Date ngayTao) {
        this.maBangCap = maBangCap;
        this.tenBangCap = tenBangCap;
        this.moTa = moTa;
        this.nguoiTao = nguoiTao;
        this.ngayTao = ngayTao;
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

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("BangCap{");
        sb.append("maBangCap=").append(maBangCap);
        sb.append(", tenBangCap=").append(tenBangCap);
        sb.append(", moTa=").append(moTa);
        sb.append(", nguoiTao=").append(nguoiTao);
        sb.append(", ngayTao=").append(ngayTao);
        sb.append('}');
        return sb.toString();
    }
    
    
}
