package com.imooc.miaosha.dao;

import org.apache.ibatis.annotations.*;

import com.imooc.miaosha.domain.MiaoshaUser;

@Mapper
public interface MiaoshaUserDao {

    @Select("select * from miaosha_user where id = #{id}")
    public MiaoshaUser getById(@Param("id") long id);

    @Update("update miaosha_user set password = #{password} where id = #{id}")
    public void update(MiaoshaUser toBeUpdate);


    @Insert("INSERT INTO miaosha_user(id,nickname,pwd,salt) VALUES(#{id},#{nickname},#{password},#{salt})")
    public int insert(MiaoshaUser miaoshaUser);
}
