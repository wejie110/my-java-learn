package com.example.user.lwjuser.proxypattern;


import lombok.Data;

/**
 * @author wejie
 */
@Data
public class Order {
    private Object orderInfo;
    private Long creatTime;
    private String id;
}
