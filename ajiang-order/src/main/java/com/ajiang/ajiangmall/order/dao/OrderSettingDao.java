package com.ajiang.ajiangmall.order.dao;

import com.ajiang.ajiangmall.order.entity.OrderSettingEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单配置信息
 * 
 * @author ljj
 * @email 173024756@qq.com
 * @date 2021-07-11 13:16:24
 */
@Mapper
public interface OrderSettingDao extends BaseMapper<OrderSettingEntity> {
	
}
