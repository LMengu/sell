package cn.shendu.service;

import cn.shendu.domain.Patient;

import java.util.List;

public interface PatientService {
    public List<Patient> findAll()throws Exception;
}
