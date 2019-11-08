package cn.shendu.service.impl;

import cn.shendu.dao.HospitalDao;
import cn.shendu.domain.Hospital;
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
}
