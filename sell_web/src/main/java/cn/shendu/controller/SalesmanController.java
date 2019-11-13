package cn.shendu.controller;

import cn.shendu.domain.Hospital;
import cn.shendu.domain.Salesman;
import cn.shendu.service.SalesmanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/sales")
public class SalesmanController {

    @Autowired
    private SalesmanService salesmanService;

    //给销售添加医院
    @RequestMapping("/addHospitalToSalesman.do")
    public String addHospitalToSalesman(@RequestParam(name = "salesmanId",required = true )Integer salesmanId,@RequestParam(name = "ids",required = true)Integer[] hospitalIds)throws Exception{
        salesmanService.addHospitalToSalesman(salesmanId,hospitalIds);
        return "redirect:findAll.do";
    }

    //查询指定id销售员
    @RequestMapping("/findById.do")
    public ModelAndView findById(Integer id)throws Exception{
        ModelAndView mv = new ModelAndView();
        Salesman salesman = salesmanService.findById(id);
        mv.addObject("sales",salesman);
        mv.setViewName("sales-show");
        return mv;
    }
    @RequestMapping("/findAll.do")
    public ModelAndView findAll()throws Exception{
        ModelAndView mv = new ModelAndView();
        List<Salesman> salesmanList= salesmanService.findAll();
        mv.addObject("salesmanList",salesmanList);
        mv.setViewName("salesman-list");
        return mv;
    }
    //查询用户及用户可以添加的角色
    @RequestMapping("/findSaleByIdAndAllHos.do")
    public ModelAndView findUserByIdAndAllRole(@RequestParam(name = "id",required = true) Integer salesmanid)throws Exception{
        ModelAndView mv = new ModelAndView();
        //1.根据用户id查询用户
        Salesman salesman = salesmanService.findById(salesmanid);
        //2.根据用户id查询可以添加的角色
        List<Hospital> otherHospital = salesmanService.findOtherHospital(salesmanid);
        mv.addObject("salesman", salesman);
        mv.addObject("hospitalList", otherHospital);
        mv.setViewName("salesman-hospital-add");
        return mv;
    }
}
