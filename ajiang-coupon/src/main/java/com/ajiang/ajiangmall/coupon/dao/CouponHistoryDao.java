package com.ajiang.ajiangmall.coupon.dao;

import com.ajiang.ajiangmall.coupon.entity.CouponHistoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券领取历史记录
 * 
 * @author ljj
 * @email 173024756@qq.com
 * @date 2021-07-11 13:09:37
 */
@Mapper
public interface CouponHistoryDao extends BaseMapper<CouponHistoryEntity> {
	
}
