package cn.shendu.service;


import cn.shendu.domain.UserInfo;


import java.util.List;

public interface UserService  {

    List<UserInfo> findAll()throws Exception;
}
