package com.example.user.lwjuser.controller;

import com.example.user.lwjuser.proxypattern.IOrderService;
import com.example.user.lwjuser.proxypattern.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author wejie
 */
@RestController
public class TestController {

    @Autowired
    @Qualifier("orderServiceStaticProxy")
    private IOrderService orderService;

    @GetMapping("/test/staticProxy")
    public void creatOrder() throws ParseException {
        Order order = new Order();
        SimpleDateFormat sdf =  new SimpleDateFormat("yyyy/MM/dd");
        Date date = sdf.parse("2020/01/01");
        order.setCreatTime(date.getTime());

        orderService.creatOrder(order);

    }
}
