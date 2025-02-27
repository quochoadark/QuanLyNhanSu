package com.example.demo.domain;

import java.sql.Date;

public class TrinhDo {
    private String maTrinhDo;
    private String tenTrinhDo;
    private String moTa;
    private String nguoiTao;
    private Date ngayTao;
    public TrinhDo(String maTrinhDo, String tenTrinhDo, String moTa, String nguoiTao, Date ngayTao) {
        this.maTrinhDo = maTrinhDo;
        this.tenTrinhDo = tenTrinhDo;
        this.moTa = moTa;
        this.nguoiTao = nguoiTao;
        this.ngayTao = ngayTao;
    }
    public String getMaTrinhDo() {
        return maTrinhDo;
    }
    public void setMaTrinhDo(String maTrinhDo) {
        this.maTrinhDo = maTrinhDo;
    }
    public String getTenTrinhDo() {
        return tenTrinhDo;
    }
    public void setTenTrinhDo(String tenTrinhDo) {
        this.tenTrinhDo = tenTrinhDo;
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
        return "TrinhDo [maTrinhDo=" + maTrinhDo + ", tenTrinhDo=" + tenTrinhDo + ", moTa=" + moTa + ", nguoiTao="
                + nguoiTao + ", ngayTao=" + ngayTao + "]";
    } 
    
}
