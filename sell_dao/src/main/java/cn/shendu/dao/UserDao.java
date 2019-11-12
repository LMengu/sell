package cn.shendu.dao;

import cn.shendu.domain.Role;
import cn.shendu.domain.UserInfo;
import org.apache.ibatis.annotations.*;

import java.util.List;

public interface UserDao {
    @Select("select * from users")
    List<UserInfo> findAll()throws Exception;


    @Insert("insert into users_role(userId,roleId) values(#{userId},#{roleId})")
    void addRoleToUser(@Param("userId") Integer userId,@Param("roleId") Integer roleId);

    @Insert("insert to users(username,password,contact,address,power) values(#{username},#{password},#{contact},#{address},#{power})")
    void save(UserInfo userInfo);

    @Select("select * from users where id= #{id}")
    @Results({
            @Result(id = true, property = "id", column = "id"),
            @Result(property = "username", column = "username"),
            @Result(property = "password", column = "password"),
            @Result(property = "contact", column = "contact"),
            @Result(property = "address", column = "address"),
            @Result(property = "power", column = "power"),
            @Result(property = "roles",column = "id",javaType = java.util.List.class,many = @Many(select = "cn.shendu.dao.RoleDao.findRoleByUserId"))
    })


    UserInfo findById(Integer id);

    @Select("select * from role where id not in(select roleId from users_role where userId=#{userId})")
    List<Role> findOtherRoles(Integer userId);


    @Select("select * from users where username=#{username}")
    @Results({
            @Result(id = true, property = "id", column = "id"),
            @Result(property = "username", column = "username"),
            @Result(property = "password", column = "password"),
            @Result(property = "contact", column = "contact"),
            @Result(property = "address", column = "address"),
            @Result(property = "power", column = "power"),
            @Result(property = "roles",column = "id",javaType = java.util.List.class,many = @Many(select = "cn.shendu.dao.RoleDao.findRoleByUserId"))
    })
    UserInfo findByUsername(String username);
}
