package cn.shendu.controller;

import cn.shendu.domain.Hospital;
import cn.shendu.service.HospitalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;


@Controller
@RequestMapping("/hospital")
public class HospitalController {
    @Autowired
    private HospitalService hospitalService;
    @RequestMapping("/findAll.do")
    public ModelAndView findAll()throws Exception{
        ModelAndView mv = new ModelAndView();
        List<Hospital> hospital = hospitalService.findAll();
        mv.addObject("HospitalList",hospital);
        mv.setViewName("hospital-list");
        return mv;
    }

}
