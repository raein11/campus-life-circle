package com.dzdp.service;

import com.dzdp.dto.Result;
import com.dzdp.entity.Shop;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * 商铺服务类接口
 * @Author israein
 * @date 14:35 2023/5/8
 **/
public interface IShopService extends IService<Shop> {
    /**
     * 根据id查询商铺缓存
     * @Author israein
     * @date 14:35 2023/5/8
     * @param id
     * @return com.dzdp.dto.Result
     **/
    Result queryById(Long id);

    /**
     * 更新商铺信息
     * @Author israein
     * @date 15:45 2023/5/8
     * @param shop
     * @return com.dzdp.dto.Result
     **/
    Result update(Shop shop);
}
