package cn.shendu.controller;

import cn.shendu.domain.Orders;
import cn.shendu.service.OrdersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/order")
public class OrdersController {

    @Autowired
    private OrdersService ordersService;

    @RequestMapping("/findAll.do")
    public ModelAndView findAll() throws Exception{
        ModelAndView mv = new ModelAndView();
        List<Orders> orders = ordersService.findAll();
        mv.addObject("OrdersList",orders);
        mv.setViewName("orders-list");
        return mv;
    }
}
