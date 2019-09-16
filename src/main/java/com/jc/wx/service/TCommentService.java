package com.jc.wx.service;

import com.alibaba.fastjson.JSONObject;

/**
 * @Auther: 帅气的达
 * @Date: 2019/9/7 16:31
 * @Description:
 */
public interface TCommentService {
    //获取用户收藏的贴子
    JSONObject listcollectionbase(JSONObject jsonObject);
    //取消收藏
    JSONObject deletecollectionbase(JSONObject jsonObject);
}
