package cn.shendu.service.impl;

import cn.shendu.dao.SalesmanDao;
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
}
