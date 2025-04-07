package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.domain.ChucVu;

// Khi bấm vào create trên web nó sẽ hiện lên trong database 
@Repository
public interface ChucVuRepository extends JpaRepository<ChucVu,Long> {
     // Khi chạy người dùng create dữ liệu sẽ vào chỗ này 
    ChucVu save(ChucVu eric);
    List<ChucVu> findAll();
    ChucVu findById(long id); // null
    void deleteById(long id);
}

