package com.jc.wx.service.impl;

import com.alibaba.fastjson.JSONObject;
import com.jc.wx.dao.TNavigationMapper;
import com.jc.wx.service.TNavigationService;
import com.jc.wx.util.LoginUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Auther: 帅气的达
 * @Date: 2019/8/28 14:20
 * @Description:
 */
@Slf4j
@Service
public class TNavigationServiceImpl implements TNavigationService {

    @Resource
    TNavigationMapper tNavigationMapper;
    //获取导航栏
    @Override
    public JSONObject listnavigation() {
        JSONObject info = new JSONObject();
        List<JSONObject> list = tNavigationMapper.listnavigation();
        info.put("list", list);
        return LoginUtil.successJson(info);
    }
}
