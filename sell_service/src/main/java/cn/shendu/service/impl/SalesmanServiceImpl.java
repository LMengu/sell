package cn.shendu.service.impl;

import cn.shendu.dao.SalesmanDao;
import cn.shendu.domain.Hospital;
import cn.shendu.domain.Salesman;
import cn.shendu.service.SalesmanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class SalesmanServiceImpl implements SalesmanService {

    @Autowired
    private SalesmanDao salesmanDao;

    @Override
    public List<Salesman> findAll() throws Exception {
        return salesmanDao.findAll();
    }

    @Override
    public Salesman findById(Integer id) throws Exception{
        return salesmanDao.findById(id);
    }

    @Override
    public List<Hospital> findOtherHospital(Integer salesmanid) throws Exception {
        return salesmanDao.findOtherHospital(salesmanid);
    }

    @Override
    public void addHospitalToSalesman(Integer salesmanId, Integer[] hospitalIds){
        for (Integer hospitalId : hospitalIds) {
        salesmanDao.addHosToSales(salesmanId,hospitalId);
        }
    }
}
