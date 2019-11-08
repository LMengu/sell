package cn.shendu.controller;

import cn.shendu.domain.Patient;
import cn.shendu.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/patient")
public class PatientController {
    @Autowired
    private PatientService patientService;
    @RequestMapping("/findAll.do")
    public ModelAndView findAll()throws Exception{
        ModelAndView mv = new ModelAndView();
        List<Patient> patient = patientService.findAll();
        mv.addObject("PatientList",patient);
        mv.setViewName("patient-list");
        return  mv;
    }


}
