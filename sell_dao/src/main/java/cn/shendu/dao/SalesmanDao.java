package cn.shendu.dao;

import cn.shendu.domain.Hospital;
import cn.shendu.domain.Salesman;
import org.apache.ibatis.annotations.*;

import java.util.List;

public interface SalesmanDao {

    @Select("select * from salesman")
    List<Salesman> findAll()throws Exception;

    @Select("select * from salesman where id =#{id}")
    @Results({
            @Result(id = true, property = "id", column = "id"),
            @Result(property = "salesmanName", column = "salesmanName"),
            @Result(property = "salesmanSex", column = "salesmanSex"),
            @Result(property = "salesmanAge", column = "salesmanAge"),
            @Result(property = "salesmanAddress", column = "salesmanAddress"),
            @Result(property = "salesmanPhone", column = "salesmanPhone"),
            @Result(property = "hospitals", column = "id",javaType = java.util.List.class,many = @Many(select = "cn.shendu.dao.HospitalDao.findBySalemanId"))
    })
    Salesman findById(Integer id) throws Exception;
    @Select("select * from Hospital where id not in(select hospitalId from hos_sales where salesmanid=#{salesmanid})")
    List<Hospital> findOtherHospital(Integer salesmanid)throws Exception;

    @Insert("insert into hos_sales(salesmanId,hospitalId) values(#{salesmanId},#{hospitalId})")
    void addHosToSales(@Param("salesmanId") Integer salesmanId, @Param("hospitalId") Integer hospitalId);

}
