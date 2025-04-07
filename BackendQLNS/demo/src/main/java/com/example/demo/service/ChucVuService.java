package com.example.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.domain.ChucVu;
import com.example.demo.repository.ChucVuRepository;

@Service
public class ChucVuService {

    private final ChucVuRepository ChucVuRepository;

    public ChucVuService(ChucVuRepository ChucVuRepository) {
        this.ChucVuRepository = ChucVuRepository;
    }

    // Hàm lấy ra danh sách tất cả ChucVus
    public List<ChucVu> getAllChucVus(){
        return this.ChucVuRepository.findAll();       
    }
    
    // Hàm lưu thông tin ChucVu
    public ChucVu handleSaveChucVu(ChucVu ChucVu){
        ChucVu eric =  this.ChucVuRepository.save(ChucVu);
        System.out.println(eric);
        return eric;
    }

    
    public ChucVu getChucVuById(long id) {
        return this.ChucVuRepository.findById(id);
    }

    public void deleteAChucVu(long id) {
        this.ChucVuRepository.deleteById(id);
    }
}
