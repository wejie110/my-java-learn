package com.example.user.lwjuser.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.example.user.lwjuser.entity.NetOrd;
import com.example.user.lwjuser.entity.ShopStk;
import com.example.user.lwjuser.mapper.NetOrdMapper;
import com.example.user.lwjuser.model.GroupOrdReqModel;
import com.example.user.lwjuser.service.NetOrdService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.user.lwjuser.service.ShopStkService;
import com.google.common.base.Preconditions;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sun.nio.ch.Net;

import java.util.ArrayList;
import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author lwj
 * @since 2020-08-26
 */
@Service
public class NetOrdServiceImpl extends ServiceImpl<NetOrdMapper, NetOrd> implements NetOrdService {
    @Autowired
    NetOrdMapper netOrdMapper;

    @Autowired
    ShopStkService shopStkService;


    @Override
    public List<NetOrd> getGroupOrders(GroupOrdReqModel reqModel) {
        // todo 异常报错暂时不能返回到调用方
        Preconditions.checkArgument(StringUtils.isNotBlank(reqModel.getOrdType()),"订单类型不能为空");
        QueryWrapper<NetOrd> wrapper=new QueryWrapper<>();
        wrapper.eq("ord_type",reqModel.getOrdType());
        NetOrd netOrd =new NetOrd();
        List<NetOrd> orders=netOrd.selectList(wrapper);
        System.out.println("----------------查询完成");
        orders.forEach(model->{
            ShopStk shopStk =new ShopStk();
            shopStk.setPluId(model.getOrdNo());
            shopStk.setShopCode(model.getShopCode());
            shopStk.setPluCode("1");
            shopStkService.saveOrUpdate(shopStk);
        });
        System.out.println("----------------写入完成");
        return orders; //ar 领域模型模式 Active Record(活动记录)
//        return netOrdMapper.selectList(wrapper);
    }
}
