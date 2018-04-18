package com.imooc.product.utils;

import com.imooc.product.vo.ResultVO;

/**
 * @author hellozjf
 * @date 2018/4/18 1:16
 */
public class ResultVOUtil {

    public static ResultVO success(Object object) {
        ResultVO resultVO = new ResultVO();
        resultVO.setData(object);
        resultVO.setCode(0);
        resultVO.setMsg("成功");
        return resultVO;
    }
}
