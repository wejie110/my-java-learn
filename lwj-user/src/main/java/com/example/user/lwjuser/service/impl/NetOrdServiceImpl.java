package com.example.user.lwjuser.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.example.user.lwjuser.entity.NetOrd;
import com.example.user.lwjuser.mapper.NetOrdMapper;
import com.example.user.lwjuser.model.GroupOrdReqModel;
import com.example.user.lwjuser.service.NetOrdService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.google.common.base.Preconditions;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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

    @Override
    public List<NetOrd> getGroupOrders(GroupOrdReqModel reqModel) {
        Preconditions.checkArgument(StringUtils.isNotBlank(reqModel.getOrdType()),"订单类型不能为空");
        QueryWrapper<NetOrd> wrapper=new QueryWrapper<>();
        wrapper.eq("ord_type",reqModel.getOrdType());
        return netOrdMapper.selectList(wrapper);
    }
}
