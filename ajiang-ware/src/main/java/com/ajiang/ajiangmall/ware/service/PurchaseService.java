package com.ajiang.ajiangmall.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.ajiang.common.utils.PageUtils;
import com.ajiang.ajiangmall.ware.entity.PurchaseEntity;

import java.util.Map;

/**
 * 采购信息
 *
 * @author ljj
 * @email 173024756@qq.com
 * @date 2021-07-11 13:25:39
 */
public interface PurchaseService extends IService<PurchaseEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

