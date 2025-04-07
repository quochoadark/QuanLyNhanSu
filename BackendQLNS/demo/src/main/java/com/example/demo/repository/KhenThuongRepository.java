package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.domain.KhenThuong;

// Khi bấm vào create trên web nó sẽ hiện lên trong database 
@Repository
public interface KhenThuongRepository extends JpaRepository<KhenThuong,Long> {
     // Khi chạy người dùng create dữ liệu sẽ vào chỗ này 
    KhenThuong save(KhenThuong eric);
    List<KhenThuong> findAll();
    KhenThuong findById(long id); // null
    void deleteById(long id);
}

