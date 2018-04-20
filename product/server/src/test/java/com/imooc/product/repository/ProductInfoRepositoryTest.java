package com.imooc.product.repository;

import com.imooc.product.ProductApplicationTests;
import com.imooc.product.dataobject.ProductInfo;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Arrays;
import java.util.List;

/**
 * @author hellozjf
 * @date 2018/4/18 0:15
 */
public class ProductInfoRepositoryTest extends ProductApplicationTests {

    @Autowired
    private ProductInfoRepository productInfoRepository;

    @Test
    public void findByProductStatus() {
        List<ProductInfo> productInfoList = productInfoRepository.findByProductStatus(0);
        Assert.assertTrue(productInfoList.size() > 0);
    }

    @Test
    public void findByProductIdIn() {
        List<String> productIdList = Arrays.asList("157875196366160022", "157875227953464068");
        List<ProductInfo> productInfoList = productInfoRepository.findByProductIdIn(productIdList);
        Assert.assertTrue(productInfoList.size() > 0);
    }
}