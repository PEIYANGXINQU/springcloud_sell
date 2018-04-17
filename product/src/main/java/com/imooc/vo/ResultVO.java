package com.imooc.vo;

import lombok.Data;

/**
 * http请求返回的最外层对象
 * @author hellozjf
 * @date 2018/4/18 0:50
 */
@Data
public class ResultVO<T> {

    /**
     * 错误码
     */
    private Integer code;

    /**
     * 提示信息
     */
    private String msg;

    /**
     * 具体的内容
     */
    private T data;
}
