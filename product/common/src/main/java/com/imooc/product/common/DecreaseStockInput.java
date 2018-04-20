package com.imooc.product.common;

import lombok.Data;

/**
 * @author hellozjf
 * @date 2018/4/21 0:46
 */
@Data
public class DecreaseStockInput {

    private String productId;

    private Integer productQuantity;

    public DecreaseStockInput() {

    }

    public DecreaseStockInput(String productId, Integer productQuantity) {
        this.productId = productId;
        this.productQuantity = productQuantity;
    }
}
