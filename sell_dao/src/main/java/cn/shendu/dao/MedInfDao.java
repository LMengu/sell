package cn.shendu.dao;


import cn.shendu.domain.MedInformation;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface MedInfDao {

    @Select("select * from medInformation")
    public List<MedInformation> findAll() throws Exception;
}
