package com.poly.Controller;

import com.poly.Model.Animal;
import com.poly.Service.AnimalService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class CRUD {

    public AnimalService _as;

    public CRUD() {
        _as = new AnimalService();
    }
    @GetMapping("/dong-vat/hien-thi")
    public String showView(Model m){
        m.addAttribute("lst",_as.getLst());
       return "B1_CRUD/index";
    }

     @PostMapping("/dong-vat/them")
    public String add(@RequestParam(name="ma")String ma,
                      @RequestParam(name="ten")String ten,
                      @RequestParam(name="canNang")String canNang,
                      Model m){
        _as.add(new Animal(ma,ten,Float.parseFloat(canNang)));

        m.addAttribute("lst",_as.getLst());

        return "redirect:/dong-vat/hien-thi";
    }

    @PostMapping("/dong-vat/update")
    public String update(@RequestParam(name="ma")String ma,
                      @RequestParam(name="ten")String ten,
                      @RequestParam(name="canNang")String canNang,
                      Model m){
        _as.update(new Animal(ma,ten,Float.parseFloat(canNang)));

        m.addAttribute("lst",_as.getLst());

        return "redirect:/dong-vat/hien-thi";
    }

    @GetMapping("/dong-vat/remove/{key}")
    public String remove(@PathVariable(name = "key") String key,Model m){

        _as.delete(key);

        m.addAttribute("lst",_as.getLst());

        return "B1_CRUD/index";
    }

    @GetMapping("/dong-vat/detail/{x}")
    public String detail(@PathVariable(name = "x")String x,Model m){

        Animal a = _as.findByMa(x);

        m.addAttribute("ma",a.getMa());
        m.addAttribute("ten",a.getTen());
        m.addAttribute("canNang",a.getCanNang());

        m.addAttribute("lst",_as.getLst());
        return "B1_CRUD/index";
    }

    @PostMapping("/dong-vat/find")
    public String find(@RequestParam(name="min") String min,
                       @RequestParam(name="max") String max,
                       Model m){

        m.addAttribute("lst",_as.find(Float.parseFloat(min),Float.parseFloat(max)));

        return "B1_CRUD/index";
    }
}
