package com.jc.wx.controller;

import com.alibaba.fastjson.JSONObject;
import com.jc.wx.service.TCommentService;
import com.jc.wx.util.LoginUtil;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

/**
 * @Auther: 帅气的达
 * @Date: 2019/9/7 16:30
 * @Description:
 */
@RestController
@RequestMapping("/comment")
public class TCommentController {
    @Resource
    TCommentService tCommentService;
    //获取用户收藏的贴子
    @RequestMapping("/listcollectionbase")
    public JSONObject listcollectionbase(HttpServletRequest request){
        return tCommentService.listcollectionbase(LoginUtil.request2Json(request));
    }
    //取消收藏
    @RequestMapping("/deletecollectionbase")
    public JSONObject deletecollectionbase(@RequestBody JSONObject requestJson){
        LoginUtil.hasAllRequired(requestJson, "ID");
        return tCommentService.deletecollectionbase(requestJson);
    }
}
