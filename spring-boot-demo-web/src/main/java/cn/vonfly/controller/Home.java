package cn.vonfly.controller;

import cn.vonfly.mapper.TestMapperDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Home {
    @Autowired
    private TestMapperDao testMapperDao;
    @RequestMapping("/home")
    public String home(Model model){
        model.addAttribute("name",testMapperDao.queryNameById(1l));
        return "index";
    }
}
