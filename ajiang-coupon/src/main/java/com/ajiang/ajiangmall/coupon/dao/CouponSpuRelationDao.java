package com.ajiang.ajiangmall.coupon.dao;

import com.ajiang.ajiangmall.coupon.entity.CouponSpuRelationEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券与产品关联
 * 
 * @author ljj
 * @email 173024756@qq.com
 * @date 2021-07-11 13:09:37
 */
@Mapper
public interface CouponSpuRelationDao extends BaseMapper<CouponSpuRelationEntity> {
	
}
