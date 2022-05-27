package com.cpt202a19.reservation.service;

import com.cpt202a19.reservation.entity.Order;

/** 处理订单和订单数据的业务层接口 */
public interface IOrderService {
    /**
     * 创建订单
     * @param rid inforamtion的id
     * @param cids 即将预定数据在表中的id
     * @param uid 当前登录的用户的id
     * @param username 当前登录的用户名
     * @return 成功创建的数据
     */
    Order create(Integer rid, Integer[] cids, Integer uid, String username);
}
