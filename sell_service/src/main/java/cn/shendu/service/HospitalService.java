package cn.shendu.service;

import cn.shendu.domain.Hospital;
import cn.shendu.domain.Orders;
import cn.shendu.domain.Patient;

import java.util.List;


public interface HospitalService {

    public List<Hospital> findAll()throws Exception;


    Hospital findById(Integer id)throws Exception;

    List<Patient> findOtherPatient(Integer hospitalid)throws Exception;

    void addPatientToHospital(Integer hospitalId, Integer[] patientIds);

    List<Orders> findOtherOrders(Integer hospitalid)throws Exception;

    void addOrdersToHospital(Integer hospitalId, Integer[] ordersIds);
}
