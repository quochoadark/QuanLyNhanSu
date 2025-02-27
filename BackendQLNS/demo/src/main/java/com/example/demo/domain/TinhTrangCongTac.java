package com.example.demo.domain;

import java.sql.Date;


public class TinhTrangCongTac {
    private String maTinhTragnCongTac; 
    private BangCongTac maCongTac; 
    private String trangThai; 
    private Date ngayCapNhat;
    public TinhTrangCongTac(String maTinhTragnCongTac, BangCongTac maCongTac, String trangThai, Date ngayCapNhat) {
        this.maTinhTragnCongTac = maTinhTragnCongTac;
        this.maCongTac = maCongTac;
        this.trangThai = trangThai;
        this.ngayCapNhat = ngayCapNhat;
    }
    public String getMaTinhTragnCongTac() {
        return maTinhTragnCongTac;
    }
    public void setMaTinhTragnCongTac(String maTinhTragnCongTac) {
        this.maTinhTragnCongTac = maTinhTragnCongTac;
    }
    public BangCongTac getMaCongTac() {
        return maCongTac;
    }
    public void setMaCongTac(BangCongTac maCongTac) {
        this.maCongTac = maCongTac;
    }
    public String getTrangThai() {
        return trangThai;
    }
    public void setTrangThai(String trangThai) {
        this.trangThai = trangThai;
    }
    public Date getNgayCapNhat() {
        return ngayCapNhat;
    }
    public void setNgayCapNhat(Date ngayCapNhat) {
        this.ngayCapNhat = ngayCapNhat;
    }
    @Override
    public String toString() {
        return "TinhTrangCongTac [maTinhTragnCongTac=" + maTinhTragnCongTac + ", maCongTac=" + maCongTac
                + ", trangThai=" + trangThai + ", ngayCapNhat=" + ngayCapNhat + "]";
    } 

    
}
