package com.imooc.order.utils;

import java.util.Random;

/**
 * @author hellozjf
 * @date 2018/4/18 20:28
 */
public class KeyUtil {

    /**
     * 生成唯一的主键
     * 格式: 时间戳+随机数
     */
    public static synchronized String genUniqueKey() {
        Random random = new Random();
        Integer number = random.nextInt(900000) + 100000;
        return System.currentTimeMillis() + String.valueOf(number);
    }
}
