package com.atguigu.gmall.user.mapper;


import com.atguigu.gmall.bean.UmsMember;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

/**
 * @Auther : zy
 * @Date : 2020/2/29
 * @Description : com.atguigu.gmall.user.mapper
 * @Version : 1.0
 **/

public interface UserMapper extends Mapper<UmsMember> {
    List<UmsMember> selectAllUser();
}
