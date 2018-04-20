package com.imooc.order.enums;

import lombok.Getter;

/**
 * @author hellozjf
 * @date 2018/4/18 19:38
 */
@Getter
public enum OrderStatusEnum {
    NEW(0, "新订单"),
    FINISH(1, "完结"),
    CANCEL(2, "取消"),
    ;

    private Integer code;
    private String message;

    OrderStatusEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}
