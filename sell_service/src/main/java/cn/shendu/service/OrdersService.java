package cn.shendu.service;

import cn.shendu.domain.Orders;

import java.util.List;

public interface OrdersService {
    public List<Orders> findAll()throws Exception;
}
