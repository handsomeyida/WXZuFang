package com.jc.wx.service.impl;

import com.alibaba.fastjson.JSONObject;
import com.jc.wx.dao.TCommentMapper;
import com.jc.wx.service.TCommentService;
import com.jc.wx.util.LoginUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Auther: 帅气的达
 * @Date: 2019/9/7 16:31
 * @Description:
 */
@Slf4j
@Service
public class TCommentServiceImpl implements TCommentService {
    @Resource
    TCommentMapper tCommentMapper;

    //获取用户收藏的帖子
    @Override
    public JSONObject listcollectionbase(JSONObject jsonObject) {
        JSONObject info = new JSONObject();
        List<JSONObject> list = tCommentMapper.listcollectionbase(jsonObject);
        info.put("list", list);
        return LoginUtil.successJson(info);
    }
    //取消收藏
    @Override
    public JSONObject deletecollectionbase(JSONObject jsonObject) {
        tCommentMapper.deletecollectionbase(jsonObject);
        return LoginUtil.successJson();
    }
}
