package cn.shendu.controller;

import cn.shendu.domain.Hospital;
import cn.shendu.domain.Orders;
import cn.shendu.domain.Patient;
import cn.shendu.domain.Salesman;
import cn.shendu.service.HospitalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
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
    //给医院添加患者
    @RequestMapping("/addPatientToHospital.do")
    public String addPatientToHospital(@RequestParam(name = "hospitalId",required = true)Integer hospitalId,@RequestParam(name = "ids",required = true)Integer[] patientIds)throws Exception{
        hospitalService.addPatientToHospital(hospitalId,patientIds);
        return "redirect:findAll.do";
    }
    //查询指定的医院
    @RequestMapping("/findById.do")
    public ModelAndView findById(Integer id)throws Exception{
        ModelAndView mv = new ModelAndView();
        Hospital hospital = hospitalService.findById(id);
        mv.addObject("hospital",hospital);
        mv.setViewName("hospital-show");
        return mv;
    }
    //查询医院及医院可以添加的患者
    @RequestMapping("/findHosByIdAndAllPat.do")
    public ModelAndView findHosAndPat(@RequestParam(name = "id",required = true) Integer hospitalid)throws Exception{
        ModelAndView mv = new ModelAndView();
        //根据医院id查询医院
        Hospital hospital = hospitalService.findById(hospitalid);
        //根据医院id查询可以添加的患者信息
        List<Patient> patients = hospitalService.findOtherPatient(hospitalid);
        mv.addObject("hospital",hospital);
        mv.addObject("patientsList",patients);
        mv.setViewName("hospital-patient-add");
        return mv;
    }
    //根据hospitalId查询hospital，并查询可以添加的药品
    @RequestMapping("/findHosByIdAndAllorders.do")
    public ModelAndView findHosByIdAndAllorders(@RequestParam(name = "id",required = true)Integer hospitalid)throws Exception{
        ModelAndView mv = new ModelAndView();
        //根据hospitalId查询hospital
        Hospital hospital = hospitalService.findById(hospitalid);
        //根据医院id查询可以添加的药品信息
        List<Orders> orders = hospitalService.findOtherOrders(hospitalid);
        mv.addObject("hospital",hospital);
        mv.addObject("ordersList",orders);
        mv.setViewName("hospital-orders-add");
        return mv;
    }
    //给医院添加药品
    @RequestMapping("/addOrdersToHospital.do")
    public String addOrdersToHospital(@RequestParam(name = "hospitalId",required = true)Integer hospitalId,@RequestParam(name = "ids",required = true)Integer[] ordersIds)throws Exception{
        hospitalService.addOrdersToHospital(hospitalId,ordersIds);
        return "redirect:findAll.do";
    }
    //查询指定的医院
    @RequestMapping("/findByIds.do")
    public ModelAndView findByIds(Integer id)throws Exception{
        ModelAndView mv = new ModelAndView();
        Hospital hospital = hospitalService.findById(id);
        mv.addObject("hospital",hospital);
        mv.setViewName("hospital-show-orders");
        return mv;
    }
}
