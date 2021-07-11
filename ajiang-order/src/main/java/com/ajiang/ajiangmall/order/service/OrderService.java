package com.ajiang.ajiangmall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.ajiang.common.utils.PageUtils;
import com.ajiang.ajiangmall.order.entity.OrderEntity;

import java.util.Map;

/**
 * 订单
 *
 * @author ljj
 * @email 173024756@qq.com
 * @date 2021-07-11 13:16:24
 */
public interface OrderService extends IService<OrderEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

