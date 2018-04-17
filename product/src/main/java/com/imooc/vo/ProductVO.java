package com.imooc.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

/**
 * @author hellozjf
 * @date 2018/4/18 0:53
 */
@Data
public class ProductVO {

    /**
     * 类目名字
     */
    @JsonProperty("name")
    private String categoryName;

    /**
     * 类目类别
     */
    @JsonProperty("type")
    private Integer categoryType;

    @JsonProperty("foods")
    List<ProductInfoVO> productInfoVOList;
}
