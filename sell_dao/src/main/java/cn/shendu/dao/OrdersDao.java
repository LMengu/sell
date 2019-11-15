package cn.shendu.dao;

import cn.shendu.domain.Orders;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface OrdersDao {
    @Select("select * from orders")
    public List<Orders> findAll()throws Exception;

    @Select("select * from Orders where id in(select ordersId from orders_hos where hospitalId=#{hospital})")
    @Results({
            @Result(id = true,property = "id",column = "id"),
            @Result(property = "drugsName",column = "drugsName"),
            @Result(property = "drugsSpeciality",column = "drugsSpeciality"),
            @Result(property = "drugsPrice",column = "drugsPrice"),
            @Result(property = "drugsNumber",column = "drugsNumber"),
    })
    List<Orders> findByHospitalId(Integer HospitalId) throws  Exception;
}
