package cn.shendu.service;

import cn.shendu.domain.Salesman;

import java.util.List;

public interface SalesmanService {
    List<Salesman> findAll()throws Exception;
}
