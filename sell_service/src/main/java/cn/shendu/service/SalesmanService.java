package cn.shendu.service;

import cn.shendu.domain.Hospital;
import cn.shendu.domain.Salesman;

import java.util.List;

public interface SalesmanService {
    List<Salesman> findAll()throws Exception;

    Salesman findById(Integer id)throws Exception;

    List<Hospital> findOtherHospital(Integer salesmanid)throws Exception;

    void addHospitalToSalesman(Integer salesmanId, Integer[] hospitalIds);
}
