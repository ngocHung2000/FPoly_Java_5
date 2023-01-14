package com.example.luyentap.Controller;

import com.example.luyentap.Model.Info;
import com.example.luyentap.Service.InfoService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class InfoController {

    InfoService _is;

    public InfoController() {
        _is = new InfoService();
    }

    @GetMapping("/info/show")
    public String show(Model m) {
        m.addAttribute("obj", new Info());
        m.addAttribute("lst", _is.getLst());

        return "index";
    }

    @GetMapping("/info/remove/{key}")
    public String remove(@PathVariable String key, Model m) {
        m.addAttribute("obj", new Info());
        _is.delete(key);

        m.addAttribute("lst", _is.getLst());

        return "index";
    }

    @GetMapping("/info/detail/{key}")
    public String detail(@PathVariable String key, Model m) {
        m.addAttribute("obj", new Info());
        m.addAttribute("a", _is.findByName(key));
        m.addAttribute("lst", _is.getLst());
        return "index";
    }

    @PostMapping("/info/add")
    public String add(@ModelAttribute("obj") Info data, Model m) {
        m.addAttribute("obj", new Info());

        _is.add(data);
        m.addAttribute("lst", _is.getLst());
        return "redirect:/info/show";
    }

    @PostMapping("/info/update")
    public String update(@ModelAttribute("obj") Info data, Model m) {
        m.addAttribute("obj", new Info());

        _is.update(data);

        m.addAttribute("lst", _is.getLst());
        return "redirect:/info/show";
    }
}
//    @GetMapping("/info/find")
//    public String find(@RequestParam(name = "ten") String a,
//                       @RequestParam(name = "tuoi") String b,
//                       @RequestParam(name = "kv") String c,
//                       Model m){
//
//        if(a!=null){
//            m.addAttribute("lst",_is.find(a,0));
//        }if(b!=null){
//            m.addAttribute("lst",_is.find(b,1));
//        }if(c!=null){
//            m.addAttribute("lst",_is.find(c,12));
//        }
//        return "index";
//    }
//}
