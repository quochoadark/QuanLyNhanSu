package com.example.demo.domain;

public class LoaiCong {
    private String maLoaiCong; 
    private String tenLoaiCong; 
    private float heSoCong;
    public LoaiCong(String maLoaiCong, String tenLoaiCong, float heSoCong) {
        this.maLoaiCong = maLoaiCong;
        this.tenLoaiCong = tenLoaiCong;
        this.heSoCong = heSoCong;
    }
    public String getMaLoaicong() {
        return maLoaiCong;
    }
    public void setMaLoaicong(String maLoaiCong) {
        this.maLoaiCong = maLoaiCong;
    }
    public String getTenLoaiCong() {
        return tenLoaiCong;
    }
    public void setTenLoaiCong(String tenLoaiCong) {
        this.tenLoaiCong = tenLoaiCong;
    }
    public float getHeSoCong() {
        return heSoCong;
    }
    public void setHeSoCong(float heSoCong) {
        this.heSoCong = heSoCong;
    }
    @Override
    public String toString() {
        return "LoaiCong [maLoaicong=" + maLoaiCong + ", tenLoaiCong=" + tenLoaiCong + ", heSoCong=" + heSoCong + "]";
    } 

    
}
