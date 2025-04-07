package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.domain.BangLuong;

// Khi bấm vào create trên web nó sẽ hiện lên trong database 
@Repository
public interface BangLuongRepository extends JpaRepository<BangLuong,Long> {
     // Khi chạy người dùng create dữ liệu sẽ vào chỗ này 
    BangLuong save(BangLuong eric);
    List<BangLuong> findAll();
    BangLuong findById(long id); // null
    void deleteById(long id);
}

