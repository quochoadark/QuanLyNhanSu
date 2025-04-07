package com.example.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.domain.KyLuat;
import com.example.demo.repository.KyLuatRepository;

@Service
public class KyLuatService {

    private final KyLuatRepository KyLuatRepository;

    public KyLuatService(KyLuatRepository KyLuatRepository) {
        this.KyLuatRepository = KyLuatRepository;
    }

    // Hàm lấy ra danh sách tất cả KyLuats
    public List<KyLuat> getAllKyLuats(){
        return this.KyLuatRepository.findAll();       
    }
    
    // Hàm lưu thông tin KyLuat
    public KyLuat handleSaveKyLuat(KyLuat KyLuat){
        KyLuat eric =  this.KyLuatRepository.save(KyLuat);
        System.out.println(eric);
        return eric;
    }

    
    public KyLuat getKyLuatById(long id) {
        return this.KyLuatRepository.findById(id);
    }

    public void deleteAKyLuat(long id) {
        this.KyLuatRepository.deleteById(id);
    }
}
