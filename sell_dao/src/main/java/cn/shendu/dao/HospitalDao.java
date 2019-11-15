package cn.shendu.dao;

import cn.shendu.domain.Hospital;
import cn.shendu.domain.Orders;
import cn.shendu.domain.Patient;
import org.apache.ibatis.annotations.*;

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

    @Select("select * from Hospital where id = #{id}")
    @Results({
            @Result(id = true,property = "id",column = "id"),
            @Result(property = "hospitalName",column = "hospitalName"),
            @Result(property = "hospitalAddress",column = "hospitalAddress"),
            @Result(property = "hospitalPhone",column = "hospitalPhone"),
            @Result(property = "patients",column = "id",javaType = java.util.List.class,many = @Many(select = "cn.shendu.dao.PatientDao.findByHospitalId")),
            @Result(property = "orders",column = "id",javaType = java.util.List.class,many = @Many(select = "cn.shendu.dao.OrdersDao.findByHospitalId"))
    })
    Hospital findById(Integer id)throws Exception;

   @Select("select *from Patient where id not in(select patientId from pat_hos where hospitalid =#{hospitalid})")
    List<Patient> findOtherPatient(Integer hospitalid)throws Exception;

   @Insert("insert into pat_hos(patientId,hospitalId) values(#{patientId},#{hospitalId})")
    void addHosToPatient(@Param("hospitalId") Integer hospitalId,@Param("patientId") Integer patientId);

   @Select("select * from Orders where id not in(select ordersId from orders_hos where hospitalid=#{hospitalid})")
    List<Orders> findOtherOrders(Integer hospitalid);

   @Insert("insert into orders_hos(hospitalId,ordersId) values(#{hospitalId},#{ordersId})")
    void addOrdersToHospital(@Param("hospitalId") Integer hospitalId, @Param("ordersId") Integer ordersId);
}
