package cn.shendu.dao;

import cn.shendu.domain.Hospital;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface HospitalDao {
    @Select("select * from hospital")
    public List<Hospital> findAll() throws Exception;
}
