package cn.shendu.service.impl;

import cn.shendu.dao.PatientDao;
import cn.shendu.domain.Patient;
import cn.shendu.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
@Transactional
public class PatientServiceImpl implements PatientService {
    @Autowired
    private PatientDao patientDao;
    @Override
    public List<Patient> findAll() throws Exception {
        return patientDao.findAll();
    }
}
