package cn.shendu.dao;

import cn.shendu.domain.Patient;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface PatientDao {
    @Select("select * from patient")
    public List<Patient> findAll()throws Exception;

    @Select("select * from Patient where id in(select patientId from pat_hos where hospitalId=#{hospital})")
    @Results({
            @Result(id = true,property = "id",column = "id"),
            @Result(property = "patientName",column = "patientName"),
            @Result(property = "patientAge",column = "patientAge"),
            @Result(property = "patientAddress",column = "patientAddress"),
            @Result(property = "patientCase",column = "patientCase"),
    })
    List<Patient> findByHospitalId(Integer HospitalId) throws  Exception;

}
