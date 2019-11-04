package cn.shendu.service;

import cn.shendu.domain.Permission;

import java.util.List;

public interface PermissionService {
    List<Permission> findAll()throws Exception;
}
