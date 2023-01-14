package com.poly.Controller;

import com.poly.Model.StudentInfo;
import com.poly.Service.StudentInfoService;
import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.naming.Binding;

@Controller
@RequestMapping("/student-info/")
public class StudentInfoController {

    StudentInfoService _sis;

    public StudentInfoController() {
        _sis = new StudentInfoService();
    }

    @GetMapping("/student-info/show")
    public String show(Model m){
        m.addAttribute("lst",_sis.getLst());
        return "B4_StudentInfo/index";
    }

    @PostMapping("/student-info/add")
    public String add(@Valid @ModelAttribute("obj") StudentInfo data, BindingResult result){
        if (result.hasErrors()){
            return "B4_StudentInfo/index";
        }
        _sis.add(new StudentInfo(data.getMa(), data.getTen(), data.getTuoi(), data.getQue()));
        return "redirect:/student-info/show";
    }

//    @PostMapping("/student-info/add")
//    public String findByName(@Valid @ModelAttribute("find") StudentInfo data, BindingResult result){
//        if (result.hasErrors()){
//            return "B4_StudentInfo/index";
//        }
//        _sis.findByName("");
//
//        return "redirect:/student-info/show";
//    }

}
