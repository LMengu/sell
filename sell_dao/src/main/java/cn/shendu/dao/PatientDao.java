package cn.shendu.dao;

import cn.shendu.domain.Patient;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface PatientDao {
    @Select("select * from patient")
    public List<Patient> findAll()throws Exception;
}
