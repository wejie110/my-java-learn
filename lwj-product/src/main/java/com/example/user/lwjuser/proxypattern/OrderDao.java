package com.example.user.lwjuser.proxypattern;

import com.example.user.lwjuser.proxypattern.staticProxy.DynamicDataSourceEntry;
import org.springframework.stereotype.Component;

/**
 * @author wejie
 */
@Component
public class OrderDao {
    public int insert(Order order){
        System.out.println("dao层：当前处理的数据源信息："+ DynamicDataSourceEntry.get());
        return 1;
    }
}
