package com.ajiang.ajiangmall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.ajiang.common.utils.PageUtils;
import com.ajiang.ajiangmall.coupon.entity.SeckillSkuRelationEntity;

import java.util.Map;

/**
 * 秒杀活动商品关联
 *
 * @author ljj
 * @email 173024756@qq.com
 * @date 2021-07-11 13:09:37
 */
public interface SeckillSkuRelationService extends IService<SeckillSkuRelationEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

