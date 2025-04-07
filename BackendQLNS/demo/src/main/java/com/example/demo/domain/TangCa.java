package com.example.demo.domain;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class TangCa {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id; 
    private String maTangCa; 
    private LocalDate ngayTangCa;
    private int soGioTangCa; 
     @ManyToOne
    @JoinColumn(name = "maChamCong_id")
    private ChamCong maChamCong;

    public TangCa(){

    }

    public TangCa(long id, String maTangCa, LocalDate ngayTangCa, int soGioTangCa) {
        this.id = id;
        this.maTangCa = maTangCa;
        this.ngayTangCa = ngayTangCa;
        this.soGioTangCa = soGioTangCa;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getMaTangCa() {
        return maTangCa;
    }

    public void setMaTangCa(String maTangCa) {
        this.maTangCa = maTangCa;
    }

    public LocalDate getNgayTangCa() {
        return ngayTangCa;
    }

    public void setNgayTangCa(LocalDate ngayTangCa) {
        this.ngayTangCa = ngayTangCa;
    }

    public int getSoGioTangCa() {
        return soGioTangCa;
    }

    public void setSoGioTangCa(int soGioTangCa) {
        this.soGioTangCa = soGioTangCa;
    }

    public ChamCong getMaChamCong() {
        return maChamCong;
    }

    public void setMaChamCong(ChamCong maChamCong) {
        this.maChamCong = maChamCong;
    }

    @Override
    public String toString() {
        return "TangCa [id=" + id + ", maTangCa=" + maTangCa + ", ngayTangCa=" + ngayTangCa + ", soGioTangCa="
                + soGioTangCa + "]";
    }
    
    
}
