package com.example.user.lwjuser.proxypattern.staticProxy;

import com.example.user.lwjuser.proxypattern.IOrderService;
import com.example.user.lwjuser.proxypattern.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author wejie
 */
@Service
public class OrderServiceStaticProxy implements IOrderService {
    @Autowired
    @Qualifier("orderService")
    private IOrderService orderService;

    private SimpleDateFormat yearFormat = new SimpleDateFormat("yyyy");


    @Override
    public int creatOrder(Order order) {
        before();
        Long time = order.getCreatTime();
        Integer router = Integer.valueOf(yearFormat.format(new Date(time)));
        System.out.println("proxy层：静态代理类自动分配到:db_"+router+"数据源处理数据");
        DynamicDataSourceEntry.set(router);
        int i= orderService.creatOrder(order);
        after();
        return i;
    }

    private void before(){
        System.out.println("proxy层：创建订单前处理");
    }

    private void after(){
        System.out.println("proxy层：订单创建完成后处理");
    }
}
