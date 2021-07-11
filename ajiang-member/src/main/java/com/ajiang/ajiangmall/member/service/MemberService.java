package com.ajiang.ajiangmall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.ajiang.common.utils.PageUtils;
import com.ajiang.ajiangmall.member.entity.MemberEntity;

import java.util.Map;

/**
 * 会员
 *
 * @author ljj
 * @email 173024756@qq.com
 * @date 2021-07-11 13:22:00
 */
public interface MemberService extends IService<MemberEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

