package cn.shendu.service.impl;

import cn.shendu.dao.MedInfDao;
import cn.shendu.domain.MedInformation;
import cn.shendu.service.MedInfService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class MedInfServiceImpl implements MedInfService {
    @Autowired
    private MedInfDao medInfDao;

    @Override
    public List<MedInformation> findAll() throws Exception {
        return medInfDao.findAll();
    }
}
