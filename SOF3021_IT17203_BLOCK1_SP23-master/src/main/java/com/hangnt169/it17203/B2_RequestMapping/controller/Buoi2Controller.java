package com.hangnt169.it17203.B2_RequestMapping.controller;

import com.hangnt169.it17203.B2_RequestMapping.model.SinhVien;
import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@Controller
public class Buoi2Controller {

    private List<SinhVien> sinhViens = new ArrayList<>();

    @GetMapping("/sinh-vien/hien-thi")
    public String hienThiDanhSachSinhVien(Model model) {

        if (sinhViens.isEmpty()) {
            sinhViens.add(new SinhVien("hangnt169", "Nguyen Thuy Hang", 10));
            sinhViens.add(new SinhVien("phongtt35", "Nguyen Thuy Hang1", 13));
            sinhViens.add(new SinhVien("nguyenvv4", "Nguyen Thuy Hang2", 15));
            sinhViens.add(new SinhVien("tiennh21", "Nguyen Thuy Hang3", 16));
            sinhViens.add(new SinhVien("dungna29", "Nguyen Thuy Hang4", 9));
            sinhViens.add(new SinhVien("khanhpg", "Nguyen Thuy Hang5", 7));
        }
        model.addAttribute("sinhViens", sinhViens);
        return "buoi3/buoi2";
    }

    @GetMapping("/sinh-vien/detail/{maSinhVien}")
    public String detailSinhVien(@PathVariable("maSinhVien") String ma, Model model) {
        for (SinhVien sv : sinhViens) {
            if (sv.getMa().equals(ma)) {
                model.addAttribute("sinhVien", sv);
            }
        }
        return "buoi3/detailSinhVien";
    }

    @GetMapping("/sinh-vien/delete/{maSinhVien}")
    public String deleteSinhVien(@PathVariable("maSinhVien") String ma) {
        for (SinhVien sv : sinhViens) {
            if (sv.getMa().equals(ma)) {
                sinhViens.remove(sv);
                break;
            }
        }
        return "redirect:/sinh-vien/hien-thi";
    }

    @GetMapping("/sinh-vien/search")
    public String searchSinhVien(@RequestParam(name = "ten1", required = false, defaultValue = "") String ten, Model model) {
        List<SinhVien> list = new ArrayList<>();
        for (SinhVien sv : sinhViens) {
            if (sv.getTen().contains(ten)) {
                list.add(sv);
            }
        }
        model.addAttribute("sinhViens", list);
        return "buoi3/buoi2";
    }

    @GetMapping("/sinh-vien/view-add")
    public String viewAdd(Model model) {
        // tao 1 contrutor khong tham so de truyen sang jsp
        model.addAttribute("sv1", new SinhVien());
        return "buoi3/addStudent";
    }

    //    @PostMapping("/sinh-vien/add")
//    public String addSinhVien(@RequestParam("ma") String ma, @RequestParam("ten") String ten, @RequestParam("tuoi") String tuoi, Model model) {
//        SinhVien sinhVien = new SinhVien(ma,ten,Integer.valueOf(tuoi));
//        listSinhVien.add(sinhVien);
//        model.addAttribute("sinhViens", listSinhVien);
//        return "buoi2/listSinhVien";
//    }
    @PostMapping("/sinh-vien/add")
    public String addStudent(@Valid @ModelAttribute("sv1") SinhVien sinhVien, BindingResult result) {
        if (result.hasErrors()) {
            return "buoi3/addStudent";
        }
        // add
        sinhViens.add(sinhVien);
        // chuyen ve trang chu
        return "redirect:/sinh-vien/hien-thi";
    }

    @ResponseBody
    @GetMapping("/sinh-vien/all")
    public List<SinhVien> getAll() {
        sinhViens.add(new SinhVien("hangnt169", "Nguyễn Thuý Hằng", 10));
        sinhViens.add(new SinhVien("nguyenvv4", "Vũ Văn Nguyên", 101));
        sinhViens.add(new SinhVien("phongtt35", "Trần Tuấn Phong", 102));
        sinhViens.add(new SinhVien("khanhpg", "Phạm Gia Khánh", 104));
        sinhViens.add(new SinhVien("dungna29", "Nguyễn Anh Dũng", 105));
        sinhViens.add(new SinhVien("tiennh21", "Nguyễn Hoàng Tiến", 107));
        return sinhViens;
    }
}
