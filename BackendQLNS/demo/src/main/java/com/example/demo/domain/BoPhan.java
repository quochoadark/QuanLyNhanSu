package com.example.demo.domain;

import java.sql.Date;

public class BoPhan {
    private String maBoPhan;
    private String tenBoPhan;
    private String moTa;
    private String nguoiTao;
    private Date ngayTao;
    public BoPhan(String maBoPhan, String tenBoPhan, String moTa, String nguoiTao, Date ngayTao) {
        this.maBoPhan = maBoPhan;
        this.tenBoPhan = tenBoPhan;
        this.moTa = moTa;
        this.nguoiTao = nguoiTao;
        this.ngayTao = ngayTao;
    }
    public String getMaBoPhan() {
        return maBoPhan;
    }
    public void setMaBoPhan(String maBoPhan) {
        this.maBoPhan = maBoPhan;
    }
    public String getTenBoPhan() {
        return tenBoPhan;
    }
    public void setTenBoPhan(String tenBoPhan) {
        this.tenBoPhan = tenBoPhan;
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
        return "BoPhan [maBoPhan=" + maBoPhan + ", tenBoPhan=" + tenBoPhan + ", moTa=" + moTa + ", nguoiTao=" + nguoiTao
                + ", ngayTao=" + ngayTao + "]";
    } 

        
}
