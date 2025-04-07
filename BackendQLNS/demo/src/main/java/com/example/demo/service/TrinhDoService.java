package com.example.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.domain.TrinhDo;
import com.example.demo.repository.TrinhDoRepository;

@Service
public class TrinhDoService {

    private final TrinhDoRepository TrinhDoRepository;

    public TrinhDoService(TrinhDoRepository TrinhDoRepository) {
        this.TrinhDoRepository = TrinhDoRepository;
    }

    // Hàm lấy ra danh sách tất cả TrinhDos
    public List<TrinhDo> getAllTrinhDos(){
        return this.TrinhDoRepository.findAll();       
    }
    
    // Hàm lưu thông tin TrinhDo
    public TrinhDo handleSaveTrinhDo(TrinhDo TrinhDo){
        TrinhDo eric =  this.TrinhDoRepository.save(TrinhDo);
        System.out.println(eric);
        return eric;
    }

    
    public TrinhDo getTrinhDoById(long id) {
        return this.TrinhDoRepository.findById(id);
    }

    public void deleteATrinhDo(long id) {
        this.TrinhDoRepository.deleteById(id);
    }
}
