package com.atguigu.gmall.service;


import com.atguigu.gmall.bean.UmsMember;
import com.atguigu.gmall.bean.UmsMemberReceiveAddress;

import java.util.List;

/**
 * @Auther : zy
 * @Date : 2020/2/29
 * @Description : com.atguigu.gmall.user.service
 * @Version : 1.0
 **/
public interface UserService {

    List<UmsMember> getAllUser();

    List<UmsMemberReceiveAddress> getReceiveAddressByMemberId(String memberId);
}
