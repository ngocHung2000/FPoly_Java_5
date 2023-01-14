package com.poly.Controller;

import com.poly.Service.StudentService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class StudentController {

    public StudentService _ss;

    public StudentController() {
        _ss = new StudentService();
    }

    @GetMapping("/show-student")
    public String view(Model m){

        m.addAttribute("lst",_ss.getLst());

        return "B2_Student/index";
    }

    @PostMapping("/add-student")
    public String add(Model m){



        return "redirect:/show-student";
    }
}
