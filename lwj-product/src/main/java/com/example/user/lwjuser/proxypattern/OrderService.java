package com.example.user.lwjuser.proxypattern;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author wejie
 */
@Service
public class OrderService implements IOrderService {
    @Autowired
    private OrderDao orderDao;

    @Override
    public int creatOrder(Order order) {
        System.out.println("orderService层：创建订单到orderService开始");
        int i = orderDao.insert(order);
        System.out.println("orderService层：创建订单到orderService完成");
        return i;
    }
}
