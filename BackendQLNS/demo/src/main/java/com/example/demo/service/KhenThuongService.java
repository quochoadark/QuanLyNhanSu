package com.example.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.domain.KhenThuong;
import com.example.demo.repository.KhenThuongRepository;

@Service
public class KhenThuongService {

    private final KhenThuongRepository KhenThuongRepository;

    public KhenThuongService(KhenThuongRepository KhenThuongRepository) {
        this.KhenThuongRepository = KhenThuongRepository;
    }

    // Hàm lấy ra danh sách tất cả KhenThuongs
    public List<KhenThuong> getAllKhenThuongs(){
        return this.KhenThuongRepository.findAll();       
    }
    
    // Hàm lưu thông tin KhenThuong
    public KhenThuong handleSaveKhenThuong(KhenThuong KhenThuong){
        KhenThuong eric =  this.KhenThuongRepository.save(KhenThuong);
        System.out.println(eric);
        return eric;
    }

    
    public KhenThuong getKhenThuongById(long id) {
        return this.KhenThuongRepository.findById(id);
    }

    public void deleteAKhenThuong(long id) {
        this.KhenThuongRepository.deleteById(id);
    }
}
