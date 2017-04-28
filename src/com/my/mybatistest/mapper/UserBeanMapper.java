package com.my.mybatistest.mapper;

import com.my.mybatistest.vo.UserBean;
import com.my.mybatistest.vo.UserBeanExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserBeanMapper {
    long countByExample(UserBeanExample example);

    int deleteByExample(UserBeanExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(UserBean record);

    int insertSelective(UserBean record);

    List<UserBean> selectByExample(UserBeanExample example);

    UserBean selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") UserBean record, @Param("example") UserBeanExample example);

    int updateByExample(@Param("record") UserBean record, @Param("example") UserBeanExample example);

    int updateByPrimaryKeySelective(UserBean record);

    int updateByPrimaryKey(UserBean record);
}