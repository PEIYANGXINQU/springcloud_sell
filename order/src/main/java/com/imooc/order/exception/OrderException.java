package com.imooc.order.exception;

import com.imooc.order.enums.ResultEnum;

/**
 * @author hellozjf
 * @date 2018/4/18 20:41
 */
public class OrderException extends RuntimeException {

    private Integer code;

    public OrderException(Integer code, String message) {
        super(message);
        this.code = code;
    }

    public OrderException(ResultEnum resultEnum) {
        this(resultEnum.getCode(), resultEnum.getMessage());
    }
}
