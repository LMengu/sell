package cn.shendu.dao;

import cn.shendu.domain.Hospital;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface HospitalDao {
    @Select("select * from hospital")
    public List<Hospital> findAll() throws Exception;

    @Select("select * from Hospital where id in(select hospitalId from hos_sales where salesmanId=#{salesmanId})")
    @Results({
            @Result(id = true,property = "id",column = "id"),
            @Result(property = "hospitalName",column = "hospitalName"),
            @Result(property = "hospitalAddress",column = "hospitalAddress"),
            @Result(property = "hospitalPhone",column = "hospitalPhone"),
    })
    public List<Hospital> findBySalemanId(Integer salesmanId) throws  Exception;
}
