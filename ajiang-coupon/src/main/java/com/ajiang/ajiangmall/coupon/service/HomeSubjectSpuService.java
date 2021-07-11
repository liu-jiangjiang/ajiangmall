package com.ajiang.ajiangmall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.ajiang.common.utils.PageUtils;
import com.ajiang.ajiangmall.coupon.entity.HomeSubjectSpuEntity;

import java.util.Map;

/**
 * 专题商品
 *
 * @author ljj
 * @email 173024756@qq.com
 * @date 2021-07-11 13:09:37
 */
public interface HomeSubjectSpuService extends IService<HomeSubjectSpuEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

