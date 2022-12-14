package com.yuxitang.mall.service;

import com.github.pagehelper.PageInfo;
import com.yuxitang.mall.vo.OrderVo;
import com.yuxitang.mall.vo.ResponseVo;

/**
 * Created by 廖师兄
 */
public interface IOrderService {

    ResponseVo<OrderVo> create(Integer uid, Integer shippingId);

    ResponseVo<PageInfo> list(Integer uid, Integer pageNum, Integer pageSize);

    ResponseVo<OrderVo> detail(Integer uid, Long orderNo);

    ResponseVo cancel(Integer uid, Long orderNo);

    void paid(Long orderNo);
}