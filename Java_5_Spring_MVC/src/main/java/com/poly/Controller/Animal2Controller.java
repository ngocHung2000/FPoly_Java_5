package com.poly.Controller;

import com.poly.Model.Animal2;
import com.poly.Service.Animal2Service;
import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/Animal2/")
public class Animal2Controller {
    Animal2Service _a2s;

    public Animal2Controller() {

        this._a2s = new Animal2Service();

    }

    @GetMapping("show")
    public String show(Model m){
        m.addAttribute("obj",new Animal2());
        m.addAttribute("lst",_a2s.getLst());
        System.out.println("hehe");
        return "Luyen_Tap/index";
    }

    @GetMapping("remove/{key}")
    public String remove(@PathVariable(name = "key") String key,Model m){
        m.addAttribute("obj",new Animal2());
        _a2s.delete(key);

        m.addAttribute("lst",_a2s.getLst());

        return "Luyen_Tap/index";
    }

    @PostMapping("add")
    public String add(@Valid@ModelAttribute("obj") Animal2 data,Model m, BindingResult result){
        m.addAttribute("obj",new Animal2());

        if (result.hasErrors()) return "Luyen_Tap/index";
        _a2s.add(data);

        return "redirect:/Animal2/show";
    }
}
