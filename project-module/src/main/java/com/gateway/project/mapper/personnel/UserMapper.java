package com.gateway.project.mapper.personnel;

import com.gateway.project.domain.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectProvider;

import java.util.List;

/**
 * @author: lipengcheng3
 * @create: 2018-09-03 16:49
 * @description:
 **/
@Mapper
public interface UserMapper {

    @Select("select * from user where id = #{id}")
    User getUserById(int id);

    @Select("select * from user")
    List<User> getAllUsers();

    @Select("select * from user where name=#{userName}")
    List<User> getUsersByName(String userName);

    @Select("select * from user where age between #{minAge} and #{maxAge}")
    List<User> getUsersByAgeRangeClosed(int minAge, int maxAge);

    @SelectProvider(type = User.class, method = "getUsersByAgeRange")
    List<User> getUsersByAgeRange(int minAge, boolean minAgeClosed, int maxAge, boolean maxAgeClosed);

}
