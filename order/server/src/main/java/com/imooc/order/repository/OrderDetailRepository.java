package com.imooc.order.repository;

import com.imooc.order.dataobject.OrderDetail;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author hellozjf
 * @date 2018/4/18 19:34
 */
public interface OrderDetailRepository extends JpaRepository<OrderDetail, String> {
}
