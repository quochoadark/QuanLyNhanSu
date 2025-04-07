package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.domain.ChuyenMon;

// Khi bấm vào create trên web nó sẽ hiện lên trong database 
@Repository
public interface ChuyenMonRepository extends JpaRepository<ChuyenMon,Long> {
     // Khi chạy người dùng create dữ liệu sẽ vào chỗ này 
    ChuyenMon save(ChuyenMon eric);
    List<ChuyenMon> findAll();
    ChuyenMon findById(long id); // null
    void deleteById(long id);
}

