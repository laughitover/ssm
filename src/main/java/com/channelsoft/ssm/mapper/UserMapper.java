package com.channelsoft.ssm.mapper;

import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.type.JdbcType;
import org.springframework.stereotype.Repository;

import com.channelsoft.ssm.domain.User;
@Repository
public interface UserMapper {
    int deleteByPrimaryKey(Integer uid);

    int insert(User record);

    int insertSelective(User record);

    @Select("select uid, name, password, salt, state, username, credentials_salt "
    		+ "from user_info where uid = #{uid}")
    @Results(value={
    		@Result(column="uid",property="uid", javaType = Integer.class, jdbcType = JdbcType.INTEGER),
    		@Result(column="name",property="name", javaType = String.class, jdbcType = JdbcType.VARCHAR),
    		@Result(column="password",property="password", javaType = String.class, jdbcType = JdbcType.VARCHAR),
    		@Result(column="salt",property="salt", javaType = String.class, jdbcType = JdbcType.VARCHAR),
    		@Result(column="state",property="state", javaType = Integer.class, jdbcType = JdbcType.INTEGER),
    		@Result(column="username",property="username", javaType = String.class, jdbcType = JdbcType.VARCHAR),
    		@Result(column="credentials_salt",property="credentialsSalt", javaType = String.class, jdbcType = JdbcType.VARCHAR),
    })
    User selectByPrimaryKey(Integer uid);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
}