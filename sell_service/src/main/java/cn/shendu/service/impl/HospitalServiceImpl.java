package cn.shendu.service.impl;

import cn.shendu.dao.HospitalDao;
import cn.shendu.domain.Hospital;
import cn.shendu.domain.Orders;
import cn.shendu.domain.Patient;
import cn.shendu.service.HospitalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class HospitalServiceImpl implements HospitalService {
    @Autowired
    private HospitalDao hospitalDao;
    @Override
    public List<Hospital> findAll() throws Exception {
        return hospitalDao.findAll();
    }

    @Override
    public Hospital findById(Integer id) throws Exception{
        return hospitalDao.findById(id);
    }

    @Override
    public List<Patient> findOtherPatient(Integer hospitalid) throws Exception{
        return hospitalDao.findOtherPatient(hospitalid);
    }

    @Override
    public void addPatientToHospital(Integer hospitalId, Integer[] patientIds){
        for (Integer patientId : patientIds) {
            hospitalDao.addHosToPatient(hospitalId,patientId);
        }
    }

    @Override
    public List<Orders> findOtherOrders(Integer hospitalid) throws Exception {

        return hospitalDao.findOtherOrders(hospitalid);
    }

    @Override
    public void addOrdersToHospital(Integer hospitalId, Integer[] ordersIds) {
        for (Integer ordersId : ordersIds) {
            hospitalDao.addOrdersToHospital(hospitalId,ordersId);
        }
    }
}
