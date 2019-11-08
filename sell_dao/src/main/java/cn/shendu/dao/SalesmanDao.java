package cn.shendu.dao;

import cn.shendu.domain.Salesman;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface SalesmanDao {
    @Select("select * from salesman")
    List<Salesman> findAll()throws Exception;

}
