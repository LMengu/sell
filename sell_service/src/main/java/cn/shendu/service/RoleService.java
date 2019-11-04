package cn.shendu.service;

import cn.shendu.domain.Role;

import java.util.List;

public interface RoleService {
    List<Role> findAll()throws Exception;
}
