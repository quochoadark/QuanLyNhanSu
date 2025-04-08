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

import com.example.demo.domain.PhongBan;
import com.example.demo.service.PhongBanService;



@Controller
public class PhongBanController {
    
    private final PhongBanService PhongBanService;
    public PhongBanController(PhongBanService PhongBanService) {
        this.PhongBanService = PhongBanService;
    }   
    
    @RequestMapping("/admin/phongban")
    public String getPhongBanPage(Model model) {    
        List<PhongBan> PhongBans = this.PhongBanService.getAllPhongBans();
        model.addAttribute("PhongBan1", PhongBans);
        // Đường dẫn đến thư mục đến file
        return "admin/phongban/table-phongban";
    }
    // Xem thông tin nhân viên
    @RequestMapping("/admin/xemphongban")
    public String XemPhongBan(Model model) {    
        List<PhongBan> PhongBans = this.PhongBanService.getAllPhongBans();
        model.addAttribute("PhongBan1", PhongBans);
        // Đường dẫn đến thư mục đến file
        return "client/xemphongban";
    }
    @RequestMapping("/admin/phongban/create")
    public String getCreatePhongBanPage(Model model) {
        model.addAttribute("newPhongBan", new PhongBan());
        // Đường dẫn đến thư mục đến file
        return "admin/phongban/create";
    }

    @RequestMapping(value = "/admin/phongban/create", method = RequestMethod.POST)
    public String createPhongBanPage(Model model, @ModelAttribute("newPhongBan") PhongBan hoidanit) {   
        this.PhongBanService.handleSavePhongBan(hoidanit);
        return "redirect:/admin/phongban";
    } 

    // Xem chi tiết PhongBan
    @RequestMapping("/admin/phongban/{id}")
    public String getPhongBanDetailPage(Model model, @PathVariable long id) {   
        PhongBan PhongBan = this.PhongBanService.getPhongBanById(id);
        model.addAttribute("PhongBan", PhongBan);
        model.addAttribute("id", id);
        return "admin/phongban/show";
    }
    // Update PhongBan 
    @RequestMapping("/admin/phongban/update/{id}")
    public String getUpdatePhongBanlPage(Model model, @PathVariable long id) {   
        PhongBan currentPhongBan = this.PhongBanService.getPhongBanById(id);
        model.addAttribute("newPhongBan", currentPhongBan);
        return "admin/phongban/update";
    }
    // PostMapping có nghĩa là đường link url này ứng với method post 
    @PostMapping("/admin/phongban/update")
    public String postUpdatePhongBan(Model model, @ModelAttribute("newPhongBan") PhongBan hoidanit) {   
        PhongBan currentPhongBan = this.PhongBanService.getPhongBanById(hoidanit.getId());
        if (currentPhongBan != null) {
            currentPhongBan.setMaPhongBan(hoidanit.getMaPhongBan());
            currentPhongBan.setTenPhongBan(hoidanit.getTenPhongBan());
            currentPhongBan.setMoTa(hoidanit.getMoTa());
            currentPhongBan.setNguoiTao(hoidanit.getNguoiTao());
            currentPhongBan.setNgayTao(hoidanit.getNgayTao());
            this.PhongBanService.handleSavePhongBan(currentPhongBan);
        }
        return "redirect:/admin/phongban";
    }

    // Delete PhongBan 
    @GetMapping("/admin/phongban/delete/{id}")
    public String getDeletePhongBanPage(Model model, @PathVariable long id) {
        model.addAttribute("id", id);
        // PhongBan PhongBan = new PhongBan();
        // PhongBan.setId(id);
        model.addAttribute("newPhongBan", new PhongBan());
        return "admin/phongban/delete";
    }
    @PostMapping("/admin/phongban/delete")
    public String postDeletePhongBan(Model model, @ModelAttribute("newPhongBan") PhongBan eric) {
        this.PhongBanService.deleteAPhongBan(eric.getId());
        return "redirect:/admin/phongban";
    }
}


