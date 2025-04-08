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

import com.example.demo.domain.ChuyenMon;
import com.example.demo.service.ChuyenMonService;

@Controller
public class ChuyenMonController {

    private final ChuyenMonService ChuyenMonService;

    public ChuyenMonController(ChuyenMonService ChuyenMonService) {
        this.ChuyenMonService = ChuyenMonService;
    }

    @RequestMapping("/admin/chuyenmon")
    public String getChuyenMonPage(Model model) {
        List<ChuyenMon> ChuyenMons = this.ChuyenMonService.getAllChuyenMons();
        model.addAttribute("ChuyenMon1", ChuyenMons);
        // Đường dẫn đến thư mục đến file
        return "admin/chuyenmon/table-chuyenmon";
    }

    // Xem thông tin nhân viên
    @RequestMapping("/admin/xemchuyenmon")
    public String XemChuyenMon(Model model) {
        List<ChuyenMon> ChuyenMons = this.ChuyenMonService.getAllChuyenMons();
        model.addAttribute("ChuyenMon1", ChuyenMons);
        // Đường dẫn đến thư mục đến file
        return "client/xemchuyenmon";
    }

    @RequestMapping("/admin/chuyenmon/create")
    public String getCreateChuyenMonPage(Model model) {
        model.addAttribute("newChuyenMon", new ChuyenMon());
        // Đường dẫn đến thư mục đến file
        return "admin/chuyenmon/create";
    }

    @RequestMapping(value = "/admin/chuyenmon/create", method = RequestMethod.POST)
    public String createChuyenMonPage(Model model, @ModelAttribute("newChuyenMon") ChuyenMon hoidanit) {
        this.ChuyenMonService.handleSaveChuyenMon(hoidanit);
        return "redirect:/admin/chuyenmon";
    }

    // Xem chi tiết ChuyenMon
    @RequestMapping("/admin/chuyenmon/{id}")
    public String getChuyenMonDetailPage(Model model, @PathVariable long id) {
        ChuyenMon ChuyenMon = this.ChuyenMonService.getChuyenMonById(id);
        model.addAttribute("ChuyenMon", ChuyenMon);
        model.addAttribute("id", id);
        return "admin/chuyenmon/show";
    }

    // Update ChuyenMon 
    @RequestMapping("/admin/chuyenmon/update/{id}")
    public String getUpdateChuyenMonlPage(Model model, @PathVariable long id) {
        ChuyenMon currentChuyenMon = this.ChuyenMonService.getChuyenMonById(id);
        model.addAttribute("newChuyenMon", currentChuyenMon);
        return "admin/chuyenmon/update";
    }

    // PostMapping có nghĩa là đường link url này ứng với method post 
    @PostMapping("/admin/chuyenmon/update")
    public String postUpdateChuyenMon(Model model, @ModelAttribute("newChuyenMon") ChuyenMon hoidanit) {
        ChuyenMon currentChuyenMon = this.ChuyenMonService.getChuyenMonById(hoidanit.getId());
        if (currentChuyenMon != null) {
            currentChuyenMon.setMaChuyenMon(hoidanit.getMaChuyenMon());
            currentChuyenMon.setTenChuyenMon(hoidanit.getTenChuyenMon());
            currentChuyenMon.setMoTa(hoidanit.getMoTa());
            currentChuyenMon.setNguoiTao(hoidanit.getNguoiTao());
            currentChuyenMon.setNgayTao(hoidanit.getNgayTao());
            this.ChuyenMonService.handleSaveChuyenMon(currentChuyenMon);
        }
        return "redirect:/admin/chuyenmon";
    }

    // Delete ChuyenMon 
    @GetMapping("/admin/chuyenmon/delete/{id}")
    public String getDeleteChuyenMonPage(Model model, @PathVariable long id) {
        model.addAttribute("id", id);
        // ChuyenMon ChuyenMon = new ChuyenMon();
        // ChuyenMon.setId(id);
        model.addAttribute("newChuyenMon", new ChuyenMon());
        return "admin/chuyenmon/delete";
    }

    @PostMapping("/admin/chuyenmon/delete")
    public String postDeleteChuyenMon(Model model, @ModelAttribute("newChuyenMon") ChuyenMon eric) {
        this.ChuyenMonService.deleteAChuyenMon(eric.getId());
        return "redirect:/admin/chuyenmon";
    }
}
