package com.hangnt169.it17203.B2_RequestMapping.controller;

import com.hangnt169.it17203.B2_RequestMapping.model.SinhVien;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class SinhVienController {

    @GetMapping("/hien-thi-tat-ca")
    public List<SinhVien> getAll() {
        List<SinhVien> listSinhVien = new ArrayList<>();
        listSinhVien.add(new SinhVien("hangnt169", "Nguyễn Thuý Hằng", 10));
        listSinhVien.add(new SinhVien("nguyenvv4", "Vũ Văn Nguyên", 101));
        listSinhVien.add(new SinhVien("phongtt35", "Trần Tuấn Phong", 102));
        listSinhVien.add(new SinhVien("khanhpg", "Phạm Gia Khánh", 104));
        listSinhVien.add(new SinhVien("dungna29", "Nguyễn Anh Dũng", 105));
        listSinhVien.add(new SinhVien("tiennh21", "Nguyễn Hoàng Tiến", 107));
        return listSinhVien;
    }
}
