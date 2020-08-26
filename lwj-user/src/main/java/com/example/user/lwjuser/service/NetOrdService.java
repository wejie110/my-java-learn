package com.example.user.lwjuser.service;

import com.example.user.lwjuser.entity.NetOrd;
import com.baomidou.mybatisplus.extension.service.IService;
import com.example.user.lwjuser.model.GroupOrdReqModel;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author lwj
 * @since 2020-08-26
 */
public interface NetOrdService extends IService<NetOrd> {

    List<NetOrd> getGroupOrders(GroupOrdReqModel reqModel);

}
