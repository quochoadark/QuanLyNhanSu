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

    public String getMaLoaiCong() {
        return maLoaiCong;
    }

    public void setMaLoaiCong(String maLoaiCong) {
        this.maLoaiCong = maLoaiCong;
    }

    public String getTenLoaiCong() {
        return tenLoaiCong;
    }

    public void setTenLoaiCong(String tenLoaiCong) {
        this.tenLoaiCong = tenLoaiCong;
    }

    public float getHesoCong() {
        return heSoCong;
    }

    public void setHesoCong(float hesoCong) {
        this.heSoCong = hesoCong;
    }

    @Override
    public String toString() {
        return "LoaiCong [maLoaiCong=" + maLoaiCong + ", tenLoaiCong=" + tenLoaiCong + ", hesoCong=" + heSoCong + "]";
    }

}
