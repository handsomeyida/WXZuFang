package com.jc.wx.dao;

import com.alibaba.fastjson.JSONObject;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @Auther: 帅气的达
 * @Date: 2019/9/7 16:32
 * @Description:
 */
@Repository
public interface TCommentMapper {
    //获取用户收藏的贴子
    List<JSONObject> listcollectionbase(JSONObject jsonObject);
    //取消收藏
    int deletecollectionbase(JSONObject jsonObject);
}
