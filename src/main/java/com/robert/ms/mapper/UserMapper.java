package com.robert.ms.mapper;

import com.robert.ms.domain.User;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * <p>
 * Mapper接口
 * </p>
 *
 * @author robert
 * @since 2018-01-22
 */
@Mapper
public interface UserMapper extends BaseMapper<User> {

}