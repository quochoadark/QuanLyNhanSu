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

import com.example.demo.domain.ChucVu;
import com.example.demo.service.ChucVuService;



@Controller
public class ChucVuController {
    
    private final ChucVuService ChucVuService;
    public ChucVuController(ChucVuService ChucVuService) {
        this.ChucVuService = ChucVuService;
    }   
    
    @RequestMapping("/admin/chucvu")
    public String getChucVuPage(Model model) {    
        List<ChucVu> ChucVus = this.ChucVuService.getAllChucVus();
        model.addAttribute("ChucVu1", ChucVus);
        // Đường dẫn đến thư mục đến file
        return "admin/chucvu/table-chucvu";
    }
    // Xem thông tin nhân viên
    @RequestMapping("/admin/xemchucvu")
    public String XemChucVu(Model model) {    
        List<ChucVu> ChucVus = this.ChucVuService.getAllChucVus();
        model.addAttribute("ChucVu1", ChucVus);
        // Đường dẫn đến thư mục đến file
        return "client/xemchucvu";
    }
    @RequestMapping("/admin/chucvu/create")
    public String getCreateChucVuPage(Model model) {
        model.addAttribute("newChucVu", new ChucVu());
        // Đường dẫn đến thư mục đến file
        return "admin/chucvu/create";
    }

    @RequestMapping(value = "/admin/chucvu/create", method = RequestMethod.POST)
    public String createChucVuPage(Model model, @ModelAttribute("newChucVu") ChucVu hoidanit) {   
        this.ChucVuService.handleSaveChucVu(hoidanit);
        return "redirect:/admin/chucvu";
    } 

    // Xem chi tiết ChucVu
    @RequestMapping("/admin/chucvu/{id}")
    public String getChucVuDetailPage(Model model, @PathVariable long id) {   
        ChucVu ChucVu = this.ChucVuService.getChucVuById(id);
        model.addAttribute("ChucVu", ChucVu);
        model.addAttribute("id", id);
        return "admin/chucvu/show";
    }
    // Update ChucVu 
    @RequestMapping("/admin/chucvu/update/{id}")
    public String getUpdateChucVulPage(Model model, @PathVariable long id) {   
        ChucVu currentChucVu = this.ChucVuService.getChucVuById(id);
        model.addAttribute("newChucVu", currentChucVu);
        return "admin/chucvu/update";
    }
    // PostMapping có nghĩa là đường link url này ứng với method post 
    @PostMapping("/admin/chucvu/update")
    public String postUpdateChucVu(Model model, @ModelAttribute("newChucVu") ChucVu hoidanit) {   
        ChucVu currentChucVu = this.ChucVuService.getChucVuById(hoidanit.getId());
        if (currentChucVu != null) {
            currentChucVu.setMaChucVu(hoidanit.getMaChucVu());
            currentChucVu.setTenChucVu(hoidanit.getTenChucVu());
            currentChucVu.setMoTa(hoidanit.getMoTa());
            currentChucVu.setNguoiTao(hoidanit.getNguoiTao());
            currentChucVu.setNgayTao(hoidanit.getNgayTao());
            this.ChucVuService.handleSaveChucVu(currentChucVu);
        }
        return "redirect:/admin/chucvu";
    }

    // Delete ChucVu 
    @GetMapping("/admin/chucvu/delete/{id}")
    public String getDeleteChucVuPage(Model model, @PathVariable long id) {
        model.addAttribute("id", id);
        // ChucVu ChucVu = new ChucVu();
        // ChucVu.setId(id);
        model.addAttribute("newChucVu", new ChucVu());
        return "admin/chucvu/delete";
    }
    @PostMapping("/admin/chucvu/delete")
    public String postDeleteChucVu(Model model, @ModelAttribute("newChucVu") ChucVu eric) {
        this.ChucVuService.deleteAChucVu(eric.getId());
        return "redirect:/admin/chucvu";
    }
}


