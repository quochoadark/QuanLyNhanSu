package com.example.demo.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.demo.domain.NhanVien;
import com.example.demo.service.NhanVienService;



@Controller
public class NhanVienController {
    
    private final NhanVienService nhanvienService;
    public NhanVienController(NhanVienService nhanvienService) {
        this.nhanvienService = nhanvienService;
    }   
    @RequestMapping("/")
    public String getHomePage(Model model){   // Model là 1 thư viện 
        List <NhanVien> arrnhanviens = this.nhanvienService.getAllNhanviens();
        System.out.println(arrnhanviens);
        model.addAttribute("eric","test");   // addAttribute (khởi tạo biến, nội dung hoặc hàm)
        model.addAttribute("hoidanit","from controller with model");
        return "hello";
    }
    
    @RequestMapping("/admin/nhanvien")
    public String getnhanvienPage(Model model) {    
        List<NhanVien> nhanviens = this.nhanvienService.getAllNhanviens();
        model.addAttribute("nhanvien1", nhanviens);
        // Đường dẫn đến thư mục đến file
        return "admin/nhanvien/table-nhanvien";
    }
    // Xem thông tin nhân viên
    @RequestMapping("/admin/xemnhanvien")
    public String XemNhanVien(Model model) {    
        List<NhanVien> nhanviens = this.nhanvienService.getAllNhanviens();
        model.addAttribute("nhanvien1", nhanviens);
        // Đường dẫn đến thư mục đến file
        return "client/xemnhanvien";
    }
    @RequestMapping("/admin/nhanvien/create")
    public String getCreatenhanvienPage(Model model) {
        model.addAttribute("newNhanvien", new NhanVien());
        // Đường dẫn đến thư mục đến file
        return "admin/nhanvien/create";
    }

    @RequestMapping(value = "/admin/nhanvien/create", method = RequestMethod.POST)
    public String createnhanvienPage(Model model, @ModelAttribute("newNhanvien") NhanVien hoidanit) {   
        this.nhanvienService.handleSaveNhanvien(hoidanit);
        return "redirect:/admin/nhanvien";
    } 

    // Xem chi tiết nhanvien
    @RequestMapping("/admin/nhanvien/{id}")
    public String getnhanvienDetailPage(Model model, @PathVariable long id) {   
        NhanVien nhanvien = this.nhanvienService.getNhanvienById(id);
        model.addAttribute("nhanvien", nhanvien);
        model.addAttribute("id", id);
        return "admin/nhanvien/show";
    }
    // Update nhanvien 
    @RequestMapping("/admin/nhanvien/update/{id}")
    public String getUpdatenhanvienlPage(Model model, @PathVariable long id) {   
        NhanVien currentnhanvien = this.nhanvienService.getNhanvienById(id);
        model.addAttribute("newNhanvien", currentnhanvien);
        return "admin/nhanvien/update";
    }
    // PostMapping có nghĩa là đường link url này ứng với method post 
    @PostMapping("/admin/nhanvien/update")
    public String postUpdatenhanvien(Model model, @ModelAttribute("newNhanvien") NhanVien hoidanit) {   
        NhanVien currentnhanvien = this.nhanvienService.getNhanvienById(hoidanit.getId());
        if (currentnhanvien != null) {
            currentnhanvien.setMaNhanVien(hoidanit.getMaNhanVien());
            currentnhanvien.setHo(hoidanit.getHo());
            currentnhanvien.setTen(hoidanit.getTen());
            currentnhanvien.setGioiTinh(hoidanit.getGioiTinh());
            currentnhanvien.setDienThoai(hoidanit.getDienThoai());
            currentnhanvien.setDiaChi(hoidanit.getDiaChi());
            currentnhanvien.setDanToc(hoidanit.getDanToc());
            currentnhanvien.setQueQuan(hoidanit.getQueQuan());
            this.nhanvienService.handleSaveNhanvien(currentnhanvien);
        }
        return "redirect:/admin/nhanvien";
    }

    // Delete nhanvien 
    @GetMapping("/admin/nhanvien/delete/{id}")
    public String getDeletenhanvienPage(Model model, @PathVariable long id) {
        model.addAttribute("id", id);
        // nhanvien nhanvien = new nhanvien();
        // nhanvien.setId(id);
        model.addAttribute("newNhanvien", new NhanVien());
        return "admin/nhanvien/delete";
    }
    @PostMapping("/admin/nhanvien/delete")
    public String postDeletenhanvien(Model model, @ModelAttribute("newNhanvien") NhanVien eric) {
        this.nhanvienService.deleteANhanvien(eric.getId());
        return "redirect:/admin/nhanvien";
    }
}


