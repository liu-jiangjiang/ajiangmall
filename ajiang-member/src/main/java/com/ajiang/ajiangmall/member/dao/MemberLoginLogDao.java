package com.ajiang.ajiangmall.member.dao;

import com.ajiang.ajiangmall.member.entity.MemberLoginLogEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员登录记录
 * 
 * @author ljj
 * @email 173024756@qq.com
 * @date 2021-07-11 13:22:00
 */
@Mapper
public interface MemberLoginLogDao extends BaseMapper<MemberLoginLogEntity> {
	
}
