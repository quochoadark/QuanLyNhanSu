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

import com.example.demo.domain.BangCap;
import com.example.demo.service.BangCapService;



@Controller
public class BangCapController {
    
    private final BangCapService BangCapService;
    public BangCapController(BangCapService BangCapService) {
        this.BangCapService = BangCapService;
    }   
    
    @RequestMapping("/admin/bangcap")
    public String getBangCapPage(Model model) {    
        List<BangCap> BangCaps = this.BangCapService.getAllBangCaps();
        model.addAttribute("BangCap1", BangCaps);
        // Đường dẫn đến thư mục đến file
        return "admin/bangcap/table-bangcap";
    }
    // Xem thông tin nhân viên
    @RequestMapping("/admin/xembangcap")
    public String XemBangCap(Model model) {    
        List<BangCap> BangCaps = this.BangCapService.getAllBangCaps();
        model.addAttribute("BangCap1", BangCaps);
        // Đường dẫn đến thư mục đến file
        return "client/xembangcap";
    }
    @RequestMapping("/admin/bangcap/create")
    public String getCreateBangCapPage(Model model) {
        model.addAttribute("newBangCap", new BangCap());
        // Đường dẫn đến thư mục đến file
        return "admin/bangcap/create";
    }

    @RequestMapping(value = "/admin/bangcap/create", method = RequestMethod.POST)
    public String createBangCapPage(Model model, @ModelAttribute("newBangCap") BangCap hoidanit) {   
        this.BangCapService.handleSaveBangCap(hoidanit);
        return "redirect:/admin/bangcap";
    } 

    // Xem chi tiết BangCap
    @RequestMapping("/admin/bangcap/{id}")
    public String getBangCapDetailPage(Model model, @PathVariable long id) {   
        BangCap BangCap = this.BangCapService.getBangCapById(id);
        model.addAttribute("BangCap", BangCap);
        model.addAttribute("id", id);
        return "admin/bangcap/show";
    }
    // Update BangCap 
    @RequestMapping("/admin/bangcap/update/{id}")
    public String getUpdateBangCaplPage(Model model, @PathVariable long id) {   
        BangCap currentBangCap = this.BangCapService.getBangCapById(id);
        model.addAttribute("newBangCap", currentBangCap);
        return "admin/bangcap/update";
    }
    // PostMapping có nghĩa là đường link url này ứng với method post 
    @PostMapping("/admin/bangcap/update")
    public String postUpdateBangCap(Model model, @ModelAttribute("newBangCap") BangCap hoidanit) {   
        BangCap currentBangCap = this.BangCapService.getBangCapById(hoidanit.getId());
        if (currentBangCap != null) {
            currentBangCap.setMaBangCap(hoidanit.getMaBangCap());
            currentBangCap.setTenBangCap(hoidanit.getTenBangCap());
            currentBangCap.setMoTa(hoidanit.getMoTa());
            currentBangCap.setNguoiTao(hoidanit.getNguoiTao());
            currentBangCap.setNgayTao(hoidanit.getNgayTao());
            this.BangCapService.handleSaveBangCap(currentBangCap);
        }
        return "redirect:/admin/bangcap";
    }

    // Delete BangCap 
    @GetMapping("/admin/bangcap/delete/{id}")
    public String getDeleteBangCapPage(Model model, @PathVariable long id) {
        model.addAttribute("id", id);
        // BangCap BangCap = new BangCap();
        // BangCap.setId(id);
        model.addAttribute("newBangCap", new BangCap());
        return "admin/bangcap/delete";
    }
    @PostMapping("/admin/bangcap/delete")
    public String postDeleteBangCap(Model model, @ModelAttribute("newBangCap") BangCap eric) {
        this.BangCapService.deleteABangCap(eric.getId());
        return "redirect:/admin/bangcap";
    }
}


