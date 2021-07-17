package com.ajiang.ajiangmall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.ajiang.common.utils.PageUtils;
import com.ajiang.ajiangmall.product.entity.CategoryEntity;

import java.util.List;
import java.util.Map;

/**
 * ??Ʒ???????
 *
 * @author ljj
 * @email 173024756@qq.com
 * @date 2021-07-10 18:00:30
 */
public interface CategoryService extends IService<CategoryEntity> {

    PageUtils queryPage(Map<String, Object> params);

    List<CategoryEntity> listAll();
}

