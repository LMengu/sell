package cn.shendu.dao;

import cn.shendu.domain.Orders;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface OrdersDao {
    @Select("select * from orders")
    public List<Orders> findAll()throws Exception;
}
