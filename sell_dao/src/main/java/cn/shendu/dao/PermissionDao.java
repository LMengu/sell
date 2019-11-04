package cn.shendu.dao;

import cn.shendu.domain.Permission;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface PermissionDao {
    @Select("select * from permission")
    List<Permission> findAll()throws Exception;
}
