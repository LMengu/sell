package cn.shendu.controller;

import cn.shendu.domain.Salesman;
import cn.shendu.service.SalesmanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/sales")
public class SalesmanController {

    @Autowired
    private SalesmanService salesmanService;

    @RequestMapping("/findAll.do")
    public ModelAndView findAll()throws Exception{
        ModelAndView mv = new ModelAndView();
        List<Salesman> salesmanList= salesmanService.findAll();
        mv.addObject("salesmanList",salesmanList);
        mv.setViewName("salesman-list");

        return mv;
    }
}
