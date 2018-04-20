package com.imooc.order.service;

import com.imooc.order.dto.OrderDTO;

/**
 * @author hellozjf
 * @date 2018/4/18 20:08
 */
public interface OrderService {

    /**
     * 创建订单
     * @param orderDTO
     * @return
     */
    OrderDTO createOrder(OrderDTO orderDTO);
}
