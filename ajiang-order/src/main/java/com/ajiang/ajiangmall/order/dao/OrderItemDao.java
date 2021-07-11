package com.ajiang.ajiangmall.order.dao;

import com.ajiang.ajiangmall.order.entity.OrderItemEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单项信息
 * 
 * @author ljj
 * @email 173024756@qq.com
 * @date 2021-07-11 13:16:24
 */
@Mapper
public interface OrderItemDao extends BaseMapper<OrderItemEntity> {
	
}
