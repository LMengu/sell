package cn.shendu.service;

import cn.shendu.domain.Hospital;
import java.util.List;


public interface HospitalService {

    public List<Hospital> findAll()throws Exception;
}
