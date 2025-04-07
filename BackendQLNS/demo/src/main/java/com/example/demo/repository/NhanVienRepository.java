package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.domain.NhanVien;

// Khi bấm vào create trên web nó sẽ hiện lên trong database 
@Repository
public interface NhanVienRepository extends JpaRepository<NhanVien,Long> {
     // Khi chạy người dùng create dữ liệu sẽ vào chỗ này 
    NhanVien save(NhanVien eric);
    List<NhanVien> findAll();
    NhanVien findById(long id); // null
    void deleteById(long id);
}

