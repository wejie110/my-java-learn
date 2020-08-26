package com.example.user.lwjuser.controller;


import com.alibaba.fastjson.JSONObject;
import com.example.user.lwjuser.entity.NetOrd;
import com.example.user.lwjuser.model.GroupOrdReqModel;
import com.example.user.lwjuser.service.NetOrdService;
import com.google.common.base.Preconditions;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author lwj
 * @since 2020-08-26
 */
@RestController
@RequestMapping("/net-ord")
public class NetOrdController {
    @Autowired
    NetOrdService netOrdService;

    @PostMapping("/query")
    public List<NetOrd> getGroupOrd(String params) throws Exception{
        GroupOrdReqModel reqModel = JSONObject.parseObject(params,GroupOrdReqModel.class);
        return netOrdService.getGroupOrders(reqModel);
    }

}
