package com.jc.wx.dao;

import com.alibaba.fastjson.JSONObject;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @Auther: 帅气的达
 * @Date: 2019/8/28 14:19
 * @Description: 导航栏
 */
@Mapper
public interface TNavigationMapper {
    //获取导航栏
    List<JSONObject> listnavigation();

}
