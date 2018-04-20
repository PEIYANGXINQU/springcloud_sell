package com.imooc.product.exception;

import com.imooc.product.enums.ResultEnum;

/**
 * @author hellozjf
 * @date 2018/4/19 1:32
 */
public class ProductException extends RuntimeException {
    private Integer code;

    public ProductException(Integer code, String message) {
        super(message);
        this.code = code;
    }

    public ProductException(ResultEnum resultEnum) {
        this(resultEnum.getCode(), resultEnum.getMessage());
    }
}
