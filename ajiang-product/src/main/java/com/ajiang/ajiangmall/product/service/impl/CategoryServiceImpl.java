package com.ajiang.ajiangmall.product.service.impl;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ajiang.common.utils.PageUtils;
import com.ajiang.common.utils.Query;

import com.ajiang.ajiangmall.product.dao.CategoryDao;
import com.ajiang.ajiangmall.product.entity.CategoryEntity;
import com.ajiang.ajiangmall.product.service.CategoryService;


@Service("categoryService")
public class CategoryServiceImpl extends ServiceImpl<CategoryDao, CategoryEntity> implements CategoryService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<CategoryEntity> page = this.page(
                new Query<CategoryEntity>().getPage(params),
                new QueryWrapper<CategoryEntity>()
        );

        return new PageUtils(page);
    }

    @Override
    public List<CategoryEntity> listAll() {
        List<CategoryEntity> categoryEntityList = baseMapper.selectList(new QueryWrapper<>(null));
        List<CategoryEntity> collect = categoryEntityList.stream().filter(item -> {
            return item.getParentCid() == 0;
        }).map(menu ->{
            menu.setChildren(getChildren(menu,categoryEntityList));
            return menu;
        }).sorted((menu1,menu2) ->{
            return (menu1.getSort() == null?0:menu1.getSort()) - (menu2.getSort() == null ? 0 :menu2.getSort());
        }).collect(Collectors.toList());
        return collect;
    }

    public List<CategoryEntity> getChildren(CategoryEntity collect,List<CategoryEntity> all){
        List<CategoryEntity> collect1 = all.stream().filter((item) -> {
            return item.getParentCid() == collect.getCatId();
        }).map(menu ->{
            menu.setChildren(getChildren(menu,all));
            return menu;
        }).sorted((menu1,menu2) ->{
            return (menu1.getSort() == null?0:menu1.getSort()) - (menu2.getSort() == null ? 0 :menu2.getSort());
        }).collect(Collectors.toList());
        return collect1;

    }


}