package cn.shendu.service;

import cn.shendu.domain.Permission;

import java.util.List;

public interface PermissionService {
    List<Permission> findAll()throws Exception;

    void save(Permission permission) throws Exception;

    Permission findById(Integer id) throws Exception;

    void deleteById(Integer id) throws Exception;

}
