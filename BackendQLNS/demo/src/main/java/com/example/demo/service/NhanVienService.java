package com.example.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.domain.NhanVien;
import com.example.demo.repository.NhanVienRepository;

@Service
public class NhanVienService {

    private final NhanVienRepository nhanvienRepository;

    public NhanVienService(NhanVienRepository nhanvienRepository) {
        this.nhanvienRepository = nhanvienRepository;
    }

    // Hàm lấy ra danh sách tất cả nhanviens
    public List<NhanVien> getAllNhanviens(){
        return this.nhanvienRepository.findAll();       
    }
    
    // Hàm lưu thông tin nhanvien
    public NhanVien handleSaveNhanvien(NhanVien nhanvien){
        NhanVien eric =  this.nhanvienRepository.save(nhanvien);
        System.out.println(eric);
        return eric;
    }

    
    public NhanVien getNhanvienById(long id) {
        return this.nhanvienRepository.findById(id);
    }

    public void deleteANhanvien(long id) {
        this.nhanvienRepository.deleteById(id);
    }
}
